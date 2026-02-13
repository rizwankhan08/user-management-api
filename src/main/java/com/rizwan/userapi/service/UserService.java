package com.rizwan.userapi.service;

import com.rizwan.userapi.entity.User;
import java.util.List;

public interface UserService {

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
