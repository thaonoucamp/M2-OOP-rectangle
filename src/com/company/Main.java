package com.company;

import java.util.Scanner;

public class Main {
    // B1: tao lop, khai bao thuoc tinh, dinh nghia phuong thuc khoi tao;
    public static class Rectangle {
        double width;
        double height;
    // constructor user;
        public Rectangle() {

        }
    // constructor developer;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

    // B2: dinh nghia phuong thuc tinh Dien tich;
       public double getArea() {
            return this.width * this.height;
       }
    // phuong thuc tinh Chu vi;
       public double getPerimeter() {
            return (this.width + this.height) * 2;
       }
    // Phuong thuc hien thi chieu rong va chieu dai;
       public String display() {
            return "Rectangle {"+"width: "+width+ ", height: "+height+"}";
       }
    }
    // B3: Tao Class chua phuong thuc main() de thuc thi;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = sc.nextDouble();

        System.out.println("Enter the height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
    // goi cac phuong thuc thong qua doi tuong da tao de hien thi thong so;
        System.out.println("Your Rectangle :" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());

    }
/*
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
*/
}
