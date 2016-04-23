//Ahmed Aldhaheri
//Event data class for chapter five

public class Event
{
   public static final int HIGHER_PRICE_PER_GUEST = 35;
   public static final int LOWER_PRICE_PER_GUEST = 32;
   public static final int CUT_OFF_VALUE = 50;
   private String eventNumber;
   private int guests;
   private double price;
   private int pricePerGuest;
   
   //Constructor with two parameters
   public Event(String eventNum, int numOfGuests)
   {
      setEventNumber(eventNum);
      setGuests(numOfGuests);
      
   }
   //constructor with no parameters
   public Event()
   {
      this("A000", 0);
   }
   
   //Sets
   public void setEventNumber(String event)
   {
      eventNumber = event;
   }
   
   public void setGuests(int gue)
   {
      guests = gue;
      if (guests >= 50)
      {
         price = guests * LOWER_PRICE_PER_GUEST;
         pricePerGuest = LOWER_PRICE_PER_GUEST; 
      }
      else
      {
         price = guests * HIGHER_PRICE_PER_GUEST;
         pricePerGuest = HIGHER_PRICE_PER_GUEST; 
      }
   }
   
   //end sets
   
   //start gets
   public String getEventNumber()
   {
      return eventNumber;
   }
   
   public int getGuests()
   {
      return guests;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public int getPricePerGuest()
   {
      return pricePerGuest;
   }
   
   public boolean isLargeEvent()
   {
     
     if (guests >= 50)
         return true;
      else
         return false;      
   }
   
   //end gets

}//end class