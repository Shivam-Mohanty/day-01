package week3;

import java.util.Scanner;

class TwoDSheet {
    double length, breadth;

    TwoDSheet(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    double calculateAreaCost() {
        return length * breadth * 40; // Rs 40 per sq ft [cite: 104]
    }
}

class ThreeDBox extends TwoDSheet {
    double height;

    ThreeDBox(double l, double b, double h) {
        super(l, b);
        this.height = h;
    }

    double calculateVolumeCost() {
        return length * breadth * height * 60; // Rs 60 per cubic ft [cite: 104]
    }
}

public class PlasticCostEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, breadth, and height: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        ThreeDBox box = new ThreeDBox(l, b, h);
        System.out.println("Cost of 2D Sheet: Rs " + box.calculateAreaCost());
        System.out.println("Cost of 3D Box: Rs " + box.calculateVolumeCost());
        sc.close();
    }
}