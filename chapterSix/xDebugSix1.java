// DebugSix1.java

// Start with a penny
// double it every day
// how much do you have in a 30-day month?

public class xDebugSix1
{
   public static void main(String args[])
   {
      final int DAYS = 30;
      double money = 0.01;
      int day = 0;
      while(day < DAYS)
      {
         money = 2 * money;
         System.out.println("After day " + (day + 1) + " you have " + money);
         day++;
      }
   }
}