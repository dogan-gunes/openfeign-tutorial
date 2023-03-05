package com.dgn.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetail {
    private String name;
    private String surName;
    private UserDetailDto userDetailDto;
}
