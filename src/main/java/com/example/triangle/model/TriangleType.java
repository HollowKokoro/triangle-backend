package com.example.triangle.model;

public enum TriangleType {
    SCALENE("scalene"),
    EQUILATERAL("equilateral"),
    ISOSCELES("isosceles"),
    ACUTE("acute"),
    RIGHT("right"),
    OBTUSE("obtuse");

    private final String type;

    TriangleType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
