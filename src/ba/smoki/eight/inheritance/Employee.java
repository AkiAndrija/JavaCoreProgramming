package ba.smoki.eight.inheritance;

import ba.smoki.eight.oop.Person;
import ba.smoki.eight.oop.PersonDemo;

public class Employee extends PersonDemo {
        private double salary;


        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
}
