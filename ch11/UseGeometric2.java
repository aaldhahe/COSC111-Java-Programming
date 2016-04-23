//Ahmed Aldhaheri

public class UseGeometric2{
   public static void main(String[] args){
     
      //creat two objects
      Square2 Object1 = new Square2(30, 20, "Square");
      Triangle2 Object2 = new Triangle2(20, 25, "Triangle");                   
               
      //display objects
      System.out.println(Object1.toString());
      Object1.displaySides();
      System.out.println(Object2.toString()); 
      Object2.displaySides();     
   
   }//end main
   
}//end class