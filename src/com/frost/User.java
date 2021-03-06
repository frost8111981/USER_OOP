package com.frost;

public class User {
    String name;
    String surname;
    String patronymic;
    String profession;
    int age;

    public User(String name, String surname, String patronymic, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.profession = profession;
        this.age = age;
    }

    public User(){};

    public String toString() {
        return surname + " " + name + " " + patronymic + ", по специальности " + profession + ", его возраст " + age + " лет.";
    }
}
