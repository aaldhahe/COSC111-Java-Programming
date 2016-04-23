import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener
{
   JLabel company = new JLabel("Frank's Pizza");
   JComboBox <String> sizeBox = new JComboBox <String>();
   
   JLabel sizeList = new JLabel("sizeList");
   JComboBox <String> toppingBox = new JComboBox<String>();
   JLabel toppingList = new JLabel("topping list");
   
   JTextField totPrice = new JTextField(10);
   int totalPrice = 0;
   int sizeNum, toppingNum;
   int sPrice, tPrice, sumPrice;
   int[] sizePrice = {0, 7, 9, 11, 14};
   int[] toppingPrice = {0, 0, 1, 1, 1, 1, 1};
   String output = " ";
   
   public JPizza()
   {
      super("Frank's Pizza");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setLayout(new FlowLayout());
      add(company);
      sizeBox.addItem("None");
      sizeBox.addItem("Small");
      sizeBox.addItem("Medium");
      sizeBox.addItem("Large");
      sizeBox.addItem("XLarge");
      toppingBox.addItem("None");
      toppingBox.addItem("Cheese");
      toppingBox.addItem("Chicken");
      toppingBox.addItem("Black Olive");
      toppingBox.addItem("Veggie");
      add(sizeList);
      add(sizeBox);
      sizeBox.addItemListener(this);
      add(toppingList);
      add(toppingBox);
      toppingBox.addItemListener(this);
      add(totPrice);
    }
    
    public static void main(String[] args)
    {
      JPizza one = new JPizza();
      one.setSize(180,200);
      
    }
    @Override
    public void itemStateChanged(ItemEvent item)
    {
      Object source = item.getSource();
      if(source == sizeBox)
      {
         sizeNum = sizeBox.getSelectedIndex();
         sPrice = sizePrice[sizeNum];
         sumPrice = sPrice + tPrice; 
         output = "Total $" + sumPrice;
         totPrice.setText(output);
      }
    }
   

}























