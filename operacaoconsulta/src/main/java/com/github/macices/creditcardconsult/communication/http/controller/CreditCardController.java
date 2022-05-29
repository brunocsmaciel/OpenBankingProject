package com.github.macices.creditcardconsult.communication.http.controller;

import com.github.macices.creditcardconsult.builder.CreditCardBuild;
import com.github.macices.creditcardconsult.communication.http.controller.dto.CardsDto;
import com.github.macices.creditcardconsult.communication.http.controller.dto.ResponseAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {

    @Autowired
    CreditCardBuild creditCardBuild;

    @GetMapping("/credit")
    public ResponseEntity<ResponseAPI<CardsDto>> getCreditCard(){
        return new ResponseEntity(ResponseAPI.of(new CardsDto(creditCardBuild.build())), HttpStatus.OK);
    }
}
