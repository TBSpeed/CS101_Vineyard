public class LinearUnsortedSearch
{
   public static void main(String[] args)
   {
      int [] a = MakeArray.sorted(10 , 20, 40);
      int value = 27;
      int index = search(a, value);
      System.out.println(index);
   }
   public static int search(int [] a, int value)
   {
      int index = 0;
      while (a.length < index && a[index] != value)
      {
         index++;
      }
      if (a.length == index)
         index = -1;
      return index;
   }
}