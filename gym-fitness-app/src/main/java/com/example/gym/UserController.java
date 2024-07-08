package com.example.gym;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/signup")
    public ResponseEntity<UserEntity> signUp(@RequestBody UserEntity user) {
        userService.registerUser(user);
        return ResponseEntity.ok(user);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/subscription")
    public ResponseEntity<Subscription> createUser(@RequestBody Subscription subscription) {
        System.out.println("Received Subscription Data: " + subscription); // Log the received data
        userService.registerSubscription(subscription);
        return ResponseEntity.ok(subscription);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/signin")
    public ResponseEntity<String> signIn(@RequestBody UserEntity user) {
        UserEntity existingUser = userService.getUserByEmail(user.getEmail());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok("Sign-in successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password!");
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/create")
    public String createUser(@RequestBody Frans frans) {
        userService.add(frans);
        return "Success";
    }


    
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        UserEntity user = userService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
