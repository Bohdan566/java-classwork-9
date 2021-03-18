package com.example.javaclasswork9in1.services;


import com.example.javaclasswork9in1.models.Profile;
import com.example.javaclasswork9in1.models.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

    void save(String mail, String password, String firstname, String lastname, int age, MultipartFile avatar);

    List<User> findAll();

    User findById(int id);

    User updateUser(int id, String mail, String password, int age);

    void deleteUser(int id);


}
