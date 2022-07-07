package com.fasttrack.map;

import java.util.Objects;

public class Person {
    private String cnp;
    private String name;
    private Integer age;

    public Person(String cnp, String name, Integer age) {
        this.cnp = cnp;
        this.name = name;
        this.age = age;
    }

    public String getCnp() {
        return cnp;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cnp='" + cnp + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(cnp, person.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }
}
