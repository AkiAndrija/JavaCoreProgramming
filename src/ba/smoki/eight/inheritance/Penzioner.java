package ba.smoki.eight.inheritance;

import ba.smoki.eight.oop.Person;
import ba.smoki.eight.oop.PersonDemo;

public class Penzioner extends PersonDemo {
    private double pensionAmount;


    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }

    public double getPensionAmount() {
        return pensionAmount;
    }
}
