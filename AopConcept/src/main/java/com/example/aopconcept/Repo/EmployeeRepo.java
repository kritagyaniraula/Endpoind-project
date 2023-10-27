package com.example.aopconcept.Repo;

import com.example.aopconcept.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
