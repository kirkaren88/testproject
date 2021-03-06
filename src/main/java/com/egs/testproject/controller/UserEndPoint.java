package com.egs.testproject.controller;


import com.egs.testproject.exception.EmptyUsersException;
import com.egs.testproject.exception.UserNotFoundException;
import com.egs.testproject.exception.UserRegistrationException;
import com.egs.testproject.model.dto.JwtAuthenticationRequest;
import com.egs.testproject.model.dto.LeaderBoardDto;
import com.egs.testproject.model.dto.UserDto;
import com.egs.testproject.model.persistence.User;
import com.egs.testproject.security.JwtTokenUtil;
import com.egs.testproject.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserEndPoint {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public void register(@RequestBody User user) throws UserRegistrationException {
        userService.save(user);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity auth(@RequestBody JwtAuthenticationRequest authenticationRequest) throws UserNotFoundException {

        return userService.loginByEmailAndPassword(authenticationRequest);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users")
    public List<UserDto> findAllUser() throws EmptyUsersException {
        return userService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public UserDto findByIdUser(@PathVariable("id") Integer id) throws UserNotFoundException {
        return userService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) throws UserNotFoundException {
        userService.deleteById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("update/email")

    public void updateEmail(@RequestBody JwtAuthenticationRequest authenticationRequest, @RequestParam("email") String email) throws UserNotFoundException {

        userService.updateEmail(authenticationRequest.getEmail(), email);

    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/update/name")
    public void updateName(@RequestBody JwtAuthenticationRequest authenticationRequest, @RequestParam("name") String name) throws UserNotFoundException {
        userService.updateName(authenticationRequest.getEmail(), name);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/update/surName")
    public void updateSurName(@RequestBody JwtAuthenticationRequest authenticationRequest, @RequestParam("name") String surName) throws UserNotFoundException {
        userService.updateName(authenticationRequest.getEmail(), surName);
    }


    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/update/password")
    public void updatePassword(@RequestBody JwtAuthenticationRequest authenticationRequest, @RequestParam("password") String password) throws UserNotFoundException {
        userService.updatePassword(authenticationRequest.getEmail(), password);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/leaderBoard")
    public List<LeaderBoardDto> leaderBoard() {
        return userService.leaderBoard();
    }

}
