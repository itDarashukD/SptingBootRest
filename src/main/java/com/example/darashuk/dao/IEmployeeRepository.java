package com.example.darashuk.dao;

import com.example.darashuk.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {

//
//    List<Employee> findEmployeesByName(String name);

}
