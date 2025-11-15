package com.BiteFlow.SmartFoodOrdering.service;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.UserCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.UserDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.UserUpdateDTO;

import java.util.List;

public interface UserService {
    UserDTO registerUser(UserCreateDTO dto);

    void updateUser(Long userId, UserUpdateDTO dto);

    UserDTO getUserById(Long userId);

  //  List<UserDTO> getAllUsers();

    void deleteUser(Long userId);
}
