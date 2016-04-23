//implement horse

public class DemoHorse{
   public static void main(String[] args){
      //Horse h1 = new Horse();
      Horse h1 = new Horse("Furball","Brown");
      RaceHorse h2 = new RaceHorse(5);
      
      //h1.setName("Mr. Ed");
      h2.setName("Secretanat");
      h2.setNumOfRaces(24);
      
      System.out.println("Horse: " + h1.getName());
      System.out.println("RaceHorse: " + h2.getName());
      System.out.println("Number of Races: " + h2.getNumOfRaces());
      System.out.println("color: " + h2.getColor());
   }//end main

}//end class