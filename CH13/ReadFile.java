import java.nio.file.*;
import java.io.*;

public class ReadFile{
   public static void main(String[] args){
      Path inFile = Paths.get("E:\\testFile.txt");
      InputStream input = null; 
      
      try{
         input = Files.newInputStream(inFile);
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         String s = null;
         s = reader.readLine();
         System.out.println(s);
         input.close();
      }
      catch(IOException e){
         System.out.println(e);
      }
   }
}