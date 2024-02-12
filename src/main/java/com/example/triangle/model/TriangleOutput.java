package com.example.triangle.model;

import java.util.List;

public class TriangleOutput {
    private final double area;
    private final double perimeter;
    private final String type;
    private final List<Double> medianList;
    private final List<Double> bisector;
    private final List<Double> heights;
    private final double areaOfInscribedCircle;
    private final double areaOfCircumscribedCircle;

    public TriangleOutput(Double area, double perimeter, String type, List<Double> medianList, List<Double> bisector, List<Double> heights, double areaOfInscribedCircle, double areaOfCircumscribedCircle) {
        this.area = area;
        this.perimeter = perimeter;
        this.type = type;
        this.medianList = medianList;
        this.bisector = bisector;
        this.heights = heights;
        this.areaOfInscribedCircle = areaOfInscribedCircle;
        this.areaOfCircumscribedCircle = areaOfCircumscribedCircle;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public String getType() {
        return type;
    }

    public List<Double> getMedians() {
        return medianList;
    }

    public List<Double> getBisector() {
        return bisector;
    }

    public List<Double> getHeights() {
        return heights;
    }

    public double getAreaOfInscribedCircle() {
        return areaOfInscribedCircle;
    }

    public double getAreaOfCircumscribedCircle() {
        return areaOfCircumscribedCircle;
    }

    @Override
    public String toString() {
        return "TriangleOutput{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", type='" + type + '\'' +
                ", medianList=" + medianList +
                ", bisector=" + bisector +
                ", heights=" + heights +
                ", areaOfInscribedCircle=" + areaOfInscribedCircle +
                ", areaOfCircumscribedCircle=" + areaOfCircumscribedCircle +
                '}';
    }
}
