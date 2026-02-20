package week2;

import java.util.Scanner;

class   box{
    double length;
    double width;
    double height;

    double volume(){
        return length * width * height;
    }
}
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        box Box = new box();
        System.out.println("Enter the dimensions: ");

        System.out.println("Enter the length: ");
        Box.length = sc.nextDouble();

        System.out.println("Enter the width: ");
        Box.width = sc.nextDouble();

        System.out.println("Enter the height: ");
        Box.height = sc.nextDouble();

        System.out.println("Volume of the Box is: " + Box.volume());

    }
}
