package com.example.dto.SpringbootDTO.repository;

import com.example.dto.SpringbootDTO.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
