//File input and output

import java.nio.file.*;
import java.util.Scanner;
import java.nio.file.attribute.*;
import java.io.IOException;

public class PathDemo{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String name;
      
      System.out.println("Enter file name: " );
      name = input.nextLine();
      
      Path inputPath = Paths.get(name);
      Path fullPath = inputPath.toAbsolutePath();//absolute path
      
      System.out.println("The full path is " + fullPath.toString());
      
      try{
         BasicFileAttributes attr = Files.readAttributes(inputPath, BasicFileAttributes.class);
         System.out.println("Creatin time " + attr.creationTime());
         System.out.println("Last modified time " + attr.lastModifiedTime());
         System.out.println("Size " + attr.size());

      }
      catch(IOException e){
         System.out.println("Error");
      }
      
   }//end main

}//end class