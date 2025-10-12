package com.aryak.productstore.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class UserDto {

    private String userId;
    private String username;
    private String mobileNumber;
}
