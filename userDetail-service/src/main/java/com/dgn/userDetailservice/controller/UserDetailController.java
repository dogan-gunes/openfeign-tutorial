package com.dgn.userDetailservice.controller;

import com.dgn.userDetailservice.dto.UserDetailDto;
import com.dgn.userDetailservice.service.UserDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api")
public class UserDetailController {

    private final UserDetailService userDetailService;

    public UserDetailController(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    @GetMapping("/getUserDetailDtoById/{userId}")
    public ResponseEntity<UserDetailDto> getUserDetailDtoById(@PathVariable Long userId){
        return new ResponseEntity<>(userDetailService.getUserDetailById(userId), HttpStatus.OK);
    }
}

