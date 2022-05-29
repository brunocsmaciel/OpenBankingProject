package com.github.macices.creditcardconsult.core.dto.creditcard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.macices.creditcardconsult.core.dto.Application;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstalmentRate {
    public String referentialRateIndexer;
    public String rate;
    public List<Application> applications;
    public String minimumRate;
    public String maximumRate;
}
