//JphotoFrame for homework

import javax.swing.*;
import java.awt.*;
import java.awt.event;

public class JPotoFrame
   extends JFrame implements itemListener
{
   JCheckBox locBox = new JCheckBox("Location",false);
   JcheckBox stBox = new JCheckBox("Studio",false);
   JCheckBox oneBox = new JCheckBox("One person",false);
   JCheckBox moreBox = new JCheckBox("two or more people",false);
   JCheckBox petBox = new JCheckBox("pet",false);
   
   JLabel label1 = new JLabel("Paula's Portrait");
   JLabel label2 = new JLabel("Portrait fee");
   JLabel label3 = new JLabel("Select options");
   
   JTextFiled totProce = new JTextField(10);
   String output;
   double locPrice = 0.0;
   double subPrice = 0.0;
   
   public JPhotoFrame()
   {
      super("Portrait selection");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setSize(500,300);
      setLayout(new FlowLayout());
      ButtonGroup subGroup = new ButtonGroup();
      subGroup.add(oneBox);
      subGroup.add(moreBox);
      subGroup.add(petBox);
      add(label3);
      add(oneBox);
      add(moreBox);
      add(petBox);
      
      //add second button group
      
      
      //end
      
      add(label1);
      add(label2);
      add(totPrice);
      oneBox.addItemListener(this);
      moreBox.addItemListener(this);
      petBox.addItemListener(this);
      stBox.addItemListener(this);
      locBox.addItemListener(this);




      //add listeners to test of checkBoxes
   }//end constructor
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      Object source = e.getsource();
      int select;
      
      select = e.getStateChange();
      if(source == locBox)
         if(select == ItemEvent.SELECTED)
            locPrice += 90;
         else
            locPrice -= 90;
            
   }
   public static void main(String[] args)
   {
      JPhotoFrame frame = new JPF();
   }
      

}
