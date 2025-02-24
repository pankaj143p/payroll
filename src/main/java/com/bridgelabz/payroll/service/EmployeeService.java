package com.bridgelabz.payroll.service;

import com.bridgelabz.payroll.entity.Employee;
import com.bridgelabz.payroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
   @Autowired
    EmployeeRepository empRes;
   // method for find all employees
    public List<Employee> getAllEmployees(){
        return empRes.findAll();
    }

    // find employee by id
    public Employee getEmployeeById(Long id){
        return empRes.findById(id).orElse(null);
    }

    // save employee
    public Employee saveEmployee(Employee emp){
        return empRes.save(emp);
    }

    // for delete employee
    public boolean deleteEmployee(Long id){
        if(empRes.existsById(id)) {
            empRes.deleteById(id);
            return true;
        }
        return false;
    }

    // update employee details
    public Employee updateEmployee(Long id, String name, String salary){
        Optional<Employee> exemp = empRes.findById(id);
        if(exemp.isPresent()){
            Employee em = exemp.get();
            em.setname(name);
            em.setSalary(salary);
            return empRes.save(em);
        }
        return null;
    }
}
