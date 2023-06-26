package com.exe.greant.services;

import com.exe.greant.dtos.IngredientsDTO;
import com.exe.greant.entities.Ingredient;
import com.exe.greant.repository.IngredientsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor()
public class IngredientsService {

    private final IngredientsRepository repository;

    public List<IngredientsDTO> getAllIngredients(String name) {

        List<Ingredient> list = this.repository.findAllByNameLikeIgnoreCase(name);

        return list.stream().map((ingredient) -> {
            IngredientsDTO dto = new IngredientsDTO();
            dto.setName(ingredient.getName());
            dto.setName(ingredient.getType());
            return dto;
        }).collect(Collectors.toList());
    }
}
