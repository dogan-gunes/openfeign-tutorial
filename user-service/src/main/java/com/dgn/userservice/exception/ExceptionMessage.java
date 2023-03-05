package com.dgn.userservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionMessage {
    private String timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

}
