package oop.class_practice;
public class Circle{
    public void main(String[] args){
        Circles c1= new Circles();
        c1.radius = radius;
    }

    class Circles {
        double radius;

        public void Circle(){
            this.radius = radius;
        }

        double getArea(){
            return Math.PI * radius * radius;
        }
        double getPerimeter(){
            return 2 * Math.PI * radius;
        }
    }
}