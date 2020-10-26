package com.ifelseco.userapi.model;

import lombok.Data;

@Data
public class RegisterModel {

    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private String phone;
}
