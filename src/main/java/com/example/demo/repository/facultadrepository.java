package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.facultad;

@Repository
public interface facultadrepository extends JpaRepository<facultad, Long> {

}
