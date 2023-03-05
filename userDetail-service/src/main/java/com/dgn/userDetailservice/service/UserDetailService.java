package com.dgn.userDetailservice.service;

import com.dgn.userDetailservice.dto.UserDetailDto;
import com.dgn.userDetailservice.exception.UserNotFoundException;
import com.dgn.userDetailservice.model.UserDetail;
import com.dgn.userDetailservice.repository.UserDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService {

    private final UserDetailRepository userDetailRepository;

    public UserDetailService(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    public UserDetailDto userDetailDtoConverter(UserDetail userDetail) {

        return UserDetailDto.builder()
                .address(userDetail.getAddress())
                .email(userDetail.getEmail())
                .tcKimlikNo(userDetail.getTcKimlikNo())
                .gsmNo(userDetail.getGsmNo())
                .build();
    }

    public UserDetailDto getUserDetailById(Long userId) {
        return this.userDetailDtoConverter(userDetailRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User Not Found User Id : " + userId)));
    }
}
