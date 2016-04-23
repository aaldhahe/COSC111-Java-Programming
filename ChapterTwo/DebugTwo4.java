//DebugTwo4.java

import javax.swing.JOptionPane;


public class DebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      double tax = 0.06;
      
      
      
      
      costString = JOptionPane.showInputDialog(null,
      "Enter price of item you are buying", "Purchases",
      JOptionPane.INFORMATION_MESSAGE);
      cost = Double.parseDouble(costString);
      JOptionPane.showMessageDialog(null,"With " + (tax * 100) +
      "% tax, purchase is $" + (cost + cost * tax)); 
      
   }
}


