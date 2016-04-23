//Ahmed Aldhaheri
//ChiliToGo program

import java.util.Scanner;

public class ChiliToGo
{
   public static void main(String[] args)
   {
      final int ADULT_MEAL = 7, CHILDREN_MEAL = 4;
      int choiceAdu, choiceChi, total;
      String choiceAduChar, choiceChilChar;
      
      //user input for adult meals
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the amount of adult meals: ");
      choiceAduChar = input.nextLine();
      choiceAdu = Integer.parseInt(choiceAduChar);
      
      //user input for children's meal
      System.out.println("Please enter maount of children meals: ");
      choiceChilChar = input.nextLine();
      choiceChi = Integer.parseInt(choiceChilChar);
      
      //computing totals
      choiceAdu *= ADULT_MEAL;
      choiceChi *= CHILDREN_MEAL;
      total = choiceAdu + choiceChi;
      
      //displaying totals
      System.out.println("Total adults meals: " + choiceAdu + 
                         "\nTotal Childrens meals: " + choiceChi +
                         "\nTotal balance: " + total);
   }//end main

}//end class
