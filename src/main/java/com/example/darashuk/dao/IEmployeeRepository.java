package com.example.darashuk.dao;

import com.example.darashuk.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {

}
