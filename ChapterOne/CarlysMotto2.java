//Ahmed Aldhaheri
//Display Carly's motto surrounded by asterisks 

public class CarlysMotto2
{
   public static void main(String[] args)
   {
      
      String str = "Carly's makes the food that makes it a party";
      displayString(str);
     
      
   }
   
   public static void displayString(String carlysMotto)
   {
      int yAxis = 1, xAxis = 1;
      String display = "*";
      
      int len = carlysMotto.length();
      len += 5;

      
     while (yAxis <= 7)      
     {
         if (xAxis == 4)
         {
            display += "\n*" + " " + " " + carlysMotto + " " + " " + "*";
            yAxis++;
            xAxis++;
            continue;
         
         }       
         
         if (yAxis == 1 || yAxis == 7)
         {
            
            if (yAxis == 7)
            {
               display += "\n*";
            }
           
            
            for (int i = 0; i < len; i++)
            {
               display += "*";
               
            }
            
                         
         }
         
         if (yAxis != 1 && yAxis != 7)
         {
            display += "\n";
            int len2 = len;
            len2 -= 1;
            
            for (int i = 0; i <= len; i++)
            {
               if (i == 0 || i == len)
               {
                  display += "*";
               
               }
               
               else
               {
                  display += " ";
               
               }   
            
            }
           
         
         }
         
          yAxis++;
          xAxis++;
         
         
       }
      
      System.out.println(display);
   }

   
  }
