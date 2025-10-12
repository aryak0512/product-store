package com.aryak.productstore.controller;

import com.aryak.productstore.model.ContactRequestDto;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/contacts")
public class ContactController {

    @PostMapping("/save")
    public void saveContact(RequestEntity<ContactRequestDto> contactRequestDtoRequest) {
        System.out.printf("Received contact request: %s%n", contactRequestDtoRequest.getBody());
    }

    @GetMapping("/test")
    public String test() {
        return "Hey there from contact controller";
    }
}
