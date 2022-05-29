package com.github.macices.creditcardconsult.communication.http.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAPI<T> {

    private T data;

    public static <T> ResponseAPI<T> of(T t){
        return new ResponseAPI<>(t);
    }
}
