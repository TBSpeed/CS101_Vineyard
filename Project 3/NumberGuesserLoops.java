/*
  Thomas Belloli
  Number Guesser Code
  CS101-02
  10/26/17-10/29/17
*/

import java.util.*;
public class NumberGuesserLoops
{
 /* 
          Algorithm for main(args)
          
initalize random number generator, rand
initalise Scanner, in
Print "What is the highest number to guess?"
int max <- nextInt
if max<10 , max <- 10
int guessMe
boolean playAgain = true
while (playAgain)
    guessMe <- randomly generated number between 1 and MAX
    playAgain = looper(guessMe)
Print "Game over"
 */
    
 /* 
 			
Data Table for main(args)			
Variable or Constant     Type	         Purpose	
args	                   String []	   parameter, unused	
in	                      Scanner	      Scan for input	
rand	                   Random	      Make the random number	
MAX	                   final int	   The top range of the number generation	
playAgain	             boolean	      if the user wants to play again	
guessMe	                int	         The number the user must guess	
 */
   public static void main(String [] args)
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
   }//main
   
 /* 
                   Algorithm for looper(guessMe)
boolean guessAgain <- true
boolean playAgain <- false
While (playAgain)
    Print "What is your guess?"
    scan next int -> currentGuess
    guesses = guesses + 1
    if currentGuess = guessMe
        Print "You won! The correct number was "
            + guessMe + ", do you want to play again?(true/false)" 
        scan nextBoolean -> playAgain
        guessAgain <-false
    else if currentGuess > guessMe
        Print "Your guess too high, Do you want to guess again?(true/false)"
        scan nextBoolean -> guessAgain
    else if currentGuess > guessMe
        Print "Your guess too high, Do you want to guess again?(true/false)"
        scan nextBoolean -> guessAgain
return guessAgain
 */
    
 /* 
Data Table for looper(guessMe)			
Variable or Constant	        Type	      Purpose	
currentGuess	              int        	the current guess of the user	
guessAgain	                 boolean	   if the user wants to guess again	
guessMe	                    int	         The number the user must guess	
in	                          Scanner	   Scan for input	
 */
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
            System.out.println("Your guess was too high, "
               + "guess again?(true/false)");
            guessAgain = in.nextBoolean();
         }
         else if (currentGuess < guessMe)
         {
            System.out.println("Your guess was too low, "
               + "guess again?(true/false)");
            guessAgain = in.nextBoolean();
         }
      }
      return playAgain;
   }//looper   
   
}//class NumberGuesserLoops