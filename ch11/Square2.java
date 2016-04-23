//Ahmed Aldhaheri

public class Square2 extends GeometricFigure2 implements SideObject{
   private double area;
   public Square2(int hei, int wid, String fig){
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
   public void displaySides(){
      System.out.println("Square has 4 sides\n");
   }

}//end class