package com.github.macices.creditcardconsult.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Service {

    public String name;
    public String code;
    public String chargingTriggerInfo;
    public List<Price> prices;
    public Minimum minimum;
    public Maximum maximum;
}

