package com.github.macices.creditcardconsult.communication.http.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.macices.creditcardconsult.core.dto.creditcard.RewardsProgram;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditCardDto {

    String name;
    RewardsProgram rewardProgram;
}
