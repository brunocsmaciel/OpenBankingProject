package com.github.macices.creditcardconsult.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.macices.creditcardconsult.core.dto.creditcard.PersonalCreditCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

    public String cnpjNumber;
    public String name;
    public Object urlComplementaryList;
    public List<PersonalCreditCard> personalCreditCards;
}
