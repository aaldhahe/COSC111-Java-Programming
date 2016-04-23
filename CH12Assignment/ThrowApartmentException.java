//Ahmed Aldhaheri
//This is how I understood this assignment, I hope its right :)

public class ThrowApartmentException{
   public static void main(String[] args){
      //creat 6 objects
      Apartment[] arrayOfApartment = new Apartment[6];
      arrayOfApartment[0] = new Apartment("733 Mich ave", 105, 4, 1982.60, 1);
      arrayOfApartment[1] = new Apartment("666 warren ave", 19, 3, 1000.0, 2);
      arrayOfApartment[2] = new Apartment("7899 Ford rd", 180, 3, 1670.99, 3);
      arrayOfApartment[3] = new Apartment("566 Evergreen rd", 100, 4, 2400.0, 4);
      arrayOfApartment[4] = new Apartment("698 Greenfield rd",111 , 6, 2200.0, 5);
      arrayOfApartment[5] = new Apartment("899 Mich ave", 105, 4, 2600.0, 6);
      
      System.out.println("");
      
      for(int x = 0; x < arrayOfApartment.length; ++x){
         //if object is sucessful display info and if not display null
         if(arrayOfApartment[x].getApartmentNum() < 100 || arrayOfApartment[x].getNumBedrooms() < 1 || 
            arrayOfApartment[x].getNumBedrooms() > 4 || arrayOfApartment[x].getRentValue() < 500 || 
            arrayOfApartment[x].getRentValue() > 2500){
            System.out.println((x + 1) + " is null");
          }//end if  
          else{
            System.out.println((x + 1) + " address is " + arrayOfApartment[x].getAddress() + " apartment number is " + 
                               arrayOfApartment[x].getApartmentNum() + " number of bedrooms " + arrayOfApartment[x].getNumBedrooms()
                               + " rent value is " + arrayOfApartment[x].getRentValue()); 
          }//end else
      }//end for loop
      
   }//end main
 }//end class