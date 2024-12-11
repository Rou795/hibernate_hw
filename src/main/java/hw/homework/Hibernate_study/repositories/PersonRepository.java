package hw.homework.Hibernate_study.repositories;

import hw.homework.Hibernate_study.models.MainData;
import hw.homework.Hibernate_study.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PersonRepository extends JpaRepository<Person, MainData> {

    List<Person> findAllByCity(String city);

    List<Person> findAllByMainData_AgeLessThanOrderByMainData_AgeAsc(Integer age);

    List<Person> findAllByMainData_NameAndMainData_Surname(String name, String surname);
}