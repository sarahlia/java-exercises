package com.sarahlia;

public class PointApp {

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println("p.distance() = " + p.distance());

        Point firstPoint = new Point(6, 5);
        System.out.println("firstPoint.distance() = " + firstPoint.distance());

        Point secondPoint = new Point(3, 1);
        System.out.println("firstPoint.distance(secondPoint) = " + firstPoint.distance(secondPoint));

        System.out.println("firstPoint.distance(2, 2) = " + firstPoint.distance(2, 2));

        Point point = new Point();
        System.out.println("point.distance(-1, -1) = " + point.distance(-1, -1));
    }
}
