package com.diksha.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diksha.portal.entity.NewUserRegistration;
import com.diksha.portal.service.UserRegistration;

@RestController
@CrossOrigin(origins = "http://localhost:4202")
public class registerController {

	@Autowired
	UserRegistration registration;

	@PostMapping(path = "/register")
	public ResponseEntity<NewUserRegistration> registerUser(@RequestBody NewUserRegistration registrationData) {
		NewUserRegistration data = registration.submit(registrationData);
		if (data == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@GetMapping(path = "/getDetails/{id}")
	public ResponseEntity<NewUserRegistration> getIdDetails(@PathVariable int id) {
		NewUserRegistration sd = registration.getDetails(id);
		return new ResponseEntity<>(sd, HttpStatus.OK);
	}

	@GetMapping(path = "/getAll")
	public ResponseEntity<List<NewUserRegistration>> getAllDetails() {
		List<NewUserRegistration> all = registration.getAll();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}

	@PutMapping(path = "/updateUser")
	public ResponseEntity<NewUserRegistration> updateUser(@RequestBody NewUserRegistration userRegistration) {
		NewUserRegistration an=registration.update(userRegistration);
		return new ResponseEntity<>(an, HttpStatus.OK);
	}
	
	@DeleteMapping(path="/delete/{n}")
	public ResponseEntity<NewUserRegistration> deleteUser(@PathVariable int n){
		registration.deleteUserr(n);
		return new ResponseEntity<NewUserRegistration>(HttpStatus.OK);
	}
}
