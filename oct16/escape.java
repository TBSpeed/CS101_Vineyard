import java.util.*;

public class escape
{
   public static void main(String[] args)
   { 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a first and last name seperated by a space");
      String name = in.nextLine();//read firstname lastname
      String reorder = swap(name);
      System.out.println(reorder);
   }
   
   public static String swap(String name)
   {
      Scanner stringScan = new Scanner(name);
      String first = stringScan.next();
      String last = stringScan.next();
      String firstFirst = first.substring(0,1);
      String lastFirst = last.substring(0,1);
      String irst = first.substring(1);
      String ast = last.substring(1);
      String nameGame = lastFirst + irst + " " + firstFirst + ast;
      return nameGame;
   }
}