//Group Assignment 
//Ahmed Aldhaheri
//Abed A Hawari

import java.util.Scanner;
public class GroupAssignment
{
   public static void main(String[] args)
   {
      int newCars = 0, usedCars = 0; 
      int fullTime = 0, partTime = 0;
      int firstInt;
      int len;
      int carsSold;
      char lastChar;
      boolean isItBreakYet = true;
      String choice;
      
      Scanner input = new Scanner(System.in);
      
      while(isItBreakYet)
      {
         System.out.println("press 0 if you want to quit");
         System.out.println("Enter ID number: ");
         choice = input.nextLine().toUpperCase();
         System.out.println(choice);
         len = choice.length();
         //System.out.println(len);
         firstInt = Character.getNumericValue(choice.charAt(0));
         //System.out.println("firstInt = " + firstInt);
         lastChar = choice.charAt(len - 1);
         // System.out.println("lastChar = " + lastChar);
         
         if (firstInt > 2 || lastChar != 'P' && lastChar != 'F')
         {
            if(firstInt == 0)
            {
               break;
            }
            System.out.println("Please enter valid Id number");
            continue;
         }
         
         System.out.println("press 0 if you want to quit");
         System.out.println("Enter number of cars sold: ");
         carsSold = input.nextInt();
         input.nextLine();
         //System.out.println("carsold = " + carsSold);
         if(carsSold == 0)
         {
            isItBreakYet = false;
         }
                  
         if (firstInt == 1)
         {
            newCars += carsSold;
         }
         
         if (lastChar == 'F')
         {
            fullTime += carsSold;
         
         }
         
         if (firstInt == 2)
         {
            usedCars += carsSold;
         }
         
         if (lastChar == 'P')
         {
            partTime += carsSold;
         }
       }
       
       System.out.println("Henry Ford Motor Sales Information");
       System.out.println("Number of new cars sold: " + newCars +
                          "\nNumber of old cars sold: " + usedCars +
                          "\nNumber of cars sold by Full Time Employees: " + fullTime +
                          "\nNumber of cars sold by Part Time Employees: " + partTime); 
   
   }

}
