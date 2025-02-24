package com.bridgelabz.payroll.repository;

import com.bridgelabz.payroll.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

