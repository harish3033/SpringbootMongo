package com.controller;

import com.model.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.repository.EmployRepository;



@RestController
@RequestMapping("/employ")
public class Controller {

    @Autowired
    EmployRepository employRepository;

    //create
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Employ employ){
    employRepository.save(employ);
    }

    //read
    @RequestMapping(value = "/{id}")
    public Employ read(@PathVariable String id){
        return employRepository.findOne(id);
    }

    //update
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Employ employ){
        employRepository.save(employ);
    }

    //delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        public void delete(@PathVariable String id){
        employRepository.delete(id);
    }
}
