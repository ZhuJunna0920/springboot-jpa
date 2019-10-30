package com.offcn.controller;

import java.util.List;

import com.offcn.bean.Person;
import com.offcn.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person2")
public class Person2Controller {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("findByNameIs/{name}")
    public Person findByNameIs(@PathVariable String name) {
        return personRepository.findByNameIs(name);
    }

    @GetMapping("findByNameIsAndPassword/{name}/{password}")
    public Person findByNameIsAndPassword(@PathVariable String name,@PathVariable String password) {
        return personRepository.findByNameIsAndPassword(name, password);
    }

    @GetMapping("findByNameContaining/{name}")
    public List<Person> findByNameContaining(@PathVariable String name) {
        return personRepository.findByNameContaining(name);
    }

}
