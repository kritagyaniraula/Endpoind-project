package com.example.aopconcept.controller;

import com.example.aopconcept.Entity.Employee;
import com.example.aopconcept.Service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employe")
public class EmployeeController {

    @Autowired
    EmployeService employeService;

    @GetMapping("/all")
    public ResponseEntity<?> fletchAllEmployee(){
        return new ResponseEntity<List< Employee >>(employeService.getallEmployee(), HttpStatus.OK);
    }
      @PostMapping("/new")
    public ResponseEntity<?> addEmployee(@RequestBody Employee e){
        return new ResponseEntity<Employee>(employeService.addEmploye(e),HttpStatus.OK);

      }


}
