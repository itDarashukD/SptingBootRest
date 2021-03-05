//package com.example.darashuk.controllers;
//
//
//
//import com.example.darashuk.entity.Employee;
//import com.example.darashuk.services.IEmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class MyRestController {
//
//    private IEmployeeService employeeService;
//
//    @Autowired
//    public MyRestController(IEmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/employees")
//    public List<Employee> showAllEmployees(){
//        List<Employee> employeeList = employeeService.getAll();
//        return employeeList;
//    }
//
//    @GetMapping("employees/{id}")
//    public Employee getEmployee(@PathVariable int id){
//        Employee employee = employeeService.getById(id);
//
//        return employee;
//    }
//
//    @PostMapping("employees")
//    public Employee   addNewEmployee(@RequestBody Employee employee){
//
//        employeeService.save(employee);
//        return employeeService.getById(employee.getId());
//    }
//
//    @PutMapping("employees")
//    public Employee updateEmployee(@RequestBody Employee employee){
//
//        employeeService.save(employee);
//
//        return employeeService.getById(employee.getId());
//    }
//
//    @DeleteMapping("employees/{id}")
//    public String deleteEmployee(@PathVariable int id){
//
//        employeeService.delete(id);
//        return "employee "+ id +"was deleted";
//    }
//
//    @GetMapping("employees/name/{name}")
//    public List<Employee> findEmployeesByName(@PathVariable String name){
//
//        return employeeService.findEmployeesByName(name);
//    }
//
//
//}
