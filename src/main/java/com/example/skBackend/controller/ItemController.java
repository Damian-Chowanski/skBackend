package com.example.skBackend.controller;

import com.example.skBackend.entity.Item;
import com.example.skBackend.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @PostMapping("/item")
    Item newItem(@RequestBody Item newItem) {return itemRepository.save(newItem);}

    @GetMapping("/item")
    List<Item> itemList(){ return itemRepository.findAll();}

    @DeleteMapping("/item")
    ResponseEntity deleteItem(@RequestBody Long idItem){
        itemRepository.deleteById(idItem);
        return ResponseEntity.ok().build();
    }
}
