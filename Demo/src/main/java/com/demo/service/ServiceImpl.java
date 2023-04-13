package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.RepositoryEmployee;
import com.demo.entity.Employee;

@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	RepositoryEmployee dao;

	@Override
	public Employee add(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = dao.save(employee);
		return emp;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		Employee emp = dao.findById(id).get();
		return emp;
	}

}
