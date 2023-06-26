package com.exe.greant.controllers;

import com.exe.greant.dtos.DishesDTO;
import com.exe.greant.services.DishesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor()
@RequestMapping("dishes")
@RestController
public class DishesController {

    private final DishesService service;

    @GetMapping()
    public ResponseEntity<List<DishesDTO>> getAllDishes(
            @RequestParam("name") String name
    ) {
        return ResponseEntity.ok(this.service.getAllDishes(name));
    }
}
