package hw.homework.Hibernate_study.repositories;

import hw.homework.Hibernate_study.models.MainData;
import hw.homework.Hibernate_study.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, MainData> {
}