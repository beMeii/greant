package com.exe.greant.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DishesDTO {
    private String name;
    private String description;
    private String type;
}
