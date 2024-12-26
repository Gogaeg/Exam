package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CircleTest {

    @Test
    public void testMaxCircle() {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(12));
        circles.add(new Circle(100.00));
        circles.add(new Circle(54.00));

        Circle maxCircle = Collections.max(circles);

        assertEquals(100.00, maxCircle.radius, 0.001);
    }

    @Test
    public void testSingleCircle() {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(42.0));

        Circle maxCircle = Collections.max(circles);

        assertEquals(42.0, maxCircle.radius, 0.001);
    }

}