package com.nick.wallet_service.service;

import com.nick.wallet_service.model.Profile;
import com.nick.wallet_service.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile getProfile(UUID profileId) {
        return profileRepository.findById(profileId)
                .orElseThrow(() -> new RuntimeException("No profile found"));
    }

    public Profile editEmail(UUID profileId, String currentEmail, String newEmail) {
        Profile currentProfile = profileRepository.findById(profileId)
                .orElseThrow(() -> new RuntimeException("Profile does not exist"));

        if (currentProfile.getEmail().equals(currentEmail)) {
            currentProfile.setEmail(newEmail);
            return profileRepository.save(currentProfile);
        } else {
            throw new RuntimeException("ERROR: Current email does not match");
        }
    }
    public void deleteProfile(UUID profileId) {
        Profile deletedProfile = profileRepository.findById(profileId)
                .orElseThrow(() -> new RuntimeException("User does not exist"));
        profileRepository.delete(deletedProfile);
    }




}
