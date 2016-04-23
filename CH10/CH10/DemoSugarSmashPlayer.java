//chapter 10 HW
import java.util.Scanner;
public class DemoSugarSmashPlayer{
   
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      SugarSmash one = new SugarSmash();
      
      System.out.println("Enter ID number: ");
      one.setIdNumber(input.nextInt());
      input.nextLine();
      System.out.println("Enter Screen Name: ");
      one.setScreenName(input.nextLine());
      
      for(int x = 1; x <= 10; ++x){
      
         System.out.println("Enter high score for level " + x + ": ");
         int hScore = input.nextInt();
         one.setScore(hScore, x);
      }//end first loop
                  
      System.out.println("Output for: " + one.getScreenName() + "\nID: " + one.getIdNumber());
         
      for(int x = 1; x <= 10; ++x){
         System.out.println("\nLevel: " + x + "\tScore: " + one.getScore(x));
      }//end second loop
   }//end main    
}//end class