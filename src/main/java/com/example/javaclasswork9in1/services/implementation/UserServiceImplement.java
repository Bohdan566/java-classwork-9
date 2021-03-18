package com.example.javaclasswork9in1.services.implementation;


import com.example.javaclasswork9in1.dao.UserDAO;
import com.example.javaclasswork9in1.models.Profile;
import com.example.javaclasswork9in1.models.User;
import com.example.javaclasswork9in1.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImplement implements UserService {

    private UserDAO userDAO;


    @Override
    public void save(User user) {
        userDAO.save(user);
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
}
