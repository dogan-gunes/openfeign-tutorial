package com.dgn.userservice.controller;

import com.dgn.userservice.dto.UserDetail;
import com.dgn.userservice.dto.UserDto;
import com.dgn.userservice.service.UserService;
import jakarta.persistence.GeneratedValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUserDtoById/{userId}")
    public ResponseEntity<UserDto> getUserDtoById(@PathVariable Long userId){
        return new ResponseEntity<>(userService.getUserDtoById(userId), HttpStatus.OK);
    }

    @GetMapping("/getAllUserDetail")
    public ResponseEntity<List<UserDetail>> getAllUserDetail(){
        return new ResponseEntity<>(userService.getAllUserDetail(), HttpStatus.OK);
    }

    @GetMapping("/getUserDetailByUserId/{userId}")
    public ResponseEntity<UserDetail> getUserDetailByUserId(@PathVariable Long userId){
        return new ResponseEntity<>(userService.getUserDetailByUserId(userId), HttpStatus.OK);
    }
}
