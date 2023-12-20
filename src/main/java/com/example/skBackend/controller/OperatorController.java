package com.example.skBackend.controller;

import com.example.skBackend.dto.OperatorCredentialsDto;
import com.example.skBackend.entity.Operator;
import com.example.skBackend.repository.OperatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class OperatorController {

    private OperatorRepository operatorRepository;

    @PostMapping("/operator")
    public Operator newOperator(@RequestBody Operator newOperator){return operatorRepository.save(newOperator);}

    @GetMapping("/operator")
    public List<Operator> operatorList(){return operatorRepository.findAll();}

    @DeleteMapping("/operator")
    public ResponseEntity deleteOperator(@RequestBody Long idOperator){
        operatorRepository.deleteById(idOperator);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/verify_operator_credentials")
    public Operator verifyOperatorCredentials(@RequestBody OperatorCredentialsDto operatorCredentialsDto){
        Optional<Operator> operatorOptional = operatorRepository.findByLogin(operatorCredentialsDto.getLogin());

        if(!operatorOptional.isPresent())
    }

}
