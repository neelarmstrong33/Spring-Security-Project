package com.codeburner.SecurityApplication.dto;

import lombok.Data;

@Data
public class SignUpDTO {

    private String email;
    private String password;
    private String name;
}
