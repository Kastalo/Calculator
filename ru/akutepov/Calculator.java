  package ru.akutepov;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double c = a + b;
        System.out.println("a + b = " + c);

        c = a - b;
        System.out.println("a - b = " + c);

        c = a / b;
        System.out.println("a / b = " + c);

        c = a * b;
        System.out.println("a * b = " + c);
    }

}
