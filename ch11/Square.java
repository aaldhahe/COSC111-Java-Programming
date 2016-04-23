//Ahmed Aldhaheri

public class Square extends GeometricFigure{
   private double area;
   public Square(int hei, int wid, String fig){
      super(hei, wid, fig);
      figureArea(hei, wid);
   }//end constructor
   @Override
   public double figureArea(int h, int w){
      return area = h * h;
   }
   @Override
   public String toString(){
      return (super.toString() + "\narea is: " + area);
   }

}//end class