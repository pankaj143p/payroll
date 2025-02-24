package com.bridgelabz.payroll.controller;

import com.bridgelabz.payroll.entity.Employee;
import com.bridgelabz.payroll.repository.EmployeeRepository;
import com.bridgelabz.payroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService empSer;

    @GetMapping
    // for show all emplees and details
    public List<Employee> getAllEmployees(){
        return empSer.getAllEmployees();
    }

    @GetMapping({"get/{id}"})
    public Employee getEmployeeById(@PathVariable Long id){
        return empSer.getEmployeeById(id);
    }

    // post mapping
    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp){
        return empSer.saveEmployee(emp);
    }

    // for delete employee by id
    @DeleteMapping({"delete/{id}"})
    public String deleteEmployee(@PathVariable Long id){
        boolean delete = empSer.deleteEmployee(id);
        return (delete) ? "Employee deleted successfully" : "Employee Not Found!";
    }

    // for update employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestParam String name, @RequestParam String salary){
        return empSer.updateEmployee(id,name,salary);
    }

}
