package com.example.gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private SubscriptionRepository subscriptionRepository;
    
    @Autowired
    private FransRepository fransRepository;

    public void registerUser(UserEntity user) {
        // Perform any necessary validation or business logic before saving the user
        userRepository.save(user);
    }

    public void registerSubscription(Subscription subscription) {
        // Perform any necessary validation or business logic before saving the subscription
        subscriptionRepository.save(subscription);
    }

    public void add(Frans frans) {
        // Perform any necessary validation or business logic before saving the Frans entity
        fransRepository.save(frans);
    }

    public UserEntity getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
