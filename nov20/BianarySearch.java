public class BianarySearch
{
   public static void main(String[] args)
   {
      int [] a = MakeArray.sorted(10 , 20, 5);
      int value = 27;
      int index = search(a, value);
      System.out.println(index);
   }
   public static int search(int [] a, int value)
   {
      int low = 0;
      int high = a.length - 1;
      while (high >= low)
      {
         int mid = (high + low) /2;
         if (a[mid] == value)
            return mid;
         else if (a[mid] > value)
            high = mid - 1;
         else if (a[mid] < value)
            low = mid + 1;
         
      }
      return -1;
   }
}