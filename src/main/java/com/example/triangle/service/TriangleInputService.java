package com.example.triangle.service;

import com.example.triangle.model.RightTriangleOutput;
import com.example.triangle.model.TriangleInput;
import com.example.triangle.model.TriangleOutput;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TriangleInputService {
    public TriangleOutput calculate(TriangleInput triangleInput) {
        Double aSide = triangleInput.getASide();
        Double bSide = triangleInput.getBSide();
        Double cSide = triangleInput.getCSide();
        Double abAngle = triangleInput.getAbAngle();
        Double acAngle = triangleInput.getAcAngle();
        Double bcAngle = triangleInput.getBcAngle();
        TriangleOutput output;
        if (abAngle == 90 || acAngle == 90 || bcAngle == 90) {
            RightTriangleOutputService rightTriangleOutputService = new RightTriangleOutputService();
            Double perimeter = rightTriangleOutputService.calculatePerimeter(aSide, bSide, cSide);
            System.out.println("Периметр " + perimeter);
            Double area = rightTriangleOutputService.calculateArea(aSide, bSide, abAngle);
            System.out.println("Площадь " + area);
            List<Double> medians = rightTriangleOutputService.calculateMedians(aSide, bSide, cSide, abAngle, bcAngle, acAngle);
            System.out.println("Медианы " + medians);
            List<Double> heights = rightTriangleOutputService.calculateHeights(area, aSide, bSide, cSide);
            System.out.println("Высоты " + heights);
            String type = rightTriangleOutputService.identifyType(aSide, bSide, cSide, abAngle, bcAngle, acAngle);
            System.out.println("Тип " + type);
            output = new RightTriangleOutput(area, perimeter, type, medians, Collections.emptyList(), heights, 0, 0, 0, 0, 0, 0, 0);
        } else {
            TriangleOutputService triangleOutputService = new TriangleOutputService();
            Double perimeter = triangleOutputService.calculatePerimeter(aSide, bSide, cSide);
            System.out.println("Периметр " + perimeter);
            Double area = triangleOutputService.calculateArea(aSide, bSide, abAngle);
            System.out.println("Площадь " + area);
            List<Double> medians = triangleOutputService.calculateMedians(aSide, bSide, cSide, abAngle, bcAngle, acAngle);
            System.out.println("Медианы " + medians);
            List<Double> heights = triangleOutputService.calculateHeights(area, aSide, bSide, cSide);
            System.out.println("Высоты " + heights);
            String type = triangleOutputService.identifyType(aSide, bSide, cSide, abAngle, bcAngle, acAngle);
            System.out.println("Тип " + type);
            output = new TriangleOutput(area, perimeter, type, medians, Collections.emptyList(), heights, 0, 0);
        }
        return output;
    }
}
