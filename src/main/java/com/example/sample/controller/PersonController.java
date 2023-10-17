package com.example.sample.controller;

import com.example.sample.model.Person;
import com.example.sample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/people")
    public List<Person> getAll() {
        return personRepository.findAll();
    }
}
