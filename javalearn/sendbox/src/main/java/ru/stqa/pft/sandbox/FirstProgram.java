package ru.stqa.pft.sandbox;

public class FirstProgram {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        Square s = new Square(8);
        System.out.println("Площадь квадрата со стороной " + s.a + " = " + s.area());

        Point t1 = new Point (2,5);
        Point t2 = new Point (4,8);
        System.out.println("Расстояние между двумя точками на плоскости " + t1.x + ";" + t1.y + " и " + t2.x + ";" + t2.y + " = " + t1.distance(t2));
    }
}