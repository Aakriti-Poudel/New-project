package com.example.dto.SpringbootDTO.service;

import com.example.dto.SpringbootDTO.dto.UserLocationDTO;
import com.example.dto.SpringbootDTO.model.User;
import com.example.dto.SpringbootDTO.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
        .stream()
        .map(this::convertEntityToDto)
                .collect((Collectors.toList()));

    }

    private UserLocationDTO convertEntityToDto(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(userLocationDTO.getLatitude());
        return userLocationDTO;
    }
}
