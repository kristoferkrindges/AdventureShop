package com.salesadventure.adventure.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salesadventure.adventure.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    //@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", 
        "99999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
