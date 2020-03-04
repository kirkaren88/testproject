package com.egs.testproject.service.api;


import com.egs.testproject.exception.EmptyUsersException;
import com.egs.testproject.exception.UserNotFoundException;
import com.egs.testproject.exception.UserRegistrationException;
import com.egs.testproject.model.dto.JwtAuthenticationRequest;
import com.egs.testproject.model.dto.LeaderBoardDto;
import com.egs.testproject.model.dto.UserDto;
import com.egs.testproject.model.persistence.User;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface UserService {

    void save(User user) throws UserRegistrationException;

    List<UserDto> findAll() throws EmptyUsersException;

    UserDto findById(Integer id) throws UserNotFoundException;

    User findByEmail(String email) throws UserNotFoundException;

    void deleteById(Integer id) throws UserNotFoundException;

    void updateEmail(String email, String newEmail) throws UserNotFoundException;

    void updateName(String email, String name) throws UserNotFoundException;

    void updateSurName(String email, String surName) throws UserNotFoundException;

    void updatePassword(String email, String newPassword) throws UserNotFoundException;

    void updatePoints(String email, int points) throws UserNotFoundException;

    ResponseEntity loginByEmailAndPassword(JwtAuthenticationRequest authenticationRequest) throws UserNotFoundException;

    List<LeaderBoardDto> leaderBoard();
}
