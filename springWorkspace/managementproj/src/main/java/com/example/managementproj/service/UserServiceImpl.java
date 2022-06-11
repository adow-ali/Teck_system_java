package com.example.managementproj.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.managementproj.entity.UserEntity;


public interface UserServiceImpl {
    List<UserEntity> getUserByUsername(String user);
    Optional<UserEntity> getUsernameById(long id);

    void updateUser(UserEntity user);
    void addUser(UserEntity userEntity);
    void deleteUser(long id);
    void saveUser(UserEntity user);
}
