package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.facultaddao;
import com.example.demo.entity.facultad;
import com.example.demo.repository.facultadrepository;
@Component
public class facultaddaoImpl implements facultaddao{
@Autowired
private facultadrepository repository;
	@Override
	public facultad create(facultad a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public facultad update(facultad a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<facultad> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<facultad> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
