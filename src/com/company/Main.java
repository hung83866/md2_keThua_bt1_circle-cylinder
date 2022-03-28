package com.company;

public class Main {

    public static void main(String[] args) {
	// kiểm thử hình tròn
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("red");
        System.out.println(circle);

        // kiểm thử hình trụ
        Cylinder cylinder = new Cylinder(5,"blue",16);
        System.out.println(cylinder);
    }
}
