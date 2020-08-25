package com.sarahlia;

public class WallApp {

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
//        System.out.println("wall.getHeight() = " + wall.getHeight());
//        System.out.println("wall.getWidth() = " + wall.getWidth());
        System.out.println("wall.getArea() = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("wall.getWidth() = " + wall.getWidth());
        System.out.println("wall.getHeight() = " + wall.getHeight());
        System.out.println("wall.getArea() = " + wall.getArea());

        Wall newWall = new Wall(-1.125, -1.125);
        System.out.println("newWall.getWidth() = " + newWall.getWidth());
        System.out.println("newWall.getHeight() = " + newWall.getHeight());
        System.out.println("newWall.getArea() = " + newWall.getArea());

    }


}
