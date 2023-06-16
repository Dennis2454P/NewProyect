package com.motorgbs.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motorgbs.apirest.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
