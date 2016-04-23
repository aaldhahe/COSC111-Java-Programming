//Pizza.java

// Chapter 3 Exercise #9a

class Pizza
{
// the private data members!

        private int diameter;                            //THREE Data Members 
        private double price;
        private String toppings;


// Here are the defined public get and set methods (so THREE of each, to match data!)
//  You MAY ALSO have "regular functions" defined here (like displayPrice (  ) sometimes)

         public void setDiameter(int amt)        //SETTER method (  )
         {
                diameter = amt;
          }

        public int getDiameter(  )               //GETTER method (  )
         {
                return diameter;
          }

         public void setPrice(double amt)  //SETTER method (  )
         {
                price = amt;
          }

        public double getPrice(  )               //GETTER method (  )
         {
                return price;
          }

         public void setToppings(String str)  //SETTER method (  )
         {
                toppings = str;
          }

        public String getToppings(  )          //GETTER method (  )
         {
                return toppings;
          }

}