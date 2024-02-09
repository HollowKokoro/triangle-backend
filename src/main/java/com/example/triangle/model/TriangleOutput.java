package com.example.triangle.model;

public class TriangleOutput {
    private final Integer area;
    private final Integer perimeter;
    private final String type;
    private final Integer median;
    private final Integer bisector;
    private final Integer height;
    private final Integer areaOfInscribedCircle;
    private final Integer areaOfCircumscribedCircle;

    public TriangleOutput(Integer area, Integer perimeter, String type, Integer median, Integer bisector, Integer height, Integer areaOfInscribedCircle, Integer areaOfCircumscribedCircle) {
        this.area = area;
        this.perimeter = perimeter;
        this.type = type;
        this.median = median;
        this.bisector = bisector;
        this.height = height;
        this.areaOfInscribedCircle = areaOfInscribedCircle;
        this.areaOfCircumscribedCircle = areaOfCircumscribedCircle;
    }

    public Integer getArea() {
        return area;
    }

    public Integer getPerimeter() {
        return perimeter;
    }

    public String getType() {
        return type;
    }

    public Integer getMedian() {
        return median;
    }

    public Integer getBisector() {
        return bisector;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getAreaOfInscribedCircle() {
        return areaOfInscribedCircle;
    }

    public Integer getAreaOfCircumscribedCircle() {
        return areaOfCircumscribedCircle;
    }
}
