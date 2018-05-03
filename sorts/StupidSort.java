public class StupidSort
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
      for (int sel = 0; sel < a.length - 1; sel++)
      {
         int smallIndex = arrayGet(a, sel);
         swap(a, smallIndex, sel);
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