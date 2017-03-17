package com.mashofy.admin.dao;

import com.mashofy.admin.model.Employee;

import java.util.List;

/**
 * Created by sushant on 3/15/17.
 */
public interface EmployeeDao {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

}
