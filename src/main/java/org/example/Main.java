package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<Circle>();
        circles.add(new Circle(12));
        circles.add(new Circle(100.00));
        circles.add( new Circle(540.00));

        Circle maxCircle = Collections.max(circles);

        System.out.println("наибольший радиус " + maxCircle.radius);
    }
}


class Circle implements Comparable<Circle> {
    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }
}