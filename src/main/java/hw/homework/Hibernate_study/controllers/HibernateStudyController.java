package hw.homework.Hibernate_study.controllers;

import hw.homework.Hibernate_study.models.Person;
import hw.homework.Hibernate_study.repositories.AppRepository;
import hw.homework.Hibernate_study.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HibernateStudyController {
    final PersonRepository repository;

    @Autowired
    public HibernateStudyController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> findAllByCityQuery(@RequestParam String city) {
        return repository.findAllByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getByLessThanAgeQuery(@RequestParam Integer age) {
        return repository.findAllByLessThanAgeQuery(age);
    }

    @GetMapping("/persons/by-name-surname")
    public List<Person> getByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return repository.findAllByNameAndSurname(name, surname);
    }
}
