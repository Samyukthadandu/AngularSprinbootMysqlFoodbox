package com.simplilearn.FoodApp.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.FoodApp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
