package com.exe.greant.services;

import com.exe.greant.dtos.DishesDTO;
import com.exe.greant.repository.DishesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DishesService {

    private final DishesRepository repository;

    public List<DishesDTO> getAllDishes(String name) {
        return this.repository.findAllByNameLikeIgnoreCase(name)
                .stream().map((dish) -> {
                    DishesDTO dto = new DishesDTO();
                    dto.setName(dish.getName());
                    dto.setDescription(dish.getDescription());
                    dto.setType(dish.getType());
                    return dto;
                }).collect(Collectors.toList());
    }
}
