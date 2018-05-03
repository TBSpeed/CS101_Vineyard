import java.util.*;
public class For
{
   public static void main(String[] args)
   {
      /* 
      for (int index = 0;index <= 25;index++) 
      System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(index));
      
      for (char letter = 'a' ;letter <= 'z';letter++) 
      System.out.println(letter);
      
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      for (int count=1;count<=number;count++)
      {
         for (int counts = 1;counts<=number-count;counts++)
         {
            System.out.print(" ");
         }
         for (int counts =count;counts>=1;counts--)
         {
            System.out.print("* ");
         }
         System.out.println();
         
      }
         
         
      for (char letter = 'a' ;letter <= 'z';letter++)
      {  
         for(char letters = letter ;letters <= 'z';letters++)
         {
         System.out.print("" +letter + letters + " ");
         }
         System.out.println();
      }
      */
      System.out.println(flipper("racecar"));
      }
      public static String flipper(String start)
      {
      String reverse = "";

      for(int i = start.length()-1; i >= 0; i--)
      {
      reverse=reverse + start.charAt(i);
      }
      return reverse;
   }
}