package com.dgn.userservice.service;

import com.dgn.userservice.client.UserDetailClient;
import com.dgn.userservice.dto.UserDetail;
import com.dgn.userservice.dto.UserDto;
import com.dgn.userservice.exception.UserNotFoundByUserId;
import com.dgn.userservice.model.User;
import com.dgn.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserDetailClient userDetailClient;

    public UserService(UserRepository userRepository, UserDetailClient userDetailClient) {
        this.userRepository = userRepository;
        this.userDetailClient = userDetailClient;
    }

    public UserDto userDtoConverter(User user) {
        return UserDto.builder()
                .name(user.getName())
                .surName(user.getSurName())
                .build();
    }

    public UserDto getUserDtoById(Long userId) {
        return this.userDtoConverter(userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundByUserId("User Not Found By User Id : " + userId)));
    }

    public List<UserDetail> getAllUserDetail() {
        List<User> result = userRepository.findAll();
        List<UserDetail> detailResult = new ArrayList<>();
         result.stream()
                .map(user ->
                        detailResult.add(
                                UserDetail.builder()
                                        .name(user.getName())
                                        .surName(user.getSurName())
                                        .userDetailDto(userDetailClient.getUserDetailDtoById(user.getUserDetailId()).getBody())
                                        .build())).collect(Collectors.toList());
        return detailResult;
    }

    public UserDetail getUserDetailByUserId(Long userId){
                User user = userRepository.findById(userId)
                .orElseThrow(()->new UserNotFoundByUserId("User Not Found User Id : "+ userId));
        return UserDetail.builder()
                .name(user.getName())
                .surName(user.getSurName())
                .userDetailDto(userDetailClient.getUserDetailDtoById(user.getUserDetailId()).getBody())
                .build();
    }
}
