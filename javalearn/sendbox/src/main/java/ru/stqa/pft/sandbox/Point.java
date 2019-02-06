package ru.stqa.pft.sandbox;



public class Point {

    public double x;
    public double y;

    public  Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    public String distance(Point t2){
        double dx = this.x - t2.x;
        double dy = this.y - t2.y;
        double res = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));

        return String.format("%.2f", res);
    }
}