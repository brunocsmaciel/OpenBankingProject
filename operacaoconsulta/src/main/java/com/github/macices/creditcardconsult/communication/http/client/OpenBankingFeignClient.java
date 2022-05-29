package com.github.macices.creditcardconsult.communication.http.client;

import com.github.macices.creditcardconsult.communication.http.client.dto.CreditCardClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "${api.name.open-banking}", url = "${api.base.url.open-banking}")
public interface OpenBankingFeignClient {

    @GetMapping(value = "${api.url.endpoint.credit-cards}")
    CreditCardClientDto buscaCreditCard();
}
