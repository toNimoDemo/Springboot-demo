package com.lehaha.SpringbootDemo.demos.web.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lehaha.SpringbootDemo.demos.web.demo.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

}