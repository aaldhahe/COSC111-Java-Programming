//Ahmed Aldhaheri
public abstract class GeometricFigure
{
   protected int height;
   protected int width;
   protected String figure;
   public GeometricFigure(int height, int width, String figure)
   {
      this.height = height;
      this.width = width;
      this.figure = figure;
   }
   public int getHeight()
   {
      return height;
   }
   public int getWidth()
   {
      return width;
   }
   public String getFigure()
   {
      return figure;
   }
   public String toString(){
      return ("Figure: " + figure + "\nHeight: " + height + "\nWdith: " + width);
   }
   public abstract double figureArea(int h, int w);
}