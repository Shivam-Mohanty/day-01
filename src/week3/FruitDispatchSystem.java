package week3;

class Apple {
    void show() {
        System.out.println("This is the Apple class.");
    }
}

class Banana extends Apple {
    @Override
    void show() {
        System.out.println("This is the Banana class.");
    }
}

class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("This is the Cherry class.");
    }
}

public class FruitDispatchSystem {
    public static void main(String[] args) {
        Apple ref; // Base class reference [cite: 114]

        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}
