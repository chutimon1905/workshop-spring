package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

//    @GetMapping("/users")
//    public List<UsersResponse> getAllUser(){
//        List<UsersResponse> users = new ArrayList<>();
//        users.add(new UsersResponse(1, "User 1"));
//        users.add(new UsersResponse(2, "User 2"));
//        users.add(new UsersResponse(3, "User 3"));
//        return users;
//    }
//
//    @GetMapping("/users/{id}")
//    public UsersResponse getUserById( @PathVariable int id){
//        return new UsersResponse(id, "User "+ id);
//    }
    @GetMapping("/users")
    public String getPage(@RequestParam(defaultValue = "1") String page, @RequestParam(name = "item_per_page" ,defaultValue = "10") String itemPerPage) {
        return "Page: " + page + " , itemPerPage: " + itemPerPage;
    }

}