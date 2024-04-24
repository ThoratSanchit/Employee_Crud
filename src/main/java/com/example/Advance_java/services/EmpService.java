package com.example.Advance_java.services;

import com.example.Advance_java.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpService {
    public Employee saveData(Employee employee);
    public List<Employee> getData();

    public Employee getDataById(long id);
    public String updateStudent(long id, Employee employee);
    public void deleteData(long id);
}
