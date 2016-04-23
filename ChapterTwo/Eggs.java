//Ahmed Aldhaheri
//Eggs program

import javax.swing.JOptionPane;

public class Eggs
{
   public static void main(String[] args)
   {
      double dozenEggs = 3.25,  singleEgg = 0.45, cost = 0;
      int eggsOrdered, computeDozen = 0, accumulateDozen,computeSingle = 0;
      String eggsOrderStr;
      
      eggsOrderStr = JOptionPane.showInputDialog(null,
                                                "Please enter amount of eggs you would like to order: ", "Purchase",
                                                JOptionPane.QUESTION_MESSAGE);
      eggsOrdered = Integer.parseInt(eggsOrderStr);
      
      if (eggsOrdered < 12)
      {
        computeSingle = eggsOrdered;
        cost = eggsOrdered * singleEgg;
      }
      
      else 
      {
         if (eggsOrdered % 12 == 0)
         {
            computeDozen = eggsOrdered / 12;
            cost = computeDozen * dozenEggs;
         
         }
         else
         {
            computeDozen = eggsOrdered / 12;
            cost = computeDozen * dozenEggs;
            computeSingle = computeDozen * 12;
            computeSingle = eggsOrdered - computeSingle;
            cost += computeSingle * singleEgg;
         }
      }
      
      JOptionPane.showMessageDialog(null,
                                    "You ordered " + eggsOrdered + " eggs. That's " + computeDozen + " dozen at $" + dozenEggs +
                                    " per dozen and " + computeSingle + " loose eggs at $" + singleEgg + " each for a total of $"
                                    + String.format("%.2f",cost), "Total", JOptionPane.INFORMATION_MESSAGE);      
      
   
   }




}