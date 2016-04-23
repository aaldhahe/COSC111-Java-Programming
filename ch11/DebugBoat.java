//DebugBoat.java
//Teacher Notation
//CAREFUL ---- Must be compiled before DebugEleven1.java is compiled and run!!

public abstract class DebugBoat
{
   private String boatType = new String();
   protected int passengers;
   protected String power = new String();
   public DebugBoat(String bt)
   {
      boatType = bt;
   }
   public String toString()
   {
      return("This " + boatType +" boat carries " + getPassengers() + " and is powered by " + getPower());
   }

   public String getPower(){
      return power;
   }
   public int getPassengers(){
      return passengers;
   } 
   /*public String getBoatType(){
      return boatType; 
   }*/
   
   abstract public void setPower();
   abstract public void setPassengers();
   
}