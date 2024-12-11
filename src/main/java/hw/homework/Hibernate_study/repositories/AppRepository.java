package hw.homework.Hibernate_study.repositories;

import hw.homework.Hibernate_study.models.MainData;
import hw.homework.Hibernate_study.models.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public class AppRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonByCity(String city) {
        String querry = "from Person where city_of_living = " + "'" + city + "'";
        List<Person> persons = entityManager.createQuery(querry).getResultList();
        System.out.println(persons);
        return persons;
    }
}
