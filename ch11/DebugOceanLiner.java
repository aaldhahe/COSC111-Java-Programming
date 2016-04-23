//DebugOceanLiner.java
//Teacher Notation
//CAREFUL ---- Must be compiled before DebugEleven2.java is compiled and run!!

public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("ocean liner ");
      setPassengers();
      setPower();
   }
   @Override
   public void setPassengers()
   {
      passengers = 2400;
   }
   @Override
   public void setPower()
   {
      power = "four engines";
   }
}