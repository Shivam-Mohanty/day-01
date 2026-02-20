package week3;

class Plate {
    double length, width;
    Plate(double l, double w) {
        this.length = l;
        this.width = w;
        System.out.println("Plate constructor: Dimensions " + length + "x" + width);
    }
}

class Box extends Plate {
    double height;
    Box(double l, double w, double h) {
        super(l, w);
        this.height = h;
        System.out.println("Box constructor: Height " + height);
    }
}

class WoodBox extends Box {
    double thickness;
    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        this.thickness = t;
        System.out.println("WoodBox constructor: Thickness " + thickness);
    }
}

public class MultiLevelInheritanceTracker {
    public static void main(String[] args) {
        System.out.println("Initializing WoodBox...");
        new WoodBox(10.5, 8.2, 5.0, 0.5); // [cite: 111]
    }
}