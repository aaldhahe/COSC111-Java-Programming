//Ahmed Aldhaheri

public class Triangle2 extends GeometricFigure2 implements SideObject{
   private double area;
   public Triangle2(int height, int width, String figure){
      super(height, width, figure);
      figureArea(height , width);
   }//end constructor
   
   @Override
   public double figureArea(int h, int w){
      return area = 0.5 * w * h;
   }
   @Override
   public String toString(){
      return (super.toString() + "\narea is: " + area);
   }
   public void displaySides(){
      System.out.println("Triangle has 3 sides\n");
   }

}//end class