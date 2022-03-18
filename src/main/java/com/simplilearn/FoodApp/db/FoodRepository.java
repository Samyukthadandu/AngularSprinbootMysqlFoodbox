package com.simplilearn.FoodApp.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.FoodApp.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long>{

	//List<Food> findAll();

	

}
