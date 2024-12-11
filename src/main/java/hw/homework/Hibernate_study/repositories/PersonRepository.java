package hw.homework.Hibernate_study.repositories;

import hw.homework.Hibernate_study.models.MainData;
import hw.homework.Hibernate_study.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PersonRepository extends JpaRepository<Person, MainData> {

    @Query("select p from Person p where p.city = :city")
    List<Person> findAllByCityQuery(@Param("city") String city);

    List<Person> findAllByCity(String city);

    @Query(value = "select * from Persons p where age < ?1 order by age", nativeQuery = true)
    List<Person> findAllByLessThanAgeQuery(Integer age);

    List<Person> findAllByMainData_AgeLessThanOrderByMainData_AgeAsc(Integer age);

    @Query(value = "select * from Persons p where name = ?1 and surname = ?2", nativeQuery = true)
    List<Person> findAllByNameAndSurname(String age, String surname);

    List<Person> findAllByMainData_NameAndMainData_Surname(String name, String surname);
}