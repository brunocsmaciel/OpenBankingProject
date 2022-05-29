package com.github.macices.creditcardconsult.communication.http.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.macices.creditcardconsult.core.dto.Brand;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    public Brand brand;
}
