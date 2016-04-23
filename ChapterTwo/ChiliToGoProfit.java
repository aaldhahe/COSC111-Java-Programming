//Ahmed Aldhaheri
//ChiliToGoProfit program

import java.util.Scanner;

public class ChiliToGoProfit
{
   public static void main(String[] args)
   {
      final int ADULT_MEAL = 7, CHILDREN_MEAL = 4;
      final double ADULT_MEAL_COST = 4.35, CHILDREN_MEAL_COST = 3.10;
      int choiceAdu, choiceChi, total, totalAdu, totalChi;
      double adultMealCos = 4.35, childrenMealCos = 3.10,  totalPro, totalChiPro, totalAduPro;
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
      totalAdu = choiceAdu * ADULT_MEAL;
      totalChi = choiceChi * CHILDREN_MEAL;
      total = totalAdu + totalChi;
      
      //computing profit
      totalAduPro = totalAdu - choiceAdu * ADULT_MEAL_COST;
      totalChiPro = totalChi - choiceChi * CHILDREN_MEAL_COST;
      totalPro = totalAduPro + totalChiPro;
      
      //displaying profit
      System.out.println("Total adults meals profit: " + String.format("%.2f",totalAduPro) + 
                         "\nTotal Childrens meals profit: " + String.format("%.2f",totalChiPro) +
                         "\nTotal balance profit: " + String.format("%.2f",totalPro));
   }//end main

}//end class
