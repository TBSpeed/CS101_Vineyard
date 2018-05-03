public class Logic
{
   public static void main(String[] args)
   {
      int x = 7;
      int y = 3;
      int z = 4;
      System.out.println(x == y);
      System.out.println(x == y+z);
      System.out.println(x != y);
      System.out.println(x != y+z);
      System.out.println(x > y);
      System.out.println(x > y+z);
      System.out.println(x >= y);
      System.out.println(x >= y+z);
      System.out.println(x < y);
      System.out.println(x < y+z);
      System.out.println(x <= y);
      System.out.println(x <= y+z);
      
      if (x > y){
         z = y + x;
      }
      z = 4;
      if (x > 7){
         y = y + z + x;
      }
   }
}