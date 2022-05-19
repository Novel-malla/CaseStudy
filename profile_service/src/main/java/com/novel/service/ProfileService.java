package com.novel.service;

import java.util.List;

import com.novel.model.UserProfile;

public interface ProfileService {
	
	public UserProfile addNewUser(UserProfile userProfile);
	public UserProfile getByProfileId(Integer id);
	public UserProfile updateProfile(UserProfile userProfile);
	public UserProfile updateProfilebyId(Integer id);
	public void deleteProfile(Integer id);
	public List<UserProfile> getUsers();
	
}
