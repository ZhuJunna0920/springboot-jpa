package com.offcn.controller;

import java.util.List;

import com.offcn.bean.Person;
import com.offcn.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping(path="addPerson")
    public void addPerson(@RequestBody Person person) {//注意：接收传递json格式的对象，需要增加注解：@RequestBody
        personRepository.save(person);
    }


    @GetMapping(path="getAllPerson")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    @DeleteMapping(path="deletePerson")
    public void deletePerson(@RequestParam Long id) {
        personRepository.deleteById(id);
    }

    @PutMapping(path="updatePerson")
    public void updatePerson(@RequestBody Person person) {
        personRepository.saveAndFlush(person);
    }

    //========================================================================================

    @PutMapping(path="updateName/{id}/{name}")
    public int updateName(@PathVariable Long id,@PathVariable String name) {
        return personRepository.UpdateName(id,name);
    }

    @DeleteMapping(path="deleteName/{name}")
    public int DeleteName(@PathVariable String name) {
        return personRepository.DeleteName(name);
    }
}