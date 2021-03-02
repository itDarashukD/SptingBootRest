package com.example.darashuk.dao;



import com.example.darashuk.entity.Employee;

import java.util.List;

public interface IEmployeeDao {
    public List<Employee> getAll();
    public void save(Employee employee);
    Employee getById(int id);
    void delete(int id);

}
