package hw.homework.Hibernate_study.models;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Entity
@Table(name = "persons")
public class Person {

    @Column(name = "phone_number")
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String phone_number;

    @Column(name = "city_of_living")
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String city_of_living;

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "name")),
            @AttributeOverride(name = "surname", column = @Column(name = "surname")),
            @AttributeOverride(name = "age", column = @Column(name = "age"))
    })
    private MainData mainData;

    public MainData getMainData() {
        return mainData;
    }

    public void setMainData(MainData mainData) {
        this.mainData = mainData;
    }

    public String getCity_of_living() {
        return city_of_living;
    }

    public void setCity_of_living(String city_of_living) {
        this.city_of_living = city_of_living;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(phone_number, person.phone_number) && Objects.equals(city_of_living, person.city_of_living) && Objects.equals(mainData, person.mainData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone_number, city_of_living, mainData);
    }
}