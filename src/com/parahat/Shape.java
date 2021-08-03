package com.parahat;

public class Shape {

    String name;
    String color;
    Double area;

    Shape(String n, String c, Double a) {
        name = n;
        color = c;
        area = a;
    }

    public static void main(String[] args) {

        Triangle triangle = new Triangle("triangle","blue", 25d);
        Rectangle rectangle=new Rectangle("rectangle", "red", 8d);
        RedTriangle redTriangle = new RedTriangle("redTriangle", "yellow", 8d );
        Shape shape=new Shape("shape", "red", 5d);
        Shape circle = new Shape("circle", "red", 8d);
        RedTriangle cube = new RedTriangle("cube","green", 3d);

        System.out.println(triangle.getNumberOfAngles());
        System.out.println(triangle.getColor());
        System.out.println(rectangle.getNumberOfAngles());
        System.out.println(rectangle.getColor());
        System.out.println(cube.getNumberOfAngles());
        System.out.println(cube.getColor());
        System.out.println(redTriangle.getNumberOfAngles());
        System.out.println(circle.getNumberOfAngles());
        System.out.println(shape.getNumberOfAngles());

    }

    public int getNumberOfAngles() {

        return 0;
    }

    public String getColor(){

        return color;
    }
}