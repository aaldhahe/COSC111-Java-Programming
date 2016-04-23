import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDisableButton extends
   JFrame implements ActionListener 
{
   JButton button = new JButton("Disable");
   JLabel label = new JLabel("Dont do it!");
   
   
   public JDisableButton()
   {
      super("Disable Button");
      setLayout(new FlowLayout());
      setSize(200, 200);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      button.addActionListener(this);
      add(label);
      add(button);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      button.setEnabled(false);
      button.setText("ouch!");
      
   }
   
   public static void main(String[] args)
   {
      JDisableButton myFrame = new JDisableButton();
      
   }

}