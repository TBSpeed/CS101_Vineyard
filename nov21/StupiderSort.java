public class StupiderSort
{
   public static void main(String[] args)
   {
      int [] a = {2,6,55,8,7,4,69,5,25,99};
      stupidSort(a);
      String print = "";
      for (int i = 0; i < a.length; i++)
      {
         print = print + a[i] + " ";
      }
      System.out.println(print);
   }
   public static void stupidSort(int [] a)
   {
      for (int passes = 1; passes < a.length; passes++)
      {
         for (int i = 0; i < a.length -1; i++)
         {
            if (a[i] > a[i+1])
               swap(a, i, i+1);
         }
         
      }
   }
   public static void swap(int[] a, int firstIndex, int secondIndex)
   {
      int firstTemp = a[firstIndex];
      int secondTemp = a[secondIndex];
      a[firstIndex] = secondTemp;
      a[secondIndex] = firstTemp;
      return;
   }
   public static int arrayGet(int[] a, int startIndex)
   {
      int min = Integer.MAX_VALUE;
      int minIndex = -1;
      while (startIndex < a.length)
      {
         if (startIndex < a.length && a[startIndex] < min)
         {
            min = a[startIndex];
            minIndex = startIndex;
         }
         startIndex++;
      }
      return minIndex;
   }
}