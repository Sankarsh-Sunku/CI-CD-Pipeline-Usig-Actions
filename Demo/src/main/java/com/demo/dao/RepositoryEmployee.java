package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Employee;


public interface RepositoryEmployee extends JpaRepository<Employee, Integer> {

}
