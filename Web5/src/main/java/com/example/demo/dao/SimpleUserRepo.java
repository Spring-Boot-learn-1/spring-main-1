package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.SimpleUser;

public interface SimpleUserRepo extends CrudRepository<SimpleUser,Integer> {

}
