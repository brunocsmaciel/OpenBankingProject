package com.github.macices.creditcardconsult.core.dto.creditcard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TermsConditions {
    public String minimumFeeRate;
    public String additionalInfo;
    public String elegibilityCriteriaInfo;
    public String closingProcessInfo;
}
