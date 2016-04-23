//Ahmed Aldhaheri

public class Apartment{
   private String address;
   private int apartmentNum;
   private int numBedrooms;
   private double rentValue;
   
   public Apartment(String address, int apartmentNum, int numBedrooms, double rentValue , int x){
      this.address = address;
      this.apartmentNum = apartmentNum;
      this.numBedrooms = numBedrooms;
      this.rentValue = rentValue;
      
      try{
         if(this.apartmentNum < 100)
            throw new ApartmentException("is unsuccessful");
         else if(this.numBedrooms < 1 || this.numBedrooms > 4)
            throw new ApartmentException("is unsuccessful");
         else if(this.rentValue < 500 || this.rentValue > 2500)
            throw new ApartmentException("is unsuccessful");
      }
      catch(ApartmentException e){
         setResult(e.getMessage(), x);
         return;
      }
      setResult("is sucessful", x);
   
   }
   
   //start gets
   public String getAddress(){
      return address;
   }
   public int getApartmentNum(){
      return apartmentNum;
   }
   public int getNumBedrooms(){
      return numBedrooms;
   }
   public double getRentValue(){
      return rentValue;
   }
   
   public void setResult(String s, int x){
      //this method to display whether object is successful or not
      System.out.println("Apartment Object " + x + " " + s);
   }
}//end class