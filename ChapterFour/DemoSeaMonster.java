//SeaMonster class application

public class DemoSeaMonster
{
   public static void main(String[] args)
   {
      SeaMonster nessy = new SeaMonster();
      nessy.setSize("huge");
      nessy.setSpeed(52);
      nessy.setNumOfTeeth(1200);
      nessy.setName("Nessy");
      
      SeaMonster george = new SeaMonster();
      SeaMonster phil = new SeaMonster("Big");
      SeaMonster ahmed = new SeaMonster("ahmed", 24, 100);
      
      displayMonster(nessy);
      displayMonster(george);
      displayMonster(phil);
      displayMonster(ahmed);
      
   }//end main
   
   public static void displayMonster(SeaMonster s)
   {
      System.out.println("Sea Monster #1: " + "\nSize: " + s.getSize() +
                         "\nSpeed: " + s.getSpeed() + " mph \nNumber of Teeth: " +
                         s.getNumOfTeeth() + "\nName: " + s.getName() + "\n");

   }//end displayMonster method
}//end class