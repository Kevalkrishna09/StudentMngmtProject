package com.example.SCM.Project.Services;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import com.example.SCM.Project.Entitites.User;

public interface userService {
    User saveUser(User user);
    Optional<User> getUserById(String id);

    Optional<User> updateUser(User user);

    void deleteUser(String id);

    boolean isUserExist(String userId);

    boolean isUserExistByEmail(String email);

    List<User> getAllUsers();

    User  getUserByEmail(String email);
    
} 
