package com.example.javaclasswork9in1.services.implementation;


import com.example.javaclasswork9in1.dao.UserDAO;
import com.example.javaclasswork9in1.models.Profile;
import com.example.javaclasswork9in1.models.User;
import com.example.javaclasswork9in1.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImplement implements UserService {

    private UserDAO userDAO;

    @Override
    public void save(String mail, String password, String firstname, String lastname, int age, MultipartFile avatar) {
        User user = new User(mail, password);
        String originalFilename = avatar.getOriginalFilename();
        Profile profile = new Profile(firstname, lastname, age, originalFilename);
        profile.setUser(user);
        user.setProfile(profile);
        userDAO.save(user);
        String pathToImage =
                System.getProperty("user.home") +
                        File.separator + ("Pictures2") +
                        File.separator + avatar.getOriginalFilename();
        try {
            avatar.transferTo(new File(pathToImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findById(int id) {
        Optional<User> userById = userDAO.findById(id);
        return userById.orElse(null);
    }



    @Override
    public User updateUser(int id, String mail, String password, int age) {
        User one = userDAO.getOne(id);
        one.setMail(mail);
        one.setPassword(password);
        Profile profile = one.getProfile();
        profile.setAge(age);

        return userDAO.save(one);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }


}
