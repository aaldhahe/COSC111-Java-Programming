//DebugEleven2.java

// An array for different boat types
public class DebugEleven2
{
   public static void main(String[] args)
   {
      DebugBoat[] ref = new DebugBoat[3];
      DebugRowboat blueBoat = new DebugRowboat();
      DebugRowboat redBoat = new DebugRowboat();
      DebugOceanLiner bigBoat = new DebugOceanLiner();
      ref[0] = blueBoat;
      ref[1] = redBoat;
      ref[2] = bigBoat;
      for(int x = 0; x < ref.length; ++x)
      {
         /*if(x == 2)   
            ref[x] = new DebugOceanLiner();
         else
            ref[x] = new DebugRowboat(); */
         ref[x].setPassengers(); 
         ref[x].setPower();
         System.out.println(ref[x].toString());
      }
   }
}