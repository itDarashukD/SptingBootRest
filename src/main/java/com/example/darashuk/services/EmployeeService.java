package com.example.darashuk.services;



import com.example.darashuk.dao.IEmployeeRepository;
import com.example.darashuk.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    private IEmployeeRepository IEmployeeRepository;

    @Autowired
    public EmployeeService(IEmployeeRepository IEmployeeRepository) {
        this.IEmployeeRepository = IEmployeeRepository;
    }


    @Override
    public List<Employee> getAll() {
        return IEmployeeRepository.findAll();
    }


    @Override
    public void save(Employee employee) {
        IEmployeeRepository.save(employee);
    }


    @Override
    public Employee getById(int id) {
        Employee employee = null;
        Optional<Employee> optional = IEmployeeRepository.findById(id);

        if (optional.isPresent()) {
            employee = optional.get();
        }
        return employee;
    }


    @Override
    public void delete(int id) {
        IEmployeeRepository.deleteById(id);

    }

    @Override
    public List<Employee> findEmployeesByName(String name) {

        List<Employee>employeeList = IEmployeeRepository.findEmployeesByName(name);
        return employeeList;
    }
}
