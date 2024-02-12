package com.example.triangle.service;

import com.example.triangle.model.TriangleType;

import java.util.List;

public class TriangleOutputService {
    public Double calculatePerimeter(Double aSide, Double bSide, Double cSide) {
        return aSide + bSide + cSide;
    }

    public Double calculateArea(Double aSide, Double bSide, Double angle) {
        return 0.5 * aSide * bSide * Math.sin(Math.toRadians(angle));
    }

    public List<Double> calculateMedians(Double aSide, Double bSide, Double cSide, Double abAngle, Double bcAngle, Double acAngle) {
        return List.of(median(aSide, cSide, acAngle), median(bSide, aSide, abAngle), median(cSide, bSide, bcAngle));
    }

    public List<Double> calculateHeights(Double area, Double aSide, Double bSide, Double cSide) {
        return List.of(height(area, aSide), height(area, bSide), height(area, cSide));
    }

    private Double height(Double square, Double side) {
        return 2 * square / side;
    }

    private Double median(Double side1, Double side2, Double angle) {
        return Math.sqrt(Math.pow(side1 / 2, 2) + Math.pow(side2, 2) - side1 * side2 * Math.cos(Math.toRadians(angle)));
    }

    public String identifyType(Double aSide, Double bSide, Double cSide, Double abAngle, Double bcAngle, Double acAngle) {
        String typeByLengthsOfSides = identifyTypeByLengthsOfSides(aSide, bSide, cSide);
        String typeByInternalAngles = identifyTypeByInternalAngles(abAngle, bcAngle, acAngle);
        return typeByLengthsOfSides + " " + typeByInternalAngles;
    }

    private String identifyTypeByInternalAngles(Double abAngle, Double bcAngle, Double acAngle) {
        String type;
        if (abAngle < 90 && bcAngle < 90 && acAngle < 90) {
            type = TriangleType.ACUTE.getType();
        } else if (abAngle == 90 || bcAngle == 90 || acAngle == 90) {
            type = TriangleType.RIGHT.getType();
        } else {
            type = TriangleType.OBTUSE.getType();
        }
        return type;
    }

    private String identifyTypeByLengthsOfSides(Double aSide, Double bSide, Double cSide) {
        String type;
        if (aSide.equals(bSide) && bSide.equals(cSide)) {
            type = TriangleType.EQUILATERAL.getType();
        } else if (aSide.equals(bSide) || bSide.equals(cSide) || cSide.equals(aSide)) {
            type = TriangleType.ISOSCELES.getType();
        } else {
            type = TriangleType.SCALENE.getType();
        }
        return type;
    }
}
