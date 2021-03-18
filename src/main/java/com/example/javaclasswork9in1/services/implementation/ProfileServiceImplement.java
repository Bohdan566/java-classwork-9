package com.example.javaclasswork9in1.services.implementation;

import com.example.javaclasswork9in1.dao.ProfileDAO;
import com.example.javaclasswork9in1.dao.UserDAO;
import com.example.javaclasswork9in1.models.Profile;
import com.example.javaclasswork9in1.services.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@AllArgsConstructor
public class ProfileServiceImplement implements ProfileService {

    private ProfileDAO profileDAO;

}
