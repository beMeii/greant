package com.exe.greant.repository;

import com.exe.greant.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface IngredientsRepository extends JpaRepository<Ingredient, Integer> {

    List<Ingredient> findAllByNameLikeIgnoreCase(String name);
}
