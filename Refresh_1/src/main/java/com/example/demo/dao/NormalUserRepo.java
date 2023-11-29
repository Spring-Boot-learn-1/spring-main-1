package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.NormalUser;

public interface NormalUserRepo extends JpaRepository<NormalUser,Integer>{

}
