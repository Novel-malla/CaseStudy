package com.novel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.novel.model.UserProfile;
import com.novel.repository.ProfileRepository;
import com.novel.service.ProfileService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProfileServiceApplicationTests {

	@Autowired
	private ProfileService profileService;
	
	@MockBean
	private ProfileRepository profileRepository;
	
	@Test
	public void addProfileTest() {
		UserProfile user = new UserProfile(1, "Vedant", "vs@gmail.com", null, "Student", "1/5/2000", "Male", "USER", "abc");
		when(profileRepository.save(user)).thenReturn(user);
		assertEquals(user, profileService.addNewUser(user));
	}
}
