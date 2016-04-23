//Sea Monster class

public class SeaMonster
{
   private String size;
   private double speed;
   private int numOfTeeth;
   private String name;
   
   public SeaMonster()
   {
      size = "huge";
      speed = 100;
      numOfTeeth = 180;
      name = "Peter";
      
   }
   
   public SeaMonster(String s)
   {
      size = s;
      speed = 150;
      numOfTeeth = 1150;
      name = "George";
   }
   
   public SeaMonster(String s, int teeth, double spe)
   {
      size = "huge";
      speed = 150;
      numOfTeeth = 1150;
      name = "George";

      
   }
   public void setSize(String s)
   {
      size = s;
      
   }
   
   public String getSize()
   {
      return size;
   }
   
   public void setSpeed(double speed)
   {
      this.speed = speed;
   }
   
   public double getSpeed()
   {
      return speed;
   }
   
   public void setNumOfTeeth(int numOfTeeth)
   {
      this.numOfTeeth = numOfTeeth;
   }
   
   public int getNumOfTeeth()
   {
      return numOfTeeth;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getName()
   {
      return name;
   } 
   
 }