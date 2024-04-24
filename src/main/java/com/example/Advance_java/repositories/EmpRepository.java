package com.example.Advance_java.repositories;

import com.example.Advance_java.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository <Employee, Long>{
}
