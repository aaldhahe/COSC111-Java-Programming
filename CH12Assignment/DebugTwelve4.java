//Ahmed Aldhaheri
//DebugTwelve4.java

// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a DebugEmployeeIDException

import javax.swing.*;

public class DebugTwelve4
{
   public static void main(String[] args)
   {
      String inStr, outString = "";
      final int MAX = 999;
      int[ ] emp = new int [ 4 ];
      for(int x = 0; x < emp.length; ++x)
      {
         inStr = JOptionPane.showInputDialog("Enter employee ID number"); 
         try
         {
            emp[x] = Integer.parseInt(inStr);
            if(emp[x] > MAX)
            {
               //FixDebugEmployeeIDException error = new FixDebugEmployeeIDException("Number too high " + emp[x]);
               
               throw new DebugEmployeeIDException("Number too high " + emp[x]);
            }
         }//end try
         catch(NumberFormatException error)
         { 
            --x;
            JOptionPane.showMessageDialog(null, inStr + "\nNonnumeric ID");
         }
         catch(DebugEmployeeIDException error)
         {
            --x;
            JOptionPane.showMessageDialog(null, error.toString() + "\nID too large");
         }
          
      }//end for loop
      for(int x = 0; x < emp.length; ++x)
         {
            outString = outString + emp[x] + " ";
         }
         JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);
   }
}