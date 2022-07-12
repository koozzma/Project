package ru.project.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;
    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 10,max = 100,message = "имя должно содержать от 10 до 100 символов")
    private String fullName;
    @Min(value = 1980,message = "Год рождения должен быть не меньше 1980")
    private int birthday;

    public Person(int id, String fullName, int birthday) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
}
