package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.JavaUser;

public interface JavaUserRepo extends CrudRepository<JavaUser,Integer>{

}
