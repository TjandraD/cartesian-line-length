package com.example.cartesian_length;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometryTest {
    @Test
    public void testSetCoordinate() {
        Geometry geometry = new Geometry();
        int [] functionResult = geometry.setCoordinate(1, 2);

        int [] expectedResult = {1, 2};

        assertEquals(expectedResult[0], functionResult[0]);
    }

    @Test
    public void testCalculateDistance() {
        Geometry geometry = new Geometry();

        int [] firstPoint = {2, 5};
        int [] secondPoint = {3, 6};

        double result = geometry.calculateDistance(firstPoint, secondPoint);

        assertEquals(1.4142135623730951, result, 0.0);
    }
}
