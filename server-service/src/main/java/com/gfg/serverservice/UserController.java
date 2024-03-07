package com.gfg.serverservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static java.lang.invoke.VarHandle.AccessMode.GET;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users")
    public ResponseEntity<String> getUsers() {
        // Modify the request method to POST
        String response = restTemplate.postForObject("http://localhost:8083/users", null, String.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
