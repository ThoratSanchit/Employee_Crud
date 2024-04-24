package com.example.Advance_java.services.impl;

import com.example.Advance_java.models.Employee;
import com.example.Advance_java.repositories.EmpRepository;
import com.example.Advance_java.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmpService {
    @Autowired
    private EmpRepository empRepository;
    @Override
    public Employee saveData(Employee employee){
        return empRepository.save(employee);
    }
    @Override
   public List<Employee> getData(){
        return empRepository.findAll();
    }

    @Override
    public Employee getDataById(long id){
        Optional<Employee> emp=empRepository.findById(id);

        return emp.orElse(null);
    }

    @Override
    public  String updateStudent(long id, Employee employee){
        Optional<Employee> emp=empRepository.findById(id);
        if(emp.isPresent()){
            Employee existEmp=emp.get();
            existEmp.setName(employee.getName());
           existEmp.setSalary(employee.getSalary());
           existEmp.setAge(employee.getAge());
           empRepository.save(existEmp);
            return "Employee id "+id+" updated "+ existEmp;
        }else {
            return "Employee id "+ id +" details does not exist..";
        }
    }
    @Override
    public  void deleteData(long id){
        empRepository.deleteById(id);
    }


}
