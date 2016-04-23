//DebugEleven4.java

// Creates and displays an array of boats -
// some are rowboats; some are ocean liners

import javax.swing.*;

public class DebugEleven4
{
   static DebugBoat [] boatArray = new DebugBoat [5];
   public static void main(String[] args) 
   {
      buildArray();
      displayArray();
   }
   public static void buildArray()
   {
      char boatType;
      for(int x = 0; x < boatArray.length; x++)
      {
         boatType = getBoat();
         if (boatType == 'r')
            boatArray[x] = new DebugRowboat();
         else
            boatArray[x] = new DebugOceanLiner();
      }
   }
   public static char getBoat()
   {
      String boatType;
      boatType = JOptionPane.showInputDialog(null, 
         "Enter r for rowboat; o for ocean liner ");
      return boatType.charAt(0);
   }
   public static void displayArray()
   {
      for(int x = 0; x < boatArray.length; ++x)
         JOptionPane.showMessageDialog(null, "Boat #" + (x + 1) +
            boatArray[x].toString());
   }
}