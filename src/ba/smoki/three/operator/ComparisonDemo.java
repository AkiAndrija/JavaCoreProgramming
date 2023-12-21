package ba.smoki.three.operator;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        //boolean comparisonResult = number1 == number2;
        if (number1 == number2) {
            System.out.println("Uneseni brojevi su jednaki");
        }
        if (number1 != number2) {
            System.out.println("Uneseni brojevi su nejednaki");
        }
        if (number1 > number2) {
            System.out.println("Prvi broj veći od drugog");
        }
        if (number1 >= number2) {
            System.out.println("Prvi broj veći ili jednak drugom");
        }
        if (number1 < number2) {
            System.out.println("Prvi manji od drugog");
        }
        if (number1 <= number2) {
            System.out.println("Prvi manji ili jednak drugom");
        }}}

