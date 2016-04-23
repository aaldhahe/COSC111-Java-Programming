//TestPizza.java

// Chapter 3 Exercise #9b

class TestPizza
{
        public static void main(String [  ] args)
    {
      
        Pizza pie1 = new Pizza(  );        //Pizza object called pie1
        Pizza pie2 = new Pizza(  );         //Pizza object called pie2

        pie1.setDiameter(12);
        pie1.setPrice(13.99);
        pie1.setToppings("Pepperoni");

        // CALL subroutines ("methods (  ) ")

        System.out.println("\nYou have ordered a pizza with " +
                    pie1.getToppings(  ) + " topping,\nwith a diameter of " +
                    pie1.getDiameter(  ) + " and a price of $" + pie1.getPrice(  ));       

        pie2 .setDiameter(10);
        pie2 .setPrice(11.99);
        pie2 .setToppings("Green Peppers");

        // CALL subroutines ("methods (  ) ")

        System.out.println("\nYour friend has ordered a pizza with " +
                    pie2 .getToppings(  ) + " topping,\nwith a diameter of " +
                    pie2 .getDiameter(  ) + " and a price of $" + pie2 .getPrice(  ));                                     
    }

}