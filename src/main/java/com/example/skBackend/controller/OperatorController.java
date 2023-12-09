package com.example.skBackend.controller;

import com.example.skBackend.entity.Operator;
import com.example.skBackend.repository.OperatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OperatorController {

    private OperatorRepository operatorRepository;

    @PostMapping("/employees")
    Operator newOperator(@RequestBody Operator newOperator){return operatorRepository.save(newOperator);}

    @GetMapping("/employees")
    List<Operator> operatorList(){return operatorRepository.findAll();}

    @DeleteMapping("/employees")
    ResponseEntity deleteOperator(@RequestBody Long idOperator){
        operatorRepository.deleteById(idOperator);
        return ResponseEntity.ok().build();
    }

}
