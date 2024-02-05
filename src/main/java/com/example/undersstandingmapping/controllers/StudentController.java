package com.example.undersstandingmapping.controllers;

import com.example.undersstandingmapping.models.Student;
import com.example.undersstandingmapping.repositories.StudentRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// to mark this class as a controller.
// and return the output as json directly
@RestController
public class StudentController {

    // not a good idea to use repositories inside controllers

    // automatically wire an instance of repo to this class -> Autowired
    @Autowired
    private StudentRepository studentRepository;

    // actual url to which you're serving the response
    @RequestMapping("/getStudents")
    @CrossOrigin(origins = "*")
    public List<Student> getStudent(){

        return studentRepository.findAll();
    }
    // create another api , which allow the client to create a student via postman

    @RequestMapping(method = RequestMethod.PUT ,value = "/create")
    @CrossOrigin(origins = "*")
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student) ;
    }

    // create another api , which allows you to delete student by id
    @RequestMapping(method = RequestMethod.DELETE,value = "/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
    }
    // create an api , to get student by their name
    @RequestMapping(method = RequestMethod.GET,value = "/getStudent")
    @CrossOrigin(origins = "*")
    public Student getStudent(@RequestParam String name){
        return studentRepository.findByName(name) ;
    }
    // Transactions 1 and 2 completely.

}
