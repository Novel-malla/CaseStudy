package com.novel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.novel.model.UserProfile;
import com.novel.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<UserProfile> getUsers() {
		List<UserProfile> profile = profileRepository.findAll();
		System.out.println(" " + profile);
		return profile;
	}

	@Override
	public UserProfile getByProfileId(Integer id) {
		return this.profileRepository.findById(id).get();
	}

	@Override
	public void deleteProfile(Integer id) {
		this.profileRepository.deleteById(id);
	}

	@Override
	public UserProfile updateProfile(UserProfile userProfile) {
		return profileRepository.save(userProfile);
	}

	@Override
	public UserProfile addNewUser(UserProfile userProfile) {
		return profileRepository.save(userProfile);
	}

	@Override
	public UserProfile updateProfilebyId(Integer id) {
		return profileRepository.findById(id).get();
	}


}

