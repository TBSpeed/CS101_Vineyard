import java.util.*;
public class MultiDArrays
{
   public static void main(String[] args)
   {
      Random rand = new Random();
      /*
      int [][] twoD = new int [3][4];
      for (int row = 0; row < twoD.length; row++)
      {
         for (int col = 0; col < twoD[row].length; col++)
         {
            twoD[row][col] = rand.nextInt(50)+1;
         }
      }
      */
      int [][] staggered = new int [3][];
      staggered[0] = new int[3];
      staggered[1] = new int[4];
      staggered[2] = new int[2];
      for (int row = 0; row < shaped.length; row++)
      {
         for (int col = 0; col < shaped[row].length; col++)
         {
            shaped[row][col] = rand.nextInt(50)+1;
         }
      }
   }
}