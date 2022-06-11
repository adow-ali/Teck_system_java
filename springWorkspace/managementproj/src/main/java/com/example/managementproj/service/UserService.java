package com.example.managementproj.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.managementproj.entity.UserEntity;
import com.example.managementproj.repository.UserRepository;

@Service
public class UserService implements UserServiceImpl {

	@Autowired
	private UserRepository userRepository;

	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public List<UserEntity> getUserByUsername(String user) {
		return userRepository.findByUserName(user);
	}

	@Override
    public void updateUser(long id, UserEntity user) {
        UserEntity userFromDB = userRepository.findById(id).orElseThrow(()->new IllegalArgumentException("No such user: " + id));
        userFromDB.setUsername(user.getUsername());
        userFromDB.setDescription(user.getDescription());
        userFromDB.setActive(user.isActive());
        //userRepository.save(user); This would save the input back to the DB (no changes have been made to the input)
        userRepository.save(userFromDB); // This saves the updated object back into the DB
    }



	@Override
	public void addUser(UserEntity userEntity) {
		userRepository.save(userEntity);
	}

	@Override
	public void deleteUser(long id) {
		Optional<UserEntity> user = userRepository.findById(id);
		if (user.isPresent()) {
			userRepository.delete(user.get());
		}
	}

	@Override
	public void saveUser(UserEntity user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<UserEntity> getUsernameById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
