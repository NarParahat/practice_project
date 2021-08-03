package com.parahat;

public class RedTriangle extends Triangle {
    RedTriangle(String n, String c, Double a) {
        super(n, c, a);
    }

    @Override
    public String getColor(){

        return "red";
    }
}
