package ba.smoki.nine;

import ba.smoki.eight.inheritance.Penzioner;
import ba.smoki.nine.animal.Cat;
import ba.smoki.nine.animal.Dog;
import ba.smoki.nine.human.*;

public class TestDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Duck duck = new Duck();
        Pensioner pensioner = new Pensioner();
        pensioner.setAnimal(duck);
        int number = 23;
        //dog je tipa Dog, Animal
        Dog dog = new Dog();
        pensioner.setAnimal(dog);
        Cat cat = new Cat();
        pensioner.setAnimal(cat);
        Employee employee = new Employee();
        Cat cat2 = new Cat();
        employee.setAnimal(cat2);
        Student student = new Student();
        Rabbit rabbit = new Rabbit();

    }
}
