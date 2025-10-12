package com.aryak.productstore.model.dtos;

import com.aryak.productstore.model.UserDto;

public record LoginResponseDto(
        String message,
        UserDto userDto,
        String jwt
) {
}
