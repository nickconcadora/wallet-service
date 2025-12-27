package com.nick.wallet_service.controller;
import com.nick.wallet_service.dto.ChangeEmailRequest;
import com.nick.wallet_service.model.User;
import com.nick.wallet_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    private User createUser(@RequestBody User newUser){
        return userService.createUser(newUser.getFirstName(), newUser.getLastName(), newUser.getEmail(), newUser.getPassword(), newUser.getDob());
    }

    @DeleteMapping("/{userId}")
    private void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/{userId}")
    private User getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    @PatchMapping("/changeEmail/{userId}")
    private User editEmail(@PathVariable Long userId, @RequestBody ChangeEmailRequest changeEmail){
        return userService.editEmail(userId, changeEmail.getCurrentEmail(), changeEmail.getNewEmail());
    }



}
