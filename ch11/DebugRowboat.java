//DebugRowBoat.java
//Teacher Notation
//CAREFUL ---- Must be compiled before DebugEleven1.java is compiled and run!!

public class DebugRowboat extends DebugBoat
{
   public DebugRowboat()
   {
      super("row");
      setPassengers();
      setPower();
   }
   @Override
   public void setPassengers()
   {
      passengers = 2;
   }
   @Override  
   public void setPower()
   {
      power ="oars";
   }
/*  @Override 
   public String toString(){
      return ("This " + super.getBoatType() + " boat carries " + super.passengers +
              " and is powered by " + super.power);
   }*/
}