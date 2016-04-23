//Ahmed Aldhaheri
import javax.swing.*;

public class UseGeometric{
   public static void main(String[] args){
      GeometricFigure[] array = new GeometricFigure[2];
      int height, width;
      String entry;
      char character;
      String figure;
      
      //creat two objects
      for(int x = 0; x < array.length; ++x){
         entry = JOptionPane.showInputDialog(null,
                                              "Please enter figure (S) for square \n"
                                              + "Please enter figure (T) for triangle");
         character = entry.charAt(0);
         entry = JOptionPane.showInputDialog(null,
                                              "Please enter the height ");
         height = Integer.parseInt(entry);
         entry = JOptionPane.showInputDialog(null,
                                             "Please enter the width ");
         width = Integer.parseInt(entry);
         
         if(Character.toUpperCase(character) == 'S'){
            figure = "Square";
            array[x] = new Square(height, width, figure);
         }//end if
         else{
            figure = "Triangle";
            array[x] = new Triangle(height, width, figure);
         }//end else  
      
      }//end for loop
      
      //display objects
      for(int x = 0; x < array.length; ++x){
         JOptionPane.showMessageDialog(null, array[x].toString());
      }//end for loop
   
   }//end main
   
}//end class