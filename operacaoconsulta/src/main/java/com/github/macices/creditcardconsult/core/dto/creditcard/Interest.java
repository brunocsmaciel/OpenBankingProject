package com.github.macices.creditcardconsult.core.dto.creditcard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.macices.creditcardconsult.core.dto.InterestRate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interest {
    public List<InterestRate> rates;
    public List<InstalmentRate> instalmentRates;
    public List<OtherCredit> otherCredits;
}
