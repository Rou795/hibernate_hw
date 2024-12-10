package hw.homework.Hibernate_study.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Embeddable
public class MainData {
    @Column(name = "name")
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String name;

    @Column(name = "surname")
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String surname;

    @Column(name = "age")
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MainData mainData)) return false;
        return Objects.equals(name, mainData.name) && Objects.equals(surname, mainData.surname) && Objects.equals(age, mainData.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}