package org.example;

public class ArithmeticProgression extends Progression{
    public ArithmeticProgression(double firstTerm, double difference) {
        super(firstTerm, difference);
    }

    @Override
    public double sum(int n) {
        return (n * (2 * firstTerm + (n - 1) * differenceOrRatio)) / 2;
    }

}
