//Inheritaance
//UML: Unified Modeling language
/*Parent class    Child
   Super          sub
   Base           derived
   instanceOf(): to find out who the parent is   

*/   

//This Horse
public class Horse{

   private String name;
   private int legs;
   private String color;
   private boolean isTameable;
   private String bree;
   
   public Horse(String name, String color){
   
      this.name = name;
      this.color = color;
      legs = 4;
      isTameable = false;
      bree = "Arabian";
   
   }
   public void setName(String name){
      this.name = name;
      
   }
   public String getName(){
      return name;
   }
   public void setLegs(int legs){
      this.legs = legs;
   }
   public int getLegs(){
      return legs;
   }
   public void setColor(String color){
      this.color = color;
   }
   public String getColor(){
      return color;
   }
   public void setIsTameable(boolean isTameable){
      this.isTameable = isTameable;
      
   }
   public void setBree(String bree){
      this.bree = bree;
   }
   public String getBree(){
      return bree;
   }
}//end class