package com.mashofy.admin.service;

import com.mashofy.admin.model.Employee;

import java.util.List;

/**
 * Created by sushant on 3/15/17.
 */

public interface EmployeeService {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

    boolean isEmployeeSsnUnique(Integer id, String ssn);

}