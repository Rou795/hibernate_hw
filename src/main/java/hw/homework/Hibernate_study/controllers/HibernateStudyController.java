package hw.homework.Hibernate_study.controllers;

import hw.homework.Hibernate_study.models.Person;
import hw.homework.Hibernate_study.repositories.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HibernateStudyController {
    final AppRepository repository;

    @Autowired
    public HibernateStudyController(AppRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonByCity(@RequestParam String city) {
        return repository.getPersonByCity(city);
    }
}
