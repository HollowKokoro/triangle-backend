package com.example.triangle.model;

public class TriangleInput {
    private final double aSide;
    private final double bSide;
    private final double cSide;
    private final double abAngle;
    private final double bcAngle;
    private final double acAngle;

    public TriangleInput(Double aSide, double bSide, double cSide, double abAngle, double bcAngle, double acAngle) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        this.abAngle = abAngle;
        this.bcAngle = bcAngle;
        this.acAngle = acAngle;
    }

    public double getASide() {
        return aSide;
    }

    public double getBSide() {
        return bSide;
    }

    public double getCSide() {
        return cSide;
    }

    public double getAbAngle() {
        return abAngle;
    }

    public double getBcAngle() {
        return bcAngle;
    }

    public double getAcAngle() {
        return acAngle;
    }
}
