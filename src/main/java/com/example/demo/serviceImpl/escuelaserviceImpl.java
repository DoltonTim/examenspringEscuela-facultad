package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.escueladao;
import com.example.demo.entity.escuela;
import com.example.demo.service.escuelaservice;
@Service
public class escuelaserviceImpl implements escuelaservice{
@Autowired
private escueladao dao;
	@Override
	public escuela create(escuela a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public escuela update(escuela a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<escuela> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<escuela> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
