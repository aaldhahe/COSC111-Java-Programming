//Ahmed Aldhaheri

//DebugFive2.java

// Decides if a number is even or odd
import java.util.Scanner; 
public class DebugFive2
{
   public static void main(String args[])
   {
      int num;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      num = input.nextInt();
      if(num % 2 == 0) 
         System.out.println("Number is even");
      else
         System.out.println("Number is odd");
   
   }

}