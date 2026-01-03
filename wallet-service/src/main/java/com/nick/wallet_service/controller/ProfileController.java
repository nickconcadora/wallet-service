package com.nick.wallet_service.controller;
import com.nick.wallet_service.dto.ChangeEmailRequest;
import com.nick.wallet_service.model.Profile;
import com.nick.wallet_service.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/user")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @DeleteMapping("/{profileId}")
    private void deleteUser(@PathVariable UUID profileId) {
        profileService.deleteProfile(profileId);
    }

    @GetMapping("/{profileId}")
    private Profile getUser(@PathVariable UUID profileId) {
        return profileService.getProfile(profileId);
    }

    @PatchMapping("/changeEmail/{profileId}")
    private Profile editEmail(@PathVariable UUID profileId, @RequestBody ChangeEmailRequest changeEmail){
        return profileService.editEmail(profileId, changeEmail.getCurrentEmail(), changeEmail.getNewEmail());
    }



}
