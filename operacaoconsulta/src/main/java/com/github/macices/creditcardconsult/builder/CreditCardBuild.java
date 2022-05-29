package com.github.macices.creditcardconsult.builder;

import com.github.macices.creditcardconsult.communication.http.client.OpenBankingFeignClient;
import com.github.macices.creditcardconsult.communication.http.controller.dto.CreditCardDto;
import com.github.macices.creditcardconsult.core.dto.creditcard.RewardsProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CreditCardBuild {

    List<String> names = new ArrayList<>();
    List<RewardsProgram> rewardsProgram = new ArrayList<>();


    @Autowired
    OpenBankingFeignClient openBankingFeignClient;

    public List<CreditCardDto> build() {

        List<CreditCardDto> creditCardDtoList = new ArrayList<>();
        getParameters(names, rewardsProgram);
        Map<String, RewardsProgram> parameters;

        parameters = zipToMap(names, rewardsProgram);
        parameters.forEach((name, rewardProgram) -> creditCardDtoList.add(new CreditCardDto(name, rewardProgram)));
//        parameters.forEach(CreditCardDto::new);

        return creditCardDtoList;
    }

    private void getParameters(List<String> names, List<RewardsProgram> rewardsProgram) {
        openBankingFeignClient.buscaCreditCard().getData().getBrand().getCompanies()
                .forEach(company -> company.getPersonalCreditCards()
                        .forEach(personalCreditCard -> names.add(personalCreditCard.getName())));

        openBankingFeignClient.buscaCreditCard().getData().getBrand().getCompanies()
                .forEach(company -> company.getPersonalCreditCards()
                        .forEach(personalCreditCard -> rewardsProgram.add(personalCreditCard.getRewardsProgram())));
    }

    private <K, V> Map<K, V> zipToMap(List<K> keys, List<V> values) {
        return IntStream.range(0, keys.size()).boxed()
                .collect(Collectors.toMap(keys::get, values::get, (key1, key2) -> key1));
    }

}
