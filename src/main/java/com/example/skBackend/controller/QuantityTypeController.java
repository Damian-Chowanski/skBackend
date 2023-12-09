package com.example.skBackend.controller;

import com.example.skBackend.entity.QuantityType;
import com.example.skBackend.repository.QuantityTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuantityTypeController {

    private final QuantityTypeRepository quantityTypeRepository;

    @PostMapping("/quantityType")
    QuantityType newQuantityType(@RequestBody QuantityType newQuantityType){return quantityTypeRepository.save(newQuantityType);}

    @GetMapping("/quantityType")
    List<QuantityType> quantityTypeList() {return quantityTypeRepository.findAll();}

    @DeleteMapping("/quantityType")
    ResponseEntity deleteTypeQuantity(@RequestBody Long idTypeQuantity){
        quantityTypeRepository.deleteById(idTypeQuantity);
        return ResponseEntity.ok().build();
    }
}
