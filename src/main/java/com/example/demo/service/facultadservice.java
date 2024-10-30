package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.entity.facultad;

public interface facultadservice {

	facultad create(facultad a);
	facultad update(facultad a);
	void  delete(Long id);
	Optional<facultad>read(Long id);
	List<facultad>readAll();
}


