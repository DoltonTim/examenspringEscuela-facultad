package com.example.demo.dao;

import java.util.List;
import java.util.Optional;


import com.example.demo.entity.escuela;

public interface escueladao {
	escuela create(escuela a);
	escuela  update(escuela a);
	void delete(Long id);
	Optional<escuela>read(Long id);
	List<escuela >readAll();
}