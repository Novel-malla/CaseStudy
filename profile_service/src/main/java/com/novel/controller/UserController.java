package com.novel.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.novel.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.novel.model.UserProfile;

@RestController
@RequestMapping("/profile")
public class UserController {

	@Autowired
	private ProfileService profileService;

	@PostMapping("/add")
	public ResponseEntity<String> addUser(@Valid @RequestBody UserProfile userProfile) {
		profileService.addNewUser(userProfile);
		return ResponseEntity.ok("User is valid");
	}

	@GetMapping("/get")
	public ResponseEntity<List<UserProfile>> findAllUsers(@RequestParam(required = false) String fullName) throws Exception{
		try {
			List<UserProfile> userProfile = new ArrayList<UserProfile>();
			if (fullName == null)
				profileService.getUsers().forEach(userProfile::add);
			else
				profileService.getByName(fullName);
			
			if (userProfile.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(userProfile, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	@GetMapping("/get/{id}")
	public ResponseEntity<?> getProfilebyid(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(this.profileService.getByProfileId(id));
	}

	@PutMapping("/get/update")
	public UserProfile updateUser(@RequestBody UserProfile userProfile) {
		return this.profileService.updateProfile(userProfile);
	}


	@DeleteMapping("/get/del/{id}")
	public int deleteUser(@PathVariable("id") Integer id) {
		this.profileService.deleteProfile(id);
		return id;
	}



}
