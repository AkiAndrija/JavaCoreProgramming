package ba.smoki.nine.human;

import ba.smoki.nine.animal.Animal;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;

    private Animal animal;

    public Person() {

    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        //35 godina 3 mjeseca 2 dana
        Period period = birthday.until(today);
        System.out.println("Years = " + period.getYears());
        System.out.println("Months = " + period.getMonths());
        System.out.println("Days = " + period.getDays());
        return period.getYears();
    }
}
