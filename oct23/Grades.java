public class Grades {
   public static void main(String[] args){
      int score = 11;
      char grade = 'U';
      switch (score)
      {
         case 9:
            {
               grade = 'A';
            }
            break;
         case 10:
            {
               grade = 'A';
            }
            break;
         case 8:
            {
               grade = 'B';
            }
            break;
         case 7:
            {
               grade = 'C';
            }
            break;
         case 6:
            {
               grade = 'D';
            }
            break;
         case 5:
            {
               grade = 'D';
            }
            break;
         case 4:
            {
               grade = 'D';
            }
            break;
         case 3:
            {
               grade = 'D';
            }
            break;
         case 2:
            {
               grade = 'D';
            }
            break;
         case 1:
            {
               grade = 'D';
            }
            break;
         case 0:
            {
               grade = 'D';
            }
            break;
         default:
            {
               System.out.println("Error with entered number");
            }
            break;
      }
      System.out.println(grade);
   
   }
}