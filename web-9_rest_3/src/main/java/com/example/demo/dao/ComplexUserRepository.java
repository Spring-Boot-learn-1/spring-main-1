package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ComplexUser;

public interface ComplexUserRepository extends JpaRepository<ComplexUser,Integer>{

}
