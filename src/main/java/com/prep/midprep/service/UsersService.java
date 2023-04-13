package com.prep.midprep.service;

import com.prep.midprep.domain.Post;
import com.prep.midprep.domain.Users;
import com.prep.midprep.repository.PostsRepository;
import com.prep.midprep.repository.UsersRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsersService {
    @Autowired
    UsersRepostory usersRepo;
    @Autowired
    PostsRepository postRepo;
    public void createUser(Users user) {
        usersRepo.save(user);
    }
    public List<Users> getUsers() {
        return usersRepo.findAll();
    }
    public Optional<Users> findUser(Long id) {
        return usersRepo.findById(id);
    }

//    public void savePostByUser(Long uid, Post p) {
//        p.setUser(usersRepo.findById(uid).orElse(null));
//        postRepo.save(p);
//
//    }
//    public List<Post> getPostsByUser(Long id) {
//        return postRepo.findPostByUserId(id);
//    }
    public void deleteUser(Long id) {
        usersRepo.deleteById(id);
    }

    public void updateUser(Long id, Users u) {
        Optional<Users> user = usersRepo.findById(id);
        if(user.isPresent()) {
            Users usr = user.get();
            usr.setName(u.getName());
            usersRepo.save(usr);
        }
    }
}
