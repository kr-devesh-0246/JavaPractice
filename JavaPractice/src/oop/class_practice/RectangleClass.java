package oop.class_practice;

public class RectangleClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.0, 2.0);
        System.out.println(r1.length);
        System.out.println(r1.breadth);
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
    }
}

class Rectangle{
    //attribute
    double length = 10;
    double breadth = 20;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //behaviour
    double getPerimeter() {
        return  length + breadth + length + breadth ;
    }

    double getArea() {
        return length*breadth;
    }
}