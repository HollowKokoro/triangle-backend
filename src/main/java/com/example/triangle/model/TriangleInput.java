package com.example.triangle.model;

public class TriangleInput {
    private final Integer a;
    private final Integer b;
    private final Integer c;
    private final Integer ab;
    private final Integer bc;
    private final Integer ac;

    public TriangleInput(Integer a, Integer b, Integer c, Integer ab, Integer bc, Integer ac) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer getC() {
        return c;
    }

    public Integer getAb() {
        return ab;
    }

    public Integer getBc() {
        return bc;
    }

    public Integer getAc() {
        return ac;
    }
}
