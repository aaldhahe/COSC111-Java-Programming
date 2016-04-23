//inheritance

public class RaceHorse extends Horse{
   
   private int numOfRaces;
   
   public RaceHorse(int numOfRaces){
      super("BlackBeaty","Black");
      this.numOfRaces = numOfRaces;
   }
   
   public void setNumOfRaces(int numOfRaces){
      this.numOfRaces = numOfRaces;
      
   }
   public int getNumOfRaces(){
      return numOfRaces;
   }
   public void setName(String name){
      name += " The Great!";
      super.setName(name);
      
   }

}//end class