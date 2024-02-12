package com.example.triangle.model;

import java.util.List;

public class RightTriangleOutput extends TriangleOutput {
    private final double sine;
    private final double cosine;
    private final double tangent;
    private final double leg;
    private final double hypotenuse;

    public RightTriangleOutput(Double area, double perimeter, String type, List<Double> median, List<Double> bisector, List<Double> height, double areaOfInscribedCircle, double areaOfCircumscribedCircle, double sine, double cosine, double tangent, double leg, double hypotenuse) {
        super(area, perimeter, type, median, bisector, height, areaOfInscribedCircle, areaOfCircumscribedCircle);
        this.sine = sine;
        this.cosine = cosine;
        this.tangent = tangent;
        this.leg = leg;
        this.hypotenuse = hypotenuse;
    }

    public double getSine() {
        return sine;
    }

    public double getCosine() {
        return cosine;
    }

    public double getTangent() {
        return tangent;
    }

    public double getLeg() {
        return leg;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public String toString() {
        return "RightTriangleOutput{" +
                "sine=" + sine +
                ", cosine=" + cosine +
                ", tangent=" + tangent +
                ", leg=" + leg +
                ", hypotenuse=" + hypotenuse +
                '}';
    }
}
