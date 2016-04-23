
public class AlienDemo
{
   public static void main(String[] args)
   {
      Planet neptone = new Planet("Neptone", -218, 2300);
      System.out.println(neptone.getInfo());
      Alien joe = new Alien("Joe", "Orange", "Mars", -56, 1500);
      
      System.out.println(joe.getInfo());
   
   }
}