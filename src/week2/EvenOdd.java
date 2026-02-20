package week2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int even = 0;
        int odd = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i=0; i < 10; i++){
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            if(numbers[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Number of even numbers:" + even);
        System.out.println("Number of odd numbers:" + odd);

        sc.close();
    }
}