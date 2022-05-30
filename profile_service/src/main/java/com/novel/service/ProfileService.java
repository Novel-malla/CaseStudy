package com.novel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novel.model.UserProfile;
import com.novel.repository.ProfileRepository;

@Service
public class ProfileService{
	
	@Autowired
	private ProfileRepository profileRepository;

	public List<UserProfile> getUsers() {
		return this.profileRepository.findAll();
	}

	public UserProfile getByProfileId(Integer id) {
		return this.profileRepository.findById(id).get();
	}

	public void deleteProfile(Integer id) {
		this.profileRepository.deleteById(id);
	}

	public UserProfile updateProfile(UserProfile userProfile) {
		return profileRepository.save(userProfile);
	}

	public UserProfile addNewUser(UserProfile userProfile) {
		return profileRepository.save(new UserProfile(userProfile.getId(),userProfile.getFullName(),userProfile.getEmail(),userProfile.getMobileNumber(),userProfile.getAbout(),userProfile.getDateOfBirth(),userProfile.getGender(),userProfile.getRole(),userProfile.getPassword()));
	}

	public UserProfile updateProfilebyId(Integer id) {
		return profileRepository.findById(id).get();
	}

	public UserProfile getByName(String fullName) {
		return profileRepository.findByFullName(fullName);
	}


}

