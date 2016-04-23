//Ahmed Aldhaheri
// PastPresentFuture program

import javax.swing.JOptionPane;
public class PastPresentFuture
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
      
      //check if this year
      if(year == YEAR)
      {
         System.out.println("This year ");
         //check if this month
         if(month == MONTH)
            System.out.println("This month");
         //check if earllier month
         else if(month < MONTH)
            System.out.println("In an earlier month this year");
         //if not true display later month
         else
            System.out.println("In a later month this year");
      }
      //if not true then not this year
      else
         System.out.println("not this year");
      
   }//end main

}//end class