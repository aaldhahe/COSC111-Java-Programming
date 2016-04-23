//Ahmed Aldhaheri

public class Candle{

   private String color;
   private float height;
   protected double price;//allows this field to be used by any children
   
   public String getColor(){
      return color;
   }
   public float getHeight(){
      return height;
   }
   public double getPrice(){
      return price;
   }
   public void setColor(String color){
      this.color = color;
      
   }
   public void setHeight(float height){
      this.height = height;
      price = 2 * height;
   }
   

}