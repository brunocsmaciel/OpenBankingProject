package com.github.macices.creditcardconsult.core.dto.creditcard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.macices.creditcardconsult.core.dto.Fees;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalCreditCard {

    public String name;
    public Identification identification;
    public RewardsProgram rewardsProgram;
    public Fees fees;
    public Interest interest;
    public TermsConditions termsConditions;
}
