public class Grades {
   public static void main(String[] args){
      int score = 7;
      char grade = 'U';
      if (score > 8){
         grade = 'A';
      }
      else if (score == 8){
         grade = 'B';
      }
      else if (score == 7){
         grade = 'C';
      }
      else if (score == 6){
         grade = 'D';
      }
      else {
         grade = 'F';
      }
      System.out.println(grade);
   
   }
}