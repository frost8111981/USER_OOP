package com.frost;

public class User {
    String name;
    String surname;
    String patronymic;
    String profession;
    int age;
    String idTask;

    public User(String name, String surname, String patronymic, String profession, int age, String idTask) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.profession = profession;
        this.age = age;
        this.idTask = idTask;
    }

    public User(){

    }

    public String toString() {
        return surname + " " + name + " " + patronymic + ", по специальности " + profession + ", его возраст " + age + " лет" + ", заявка - " + idTask;
    }
}
