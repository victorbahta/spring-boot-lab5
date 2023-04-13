package com.prep.midprep.repository;

import com.prep.midprep.domain.Post;
import com.prep.midprep.domain.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostsRepository extends CrudRepository<Post,Long> {
    Post save(Post p);
    List<Post> findAll();
//    @Query("select p from Post p where p.user.id = :id")
//    List<Post> findPostByUserId(Long id);
}
