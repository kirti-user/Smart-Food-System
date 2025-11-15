package com.BiteFlow.SmartFoodOrdering.serviceImpl;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.UserCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.UserDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.UserUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.exception.ResourceNotFoundException;
import com.BiteFlow.SmartFoodOrdering.mapper.UserMapper;
import com.BiteFlow.SmartFoodOrdering.model.User;
import com.BiteFlow.SmartFoodOrdering.repository.UserRepository;
import com.BiteFlow.SmartFoodOrdering.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO registerUser(UserCreateDTO userCreateDTO) {
        User user = userMapper.toEntity(userCreateDTO);
        userRepository.save(user);
        return userMapper.toResponse(user, new ArrayList<>(), new ArrayList<>());
    }

    @Override
    public void updateUser(Long userId, UserUpdateDTO userUpdateDTO) {
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException(userId));
        userMapper.updateEntity(user, userUpdateDTO);
        userRepository.save(user);
    }

    @Override
    public UserDTO getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException(userId));
        return userMapper.toResponse(user, new ArrayList<>(), new ArrayList<>());
    }

    @Override
    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));
        userRepository.delete(user);
    }


}
