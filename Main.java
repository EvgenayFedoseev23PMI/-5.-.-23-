package org.example;

public class Main {
    public static void main(String[] args) {
        Progression arithmeticProgression = new ArithmeticProgression(1, 2);
        Progression geometricalProgression = new GeometricalProgression(1, 2);
        System.out.println(arithmeticProgression.sum(5));
        System.out.println(geometricalProgression.sum(5));
    }
}