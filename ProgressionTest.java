package org.example;

import static org.junit.jupiter.api.Assertions.*;

public class ProgressionTest {

    @org.junit.jupiter.api.Test
    public void testArithmeticProgression() {
        Progression arithmeticProgression = new ArithmeticProgression(1, 2);
        assertEquals(25, arithmeticProgression.sum(5));
    }

    @org.junit.jupiter.api.Test
    public void testGeometricalProgression() {
        Progression geometricalProgression = new GeometricalProgression(1, 2);
        assertEquals(31, geometricalProgression.sum(5));
    }
}