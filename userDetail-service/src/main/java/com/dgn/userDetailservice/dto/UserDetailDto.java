package com.dgn.userDetailservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailDto {
    private String gsmNo;
    private String tcKimlikNo;
    private String email;
    private String address;
}
