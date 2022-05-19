package com.novel.controller;

import java.util.List;

import com.novel.service.ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.novel.model.UserProfile;
import com.novel.service.ProfileService;
@Slf4j
@RestController
@RequestMapping("/profile")
public class UserController {

	final Logger logger= LoggerFactory.getLogger(UserController.class);

	@Autowired
	private ProfileService profileService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/add")
	public UserProfile addUser(@RequestBody UserProfile userProfile) {
		return this.profileService.addNewUser(userProfile);
	}

	@GetMapping("/get")
	public ResponseEntity<?> findAllUsers() {
		logger.info("Inside Profile of UserProfileController");
		return ResponseEntity.ok(this.profileService.getUsers());
	}


	@GetMapping("/get/{id}")
	public ResponseEntity<?> getProfilebyid(@PathVariable Integer id) {
		return ResponseEntity.ok(this.profileService.getByProfileId(id));
	}

	@PutMapping("/get/update")
	public UserProfile updateUser(@RequestBody UserProfile userProfile) {
		return this.profileService.updateProfile(userProfile);
	}


	@DeleteMapping("/get/del/{id}")
	public int deleteUser(@PathVariable Integer id) {
		this.profileService.deleteProfile(id);
		return id;
	}



}
