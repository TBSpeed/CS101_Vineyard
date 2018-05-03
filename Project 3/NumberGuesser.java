import java.util.*;
public class NumberGuesser
{
   public static void main(String[] args)
   {
      Random rand = new Random();
      Scanner in = new Scanner(System.in);
      System.out.println("What is the highest number to guess?");
      int max = in.nextInt();
      if (max < 10) max = 10;
      boolean playAgain = true;
      int guessMe;
      while (playAgain)
      {
         guessMe = rand.nextInt(max) + 1;
         playAgain = looper(guessMe);
      }
      System.out.println("Game Over");
   }
   
   public static boolean looper(int guessMe)
   {
      boolean guessAgain = true;
      boolean playAgain = false;
      while (guessAgain)
      {
         System.out.println("What is your guess?");
         Scanner in = new Scanner(System.in);
         int currentGuess = in.nextInt();
         if (currentGuess == guessMe)
         {
            System.out.println("You won! The correct number was "
               + guessMe + ", do you want to play again?(true/false)");
            playAgain = in.nextBoolean();
            guessAgain = false;
         }
         else if (currentGuess > guessMe)
         {
            System.out.println("Your guess was too high, guess again?(true/false)");
            guessAgain = in.nextBoolean();
         }
         else if (currentGuess < guessMe)
         {
            System.out.println("Your guess was too low, guess again?(true/false)");
            guessAgain = in.nextBoolean();
         }
      }
      return playAgain;
   }
}