package com.nghia.application.service;


import com.nghia.application.entity.User;
import com.nghia.application.model.dto.UserDTO;
import com.nghia.application.model.request.ChangePasswordRequest;
import com.nghia.application.model.request.CreateUserRequest;
import com.nghia.application.model.request.UpdateProfileRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getListUsers();

    Page<User> adminListUserPages(String fullName, String phone, String email, Integer page);

    User createUser(CreateUserRequest createUserRequest);

    void changePassword(User user, ChangePasswordRequest changePasswordRequest);

    User updateProfile(User user, UpdateProfileRequest updateProfileRequest);
}
