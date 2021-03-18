package com.example.javaclasswork9in1.controllers;


import com.example.javaclasswork9in1.models.Profile;
import com.example.javaclasswork9in1.services.ProfileService;
import com.example.javaclasswork9in1.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/users/")
@AllArgsConstructor
public class ProfileController {

    private ProfileService profileService;

}
