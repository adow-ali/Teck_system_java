package com.example.managementproj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.managementproj.entity.UserEntity;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    // @Query("Select user from userTable")
    List<UserEntity> findByUserName(String user);
    
    List<UserEntity> findAllByActiveOrderByIdDesc(boolean active);
    
    Optional<UserEntity> findByIdAndActive(Integer id, boolean active);
}
