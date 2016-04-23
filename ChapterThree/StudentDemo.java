//student demo class

import java.util.Scanner;

public class StudentDemo
{
   public static void main(String[] args)
   {  
      double gpa;
      int studentNumber, credits;
      Student s1 = new Student();
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter student ID number: ");
      studentNumber = input.nextInt();
      System.out.println("Please enter student GPA: ");
      gpa = input.nextDouble();
      System.out.println("Please enter student credit hours for this semester: ");
      credits = input.nextInt();
      
      s1.setSNumber(studentNumber);
      s1.setCreditHrs(credits);
      s1.setGpa(gpa);
      
      System.out.println("Student number: " + s1.getSNumber() +
                         "\nNumber of credits: " + s1.getCreditHrs() +
                         "\nGPA: " + String.format("%.2f", s1.getGpa()));
   }

}