package com.simplilearn.FoodApp.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.FoodApp.model.User;

public interface RegistrationRepository extends JpaRepository<User,Long> {
	
	public User findByEmailId(String emailId);
	public User findByEmailIdAndPassword(String emailId, String password);

}
