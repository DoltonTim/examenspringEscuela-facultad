package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.facultaddao;
import com.example.demo.entity.facultad;
import com.example.demo.service.facultadservice;
@Service
public class facultadserviceImpl  implements facultadservice{
   @Autowired
   private facultaddao dao;
	@Override
	public facultad create(facultad a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public facultad update(facultad a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<facultad> read(Long id) {
		// TODO Auto-generated method stub
		return  dao.read(id);
	}

	@Override
	public List<facultad> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}


}
