package com.example.darashuk.dao;

import com.example.darashuk.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findEmployeesByName(String name);

}
