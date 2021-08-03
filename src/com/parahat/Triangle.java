package com.parahat;

public class Triangle extends Shape{

        Triangle(String n, String c, Double a) {
        super(n, c, a);
        System.out.println(name);
        System.out.println(color);
    }
    @Override
    public int getNumberOfAngles() {

        return  3;
    }
}
