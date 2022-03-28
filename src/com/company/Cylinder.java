package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return height*super.area();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius = "+super.getRadius()+","+
                "height=" + height +","+
                "volume = "+this.volume()+
                '}';
    }
}
