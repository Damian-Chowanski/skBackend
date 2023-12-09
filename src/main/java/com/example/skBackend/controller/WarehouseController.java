package com.example.skBackend.controller;

import com.example.skBackend.entity.Warehouse;
import com.example.skBackend.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WarehouseController {

    private final WarehouseRepository warehouseRepository;

    @PostMapping("/warehouse")
    Warehouse newWarehouse(@RequestBody Warehouse newWarehouse){return warehouseRepository.save(newWarehouse);}

    @GetMapping("/warehouse")
    List<Warehouse> warehouseList(){return warehouseRepository.findAll();}

    @DeleteMapping("/warehouse")
    ResponseEntity deleteWarehouse(@RequestBody Long idWarehouse){
        warehouseRepository.deleteById(idWarehouse);
        return ResponseEntity.ok().build();
    }
}
