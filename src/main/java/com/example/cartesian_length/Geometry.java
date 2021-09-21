package com.example.cartesian_length;

public class Geometry {
    public int [] setCoordinate(int x, int y) {
        int [] coordinate = new int[2];

        coordinate[0] = x;
        coordinate[1] = y;

        return coordinate;
    }

    public double calculateDistance(int [] coordinate1, int [] coordinate2) {
        int x = coordinate1[0] - coordinate2[0];
        int y = coordinate1[1] - coordinate2[1];

        return Math.sqrt((x*x) + (y*y));
    }
}
