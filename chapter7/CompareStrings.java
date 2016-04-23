import java.util.Scanner;

public class CompareStrings
{
   public static void main(String[] args)
   {
      String str1 = "hi", str2 = "Hi";
      Scanner input = new Scanner(System.in);
      //str2 = "Hello";
      //System.out.println("Enter a string: ");
      //str1 = input.nextLine();
      //System.out.println("enter another string: ");
     //str2 = input.nextLine();
      
      //if(str1.equals(str2)) 
      //if(str1 == str2)
      //if(str1.equalsIgnoreCase(str2))//ignores case if upper or lower  //if(str1 == str2) this compares memory location
      if(str1.endsWith("ing"))
      {
         System.out.println("They are the same");
         
      }
      else{
         System.out.println("They are different");
      }
   }
}

//Character class: each object holds a single char
//String: object fixed string data ---> strings are immutable
//StringBuilder(StringBuffer)----> used when stroing data that is mutable, changeable data
//