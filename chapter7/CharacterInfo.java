
import java.util.Scanner;

public class CharacterInfo
{
   public static void main(String[] args)
   {
      char aChar = 'C';
      System.out.println("The character is " + aChar);
      if(Character.isUpperCase(aChar))
         System.out.println("Is upperCase");
      else 
         System.out.println("is not uppercase"); 
      
      aChar = Character.toLowerCase(aChar);
      System.out.println("The character is now: " + aChar);  
   }//end main
}//end class
//is --> test ---->ex:isUpperCase
//to --> change --->ex:toUpperCase