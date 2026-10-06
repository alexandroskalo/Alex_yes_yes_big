import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String name;
        int age;
        double gpa;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the name of the student?");
        name = scanner.nextLine();
        System.out.println("What's the student's age?");
        age = scanner.nextInt();
        System.out.println("What's the student's gpa?");
        gpa = scanner.nextDouble();
        Student student1 = new Student(name,age,gpa);

        System.out.println("The student's name is: " +student1.name);
        System.out.println("The student's age is: "+ student1.age);
        System.out.println("The student's gpa is: "+ student1.gpa);
        System.out.println("The student is enrolled?: "+ student1.isEnrolled);
    }
}