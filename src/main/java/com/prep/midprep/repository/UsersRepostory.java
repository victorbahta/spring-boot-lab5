package com.prep.midprep.repository;

import com.prep.midprep.domain.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepostory extends CrudRepository<Users,Long> {
    List<Users> findAll();
    Users save(Users u);
    Optional<Users> findById(Long id);
    Users findByEmail(String email);
    void deleteById(Long id);

}
