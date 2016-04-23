//Ahmed Aldhaheri

public class Triangle extends GeometricFigure{
   private double area;
   public Triangle(int height, int width, String figure){
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
}//end class