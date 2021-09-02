package com.employeedemo.demotivirus;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    List<Employee> findAll();

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);

    Employee findEmployeeById(Long id);
}
