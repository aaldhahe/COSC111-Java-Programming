import java.nio.file.*;
import java.io.*;

public class ReadEmployeeFile{

   public static void main(String args[]){
   
      Path file = Paths.get("Employees.txt");
      String[] array = new String[3];
      
      String s = " ";
      String delimiter = ",";
      int id;
      String name;
      double payRate;
      double gross = 0;
      double total = 0;
      
      try{
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         s = reader.readLine();
         while(s != null){
            array = s.split(delimiter);
            id = Integer.parseInt(array[0]);
            name = array[1];
            payRate = Double.parseDouble(array[2]);
            gross = payRate * 40;
            System.out.println("Employee info " + name + "\tID: " + id + " Pay rate: " + payRate 
                               + " Gross: " + gross);
            total += gross;
            s = reader.readLine();
            
         }//end while loop
          reader.close(); 
      
      }//end try
      
      catch(Exception e){
         System.out.println("Message: " + e);
      }
      System.out.println("Gross pay: $" + total);
      
   }//end main
}//end class