//Methods, objects, classes Notes
// #8 pg 176

import java.util.Scanner;

public class Paint
{
   public static void main(String[] args)
   {
      int length, width, height;
      double price;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter length of the room: ");
      length = input.nextInt();
      
      System.out.println("Please enter the width of the room: ");
      width = input.nextInt();
      
      System.out.println("Please enter the height of the room: ");
      height = input.nextInt();
      
      price = calcArea(length, width, height);
      
      System.out.println("The price to paint your room is " +
                         String.format("$%.2f", price));
      
   }
   
   
   public static double calcArea(int lenght, int width, int height)
   {
      double area;
      double galOfPaint, price;
      
      area = (height * width +  height * height) * 2;
      galOfPaint = calcGallons(area);
      price = galOfPaint * 32.00;
      
      return price;
      
   }
   
   public static double calcGallons(double area)
   {
      return (area / 350);
   
   }
   

}


