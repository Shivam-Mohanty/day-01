package week2;

class RectangleTask {
    int length;
    int breadth;

    RectangleTask() {
        length = 0;
        breadth = 0;
    }

    RectangleTask(int l, int b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        RectangleTask rect1 = new RectangleTask();
        rect1.calculateArea();

        RectangleTask rect2 = new RectangleTask(10, 5);
        rect2.calculateArea();
    }
}