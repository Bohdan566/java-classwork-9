package com.example.javaclasswork9in1.services;


import com.example.javaclasswork9in1.models.Profile;
import com.example.javaclasswork9in1.models.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> findAll();

    User findById(int id);


}
