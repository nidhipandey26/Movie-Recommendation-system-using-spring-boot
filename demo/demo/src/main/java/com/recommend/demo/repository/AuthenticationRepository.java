package com.recommend.demo.repository;

import com.recommend.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
