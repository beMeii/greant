package com.exe.greant.repository;

import com.exe.greant.entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface DishesRepository extends JpaRepository<Dish, Integer> {

    List<Dish> findAllByNameLikeIgnoreCase(String name);
}
