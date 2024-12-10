package com.lombok.controller;

import com.lombok.model.PruebaModel;
import com.lombok.service.PruebaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
@RequiredArgsConstructor
public class PruebaController {

    private final PruebaService pruebaService;
    

    @PostMapping
    public ResponseEntity<?> save(@RequestBody PruebaModel pruebaModel){
        return new ResponseEntity<>(pruebaService.savePrueba(pruebaModel), HttpStatus.CREATED);
    }
}
