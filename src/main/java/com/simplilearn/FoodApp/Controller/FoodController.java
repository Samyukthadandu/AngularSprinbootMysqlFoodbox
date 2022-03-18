package com.simplilearn.FoodApp.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.simplilearn.FoodApp.db.FoodRepository;
import com.simplilearn.FoodApp.model.Food;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "foods")
public class FoodController {
	
	@Autowired
	private FoodRepository foodRepository;
	private byte[] bytes;
	
	@GetMapping("/get")
	public List<Food> getFoods() {
	

		return foodRepository.findAll();
	}
	//@CrossOrigin
	@PostMapping("/upload")	
	public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
		this.bytes = file.getBytes();
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/add")
	public void createFood(@RequestBody Food food) throws IOException {
		food.setPicByte(this.bytes);
		foodRepository.save(food);
		this.bytes = null;
	}
	@PutMapping("/update")
	public void updateFood(@RequestBody Food food) {
		foodRepository.save(food);
	}

	@DeleteMapping(path = { "/{id}" })
	public Food deletefood(@PathVariable("id") long id) {
		Food food = foodRepository.getOne(id);
		foodRepository.deleteById(id);
		return food;
	}
	
	@GetMapping("/search")
	public List<Food> getSearchedFoods(@RequestParam ("searchword")String sw) {
	

		return foodRepository.findAll();
	}
	
	/*@PutMapping("/update")
	public void updateFood(@RequestBody Food food) {
		foodRepository.save(food);
	}*/
	

}
