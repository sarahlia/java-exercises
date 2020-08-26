package com.sarahlia;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //distance between this Point and Point (0,0)
    public double distance() {
        return Math.sqrt((this.x*this.x)+(this.y*this.y));
    }

    //distance between this Point and Point (x,y)
    public double distance(int x, int y) {
        return Math.sqrt( ((x-this.x)*(x-this.x))  +  ((y-this.y)*(y-this.y)) );
    }

    //distance between this Point and another Point
    public double distance(Point another) {
        return distance(another.x, another.y);
    }
}
