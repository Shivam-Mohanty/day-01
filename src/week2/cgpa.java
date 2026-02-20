package week2;

import java.util.Scanner;

class student{
    int rollno;
    String name;
    double cgpa;

    student(int rollno, String name, double cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Student details: \n" +
                "roll no: " + rollno + "\n" +
                "Name: " + name + "\n" +
                "cgpa: " + cgpa + "\n") ;
    }

}
public class cgpa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = scan.nextInt();
        student stu[] = new student[n];

        for (int i = 0; i < n ; i++){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the student details: ");
            System.out.println("Rollno: ");
            int rollno = sc.nextInt();

            sc.nextLine();

            System.out.println("name: ");
            String name = sc.nextLine();

            System.out.println("CGPA: ");
            double cgpa = sc.nextDouble();

            stu[i] = new student(rollno, name, cgpa);
        }

        System.out.println("printing student details: \n");
        for(int i = 0; i < n; i++){
            stu[i].display();
        }

        int minindex = 0;
        for (int i = 0; i < n; i++) {
            if(stu[i].cgpa < stu[minindex].cgpa){
                minindex = i;
            }
        }

        System.out.println("Student with lowest CGPA: " + stu[minindex].name + " with cgpa: " + stu[minindex].cgpa);
    }
}
