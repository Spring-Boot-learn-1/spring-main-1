package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SimpleUser;

public interface SimpleUserRepository extends JpaRepository<SimpleUser,Integer>{

}
