package week3;

import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Acc No: " + acc_no + " | Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar No: ");
        aadhar_no = sc.nextLine();
        super.input(); // Call base class input [cite: 117]
    }

    @Override
    void disp() {
        System.out.print("Name: " + name + " | Aadhar: " + aadhar_no + " | ");
        super.disp(); // Call base class display [cite: 118]
    }
}

public class BankingPersonRegistry {
    public static void main(String[] args) {
        Person[] group = new Person[3]; // Registry for 3 persons [cite: 119]

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEntering details for Person " + (i + 1) + ":");
            group[i] = new Person();
            group[i].input();
        }

        System.out.println("\n--- Displaying All Registered Details ---");
        for (Person p : group) {
            p.disp();
        }
    }
}
