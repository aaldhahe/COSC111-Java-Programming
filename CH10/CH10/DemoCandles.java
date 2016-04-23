public class DemoCandles{
   public static void main(String[] args){
      Candle one = new Candle();
      one.setColor("Purple");
      one.setHeight(4);
      System.out.println("Candle is: " + one.getColor() + "\nHeight is: " + one.getHeight()+
                         "\nPrice is: " + one.getPrice());
      
      ScentedCandle two = new ScentedCandle();
      two.setColor("Green");
      two.setHeight(5);
      two.setScent("Sour Apple");
      
      System.out.println("Candle is: " + two.getColor() + "\nHeight is: " + two.getHeight() +
                         "\nScent is: " + two.getScent() + "\nPrice is: " + two.getPrice());
   }

}