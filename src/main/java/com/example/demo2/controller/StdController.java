package com.example.demo2.controller;

import com.example.demo2.entity.Student;
import com.example.demo2.service.stdservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StdController {
    @Autowired
    private stdservice s;

    @GetMapping("/api")
    public String Test(){
        return "heyyy";
    }

    //check
    @PostMapping("/save")
    private Student savestudent(@RequestBody Student std){
        return s.savestudent(std);
    }

    @GetMapping("/fetch")
    public List<Student> fetchstudent(){
        return s.fetch();
    }

    @GetMapping("/fetchid/{id}")
    public Student fetchid(@PathVariable("id") Long id){
        return s.fetchid(id);
    }

    @DeleteMapping("del/{id}")
    public  String delbyid(@PathVariable("id") Long id){
        return  s.delbyid(id);
    }

    @PutMapping("update/{id}")
    public  Student updatebyid(@PathVariable("id") Long id,@RequestBody Student std){
        return  s.updatebyid(id, std);
    }

    @GetMapping("fetchb/{branch}")
    public  List<Student> fetchb(@PathVariable("branch") String branch){
        return s.fetchb(branch);
    }

}
