package com.prep.midprep.controller;

import com.prep.midprep.domain.Post;
import com.prep.midprep.domain.Users;
import com.prep.midprep.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersService usersService;
    @PostMapping
    public void createUser(@RequestBody Users user) {
        usersService.createUser(user);
    }
    @GetMapping
    public List<Users> getUsers() {
        return usersService.getUsers();
    }
    @GetMapping("/{id}")
    public Optional<Users> findUser(@PathVariable("id") Long id) {
        return usersService.findUser(id);
    }
//    @PostMapping("/{id}/posts")
//    public void savePostByUser(@PathVariable("id") Long id, @RequestBody Post p) {
//        usersService.savePostByUser(id,p);
//
//    }
//    @GetMapping("/{id}/posts")
//    public List<Post> getPostsByUser(@PathVariable("id") Long id) {
//        return usersService.getPostsByUser(id);
//
//    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        usersService.deleteUser(id);
    }
    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") Long id, @RequestBody Users u) {
        usersService.updateUser(id, u);
    }
}
