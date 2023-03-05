package com.dgn.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDetailDto {
    private String gsmNo;
    private String tcKimlikNo;
    private String email;
    private String address;
}
