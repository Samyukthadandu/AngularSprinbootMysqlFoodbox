package com.simplilearn.FoodApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.FoodApp.model.User;
import com.simplilearn.FoodApp.service.RegistrationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping(path = "user1")
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	 @CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/registeruser")
	public User registrationUser(@RequestBody User user) throws Exception {
		String tempEmailId =user.getEmailId();
		if(tempEmailId!=null ) {
			User userobj=service.fetchUserByEmailId(tempEmailId);
			if(userobj!=null) {
				throw new Exception("User with this email already exists");
			}
		}
		User userobj = null;
		userobj = service.saveUser(user);
		return userobj;
	}
	    @CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/loginuser")
		public User loginUser(@RequestBody User user) throws Exception {
			String tempEmailId=user.getEmailId();
			System.out.print(tempEmailId);
			String tempPass = user.getPassword();
			System.out.print(tempPass);
			User userobj = null;
			if(tempEmailId != null && tempPass != null) {
			userobj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
			if(userobj == null) {
				throw new Exception("Bad Credentials");
			}
			return userobj;
		
	}
		}


