package com.nick.wallet_service.service;

import com.nick.wallet_service.model.User;
import com.nick.wallet_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(String firstName, String lastName, String email, String password, String dob) {
        User newUser = new User();
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setEmail(email);
        newUser.setPassword(password);
        newUser.setDob(dob);
        return userRepository.save(newUser);
    }

    public User getUser(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("No user found"));
    }

    public User editEmail(Long userId, String currentEmail, String newEmail) {
        User currentUser = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User does not exist"));

        if (currentUser.getEmail().equals(currentEmail)) {
            System.out.println(newEmail);
            currentUser.setEmail(newEmail);
            return userRepository.save(currentUser);
        } else {
            throw new RuntimeException("ERROR: Current password does not match");
        }
    }

    public void deleteUser(Long userId) {
        User deletedUser = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User does not exist"));
        userRepository.delete(deletedUser);
    }




}
