package com.bhuvnesh.PostMicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/posts")
public class Controller
{
    @GetMapping(path = "/test")
    public void testAPI()
    {
        System.out.println("Post MicroService triggered");
    }
}
