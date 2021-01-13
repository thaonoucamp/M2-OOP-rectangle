package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width : ");
        double width = sc.nextDouble();

        System.out.println("Enter the height : ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.show());
        System.out.println("Perimeter of the Rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
    // B1: Tao lop, khai bao thuoc tinh,dinh nghia phuong thuc;
    public static class Rectangle {
        double width;
        double height;

        public Rectangle() {

        }
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String show() {
            return "Rectangle{" +"width: "+width+", height: "+height+"}";
        }
    }
}
