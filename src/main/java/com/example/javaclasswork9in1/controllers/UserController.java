package com.example.javaclasswork9in1.controllers;


import com.example.javaclasswork9in1.models.Profile;
import com.example.javaclasswork9in1.models.User;
import com.example.javaclasswork9in1.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/save")
    public void saveUser(@RequestParam String mail, @RequestParam String password,
                         @RequestParam String firstname,
                         @RequestParam String lastname,
                         @RequestParam int age,
                         @RequestParam MultipartFile avatar){
        User user = new User(mail, password);
        String originalFilename = avatar.getOriginalFilename();
        Profile profile = new Profile(firstname, lastname, age, originalFilename);
        user.setProfile(profile);
        userService.save(user);
    }
    

    @GetMapping("")
    public List<User> getUsers(){
        return userService.findAll();
    }

    @GetMapping("/user{id}")
    public User getUser(@PathVariable int id){
        return userService.findById(id);
    }
}
