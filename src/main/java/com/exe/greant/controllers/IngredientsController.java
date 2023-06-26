package com.exe.greant.controllers;

import com.exe.greant.dtos.IngredientsDTO;
import com.exe.greant.services.IngredientsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("ingredients")
@RestController()
@RequiredArgsConstructor()
public class IngredientsController {

    private final IngredientsService service;

    @GetMapping()
    public ResponseEntity<List<IngredientsDTO>> getAllIngredients(
            @RequestParam("name") String name) {
        return ResponseEntity.ok(this.service.getAllIngredients(name));
    }
}
