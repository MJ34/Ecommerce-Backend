package com.mujidev.ecommerce.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class SignUpRequest implements Serializable {

    private String username;
    private String password;
    private String email;
    private String nama;
    
}
