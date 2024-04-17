package org.example;

public class GeometricalProgression extends Progression{
    public GeometricalProgression(double firstTerm, double ratio) {
        super(firstTerm, ratio);
    }

    @Override
    public double sum(int n) {
        return firstTerm * (1 - Math.pow(differenceOrRatio, n)) / (1 - differenceOrRatio);
    }
}
