package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.escueladao;
import com.example.demo.entity.escuela;
import com.example.demo.repository.escuelarepository;
@Component
public class escueladaoImpl  implements escueladao {
     @Autowired
     private escuelarepository repository;
	@Override
	public escuela create(escuela a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public escuela update(escuela a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<escuela> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<escuela> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
