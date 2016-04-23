import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class WriteFile{
   public static void main(String[] args){
      String name = "Bogs Bunny";
      
      Path outFile = Paths.get("E:\\testFile.txt");
      byte[] data = name.getBytes();
      OutputStream output = null;
      
      try{
         output = new BufferedOutputStream(Files.newOutputStream(outFile, CREATE));
         output.write(data);
         output.flush();
         output.close();
      }
      catch(Exception e){
         System.out.println("Message: " + e); 
      }
      
   }//end main

}//end class