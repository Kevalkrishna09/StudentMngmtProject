package com.example.SCM.Project.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SCM.Project.Entitites.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
    Optional<User> findByEmail(String email);
}
