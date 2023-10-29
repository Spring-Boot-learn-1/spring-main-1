package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.JavaUser;

public interface UserRepo extends CrudRepository<JavaUser,Integer> {

}
