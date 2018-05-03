import java.util.*;
import java.io.*;
public class FileImport
{
   public static void main( String [] args ) throws Exception
   {
      File inFile = new File(args[0]);
      Scanner fileScan = new Scanner(inFile);
      int intInGer = Integer.MIN_VALUE;
      String wasteLine = "Non Ints go here";
      while (fileScan.hasNext())
      {
         while (!(fileScan.hasNextInt()))
         {
            wasteLine = fileScan.next();
         }
         intInGer = Math.max(intInGer, fileScan.nextInt());
      }
      System.out.println(intInGer);
   }
}