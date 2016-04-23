//Ahmed Aldhaheri
//Carlys event price with methods program chapter six

import java.util.Scanner;
import java.text.*;

public class EventDemo
{
   public static final Scanner input = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      int guest1 = numberOfGuests();
      String eventNumber1 = eventNumber();
      int guest2 = numberOfGuests();
      String eventNumber2 = eventNumber();
      int guest3 = numberOfGuests();
      String eventNumber3 = eventNumber();
      int count = 0;

      //Instantiating three Events
      Event event1 = new Event(eventNumber1, guest1);
      Event event2 = new Event(eventNumber2, guest2);
      Event event3 = new Event(eventNumber3, guest3);
                  
      EventDemo.displayMotto();
      //overloaded method to display please come to my event
      displayEventPrice(guest1, eventNumber1, event1, count);
      //above is the overloaded method call
      displayEventPrice(guest2, eventNumber2, event2);
      displayEventPrice(guest3, eventNumber3, event3);
      
      //first call
      Event largerEvents1 = largerEvent(event1, event2);
      //call displayLargeEvent to avoid repeated code for every large result
      displayLargeEvent(largerEvents1);
      
      //second call
      Event largerEvents2 = largerEvent(event1, event3);
      displayLargeEvent(largerEvents2);
      
      //third call
      Event largerEvents3 = largerEvent(event2, event3);
      displayLargeEvent(largerEvents3);
      
            

    }//end main
   
   public static int numberOfGuests()
   {
      //get the number of guest
      //continously prompt for number of guests until its between 5 and 100 inclusive
      int guest;
      do
      {
         System.out.println("Please enter the number of guest attending? ");
         guest = input.nextInt();
      }while(guest < 4);
      return guest; 
      
      }//end numberOfGuests method
   
   public static void displayMotto()
   {
      String companyMotto = "Carly's makes the food that makes it a party";
      int yAxis = 1;
      String display = "";
      
      int len = companyMotto.length();
      len += 6;

      
     while (yAxis <= 7)      
     {
         //adds carlys company motto in the middle of box
         if (yAxis == 4)
         {
            display += "\n*" + " " + " " + companyMotto + " " + " " + "*";
            yAxis++;
            continue;
         
         }//end if statement       
         
         //adds asterisks at first and last line
         else if (yAxis == 1 || yAxis == 7)
         {
            
            if (yAxis == 7)
            {
               display += "\n";
            }//end if statement
           
            
            for (int i = 0; i < len; i++)
            {
               display += "*";
               
            }//end for loop
            
                         
         }//end else if statement
         
         //adds asterisk at beginign and end of box. Then adds spaces in middle of box
         else 
         {
            display += "\n";
            
            
            for (int i = 0; i < len; i++)
            {
               if (i == 0 || i == len - 1)
               {
                  display += "*";
               
               }//end if statement
               
               else
               {
                  display += " ";
               
               }//end else statement   
            
            }//end for loop
           
         
         }//end else statement
         
          yAxis++;
         
         
       }//end while loop
      
      System.out.println(display);
   }//end method
   
   //displays event info and price
   
   
   public static void displayEventPrice(int guest, String eventNum, Event event)
   {
      /*This method will display each event object info*/
      
      DecimalFormat df = new DecimalFormat("####,###,###.00");
      System.out.println("\n*************************Event**********************************\n" +
                         "Event number is: " + event.getEventNumber() +
                         "\nNumber of guests: " + event.getGuests() +
                         "\nPrice per guest: $" + event.getPricePerGuest() +
                         "\nTotal price of the event: $" + df.format(event.getPrice()) + 
                         "\nLarge event? " + event.isLargeEvent());                
   }//end displayEventPrice method

   //overloaded method to display Please come to my event
   public static void displayEventPrice(int guest, String eventNum, Event event, int count)
   {
      /*This is an overloaded method that will display event object info
      and in addition the event will please user to come the event*/
           
      DecimalFormat df = new DecimalFormat("####,###,###.00");
      System.out.println("\n*************************Event**********************************\n" +
                         "Event number is: " + event.getEventNumber() +
                         "\nNumber of guests: " + event.getGuests() +
                         "\nPrice per guest: $" + event.getPricePerGuest() +
                         "\nTotal price of the event: $" + df.format(event.getPrice()) + 
                         "\nLarge event? " + event.isLargeEvent());
     
         while(count < guest)
         {
            System.out.println("Please Come to my event!");
            ++count;
         }
         System.out.println(count - 1);
                       
     
                         
      }//end displayEventPrice method
      
      //asks for event number and returns it
      public static String eventNumber()
      {
         input.nextLine();
         System.out.println("Please enter event number: ");
         String event = input.nextLine();
         return event;   
      }
      
      //display events passed and check for larger and return it
      public static Event largerEvent(Event event1, Event event2)
      {
         
         System.out.println("\n*************************Determine Larger Event**********************************" +
                            "\nEvent number: " + event1.getEventNumber() +
                            "\nNumber of Guests: " + event1.getGuests()); 
         System.out.println("\nEvent number: " + event2.getEventNumber() +
                            "\nNumber of Guests: " + event2.getGuests()); 
         
         if (event1.getGuests() > event2.getGuests())
            return event1;
         else if (event1.getGuests() < event2.getGuests())
            return event2;
         else
            return event1;
      }
      
      //displays result of larger event, method created to avoid repeated code in main method
      public static void displayLargeEvent(Event event)
      {
         System.out.println("\n*************************Larger Event Result**********************************" +
                         "\nEvent Number for larger event: " + event.getEventNumber() + 
                         "\nNumber of guests for larger event: " + event.getGuests());

      }

}//end class