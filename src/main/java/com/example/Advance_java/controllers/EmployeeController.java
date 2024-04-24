package com.example.Advance_java.controllers;

import com.example.Advance_java.models.Employee;
import com.example.Advance_java.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
private EmpService empService;
    @PostMapping("/postData")
    public Employee saveData(@RequestBody Employee employee){
        return  this.empService.saveData(employee);
    }

    @GetMapping("/getData")
   public List<Employee> getData(){
   return  this .empService.getData();
    }

    @GetMapping("/getData/{id}")
    public Employee getDataById(@PathVariable long id){
        return  this.empService.getDataById(id);
    }
    @PutMapping("/updateData/{id}")
    public String updateStudent(@RequestBody Employee employee,@PathVariable long id){
        return this.empService.updateStudent(id,employee);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable  long id){
        empService.deleteData(id);
    }

}
