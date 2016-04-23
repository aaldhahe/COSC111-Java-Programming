//Stirngs
import java.util.*;
public class Strings{
   public static void main(String[] args){
      /*String str = "Programming";//String is immutable
      System.out.println(str.substring(4,6));
      
      StringBuilder myStr = new StringBuilder("Programming");//this is mutable*/
      //Password program
      /*1. 2 uppercase
      2. 2 lowercase
      3. 1 number
      4. 14 chars
      */
      String aString;
      int strLength;
      int upper = 0, lower = 0, special = 0;
      Scanner input = new Scanner(System.in);
      int i = 0;
      do{
      System.out.println("Enter a password: ");
      aString = input.nextLine();
      strLength = aString.length();
      char ch = aString.charAt(i);
      if(Character.isUpperCase(ch))
         upper++;
      else if(Character.isLowerCase(ch))
         lower++;
      else if(ch >= 33 && ch <= 44)
         special++;
      ++i;
      } while(upper < 2 || lower < 2 || special < 1);
      
      System.out.println("upper = " + upper + " lower = " + lower + " special = " + special);  
      
      if(upper >= 2 && lower >= 2 && special >= 1)
         System.out.println("Password is good");
      else 
         System.out.println("Password is wrong");
         
   }
}