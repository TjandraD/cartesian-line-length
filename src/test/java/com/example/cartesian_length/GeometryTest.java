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
}
