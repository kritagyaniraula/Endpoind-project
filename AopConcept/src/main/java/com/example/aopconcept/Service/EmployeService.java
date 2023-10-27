package com.example.aopconcept.Service;

import com.example.aopconcept.Entity.Employee;
import com.example.aopconcept.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {

    @Autowired
     EmployeeRepo employeeRepo;

    public List<Employee> getallEmployee(){
  return employeeRepo.findAll();
    }


    public Employee addEmploye(Employee e){
        return employeeRepo.save(e);
    }
}
