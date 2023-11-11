package com.bhuvnesh.UserMicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class Controller
{
    @GetMapping(path = "/test")
    public void testAPI()
    {
        System.out.println("User MicroService triggered");
    }
}