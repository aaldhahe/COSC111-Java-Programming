//Ahmed Aldhaheri
// PastPresentFuture2 program

import javax.swing.JOptionPane;
import java.time.LocalDate;
public class PastPresentFuture2
{
   public static void main(String[] args)
   {
      int year, month, day;
      final int YEAR = 2015, MONTH = 10, DAY = 6;
      String str;
      
      //get user input for month
      str = JOptionPane.showInputDialog("Please enter month: ");
      month = Integer.parseInt(str);
      
      //get user input for day
      str = JOptionPane.showInputDialog("Please enter day: ");
      day = Integer.parseInt(str);
      
      //get user input for year
      str = JOptionPane.showInputDialog("Please enter year: ");
      year = Integer.parseInt(str);
      
      //using LocalDate class 
      LocalDate CURRENT = LocalDate.of(YEAR, MONTH, DAY);
      LocalDate userInput = LocalDate.of(year, month, day);
      
      //check if in the past, current, future
      if (userInput.isBefore(CURRENT))
         System.out.println("The entered date is in the past");
      else if(userInput.isAfter(CURRENT))
         System.out.println("The entered date is in the future");
      else
         if(userInput.isEqual(CURRENT))
            System.out.println("The entered date is current");
            
   }//end main

}//end class