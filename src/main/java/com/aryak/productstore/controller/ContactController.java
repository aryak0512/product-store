package com.aryak.productstore.controller;

import com.aryak.productstore.model.ContactRequestDto;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class ContactController {

    @PostMapping("/contacts")
    public void saveContact(RequestEntity<ContactRequestDto> contactRequestDtoRequest) {

    }
}
