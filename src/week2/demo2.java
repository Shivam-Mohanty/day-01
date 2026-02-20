package week2;

import java.util.Scanner;

class Rectangle{
    double length;
    double breadth;

    void read(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        length = sc.nextDouble();

        System.out.println("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }

    void calculate(){
        double peri = 2 * (length * breadth);
        double area = length * breadth;
        System.out.println("Perimeter of the rectangle is: " + peri);
        System.out.println("Area of the rectangle is: " + area);
    }
}

public class demo2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.read();
        rect.calculate();
    }
}
