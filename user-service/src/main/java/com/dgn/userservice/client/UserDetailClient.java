package com.dgn.userservice.client;

import com.dgn.userservice.dto.UserDetailDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userDetail-service",path = "v1/api")
public interface UserDetailClient {

    @GetMapping("/getUserDetailDtoById/{userId}")
    public ResponseEntity<UserDetailDto> getUserDetailDtoById(@PathVariable Long userId);


}
