import java.util.*;
/*
Data Table for main(args)			
Variable or Constant    Type	   Purpose	
args	                  String[]	Peramiter, unused	
scan	                  Scanner	Scan for Imput from the user	
playAgain	            Boolean	Store wether or not the user wants to play again	
plays	                  Int   	Count the number of times the user has played	

		Algorithm for main(args)	
class PlayGame			
playAgain <- true			
plays <- 0			
while (playAgain)			
    GamePlayer player <- new GamePlayer()			
    player.GamePlayer()			
    player.play()  			
    plays++			
    print "Do you want to play again?(true/false)"			
    read playAgain			
if (plays == 1)			
    print "Thank you for playing! You played once."			
else if (plays > 1)			
    print "Thank you for playing! You played " + plays + " times!"			
*/
public class PlayGame
{ 
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean playAgain = true;
      int plays = 0;
      while (playAgain)
      {
         GamePlayer player = new GamePlayer();
         player.GamePlayer();
         player.play();
         plays++;
         System.out.println("Do you want to play again?(true/false)");
         playAgain = scan.nextBoolean();
      }
      if (plays == 1)
         System.out.println("Thank you for playing! You played once.");
      else if (plays > 1)
         System.out.println("Thank you for playing! You played " + plays + " times!");
   }
}