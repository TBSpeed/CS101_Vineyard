import java.util.*;
/*
           Data Table for setGuessingGame(GuessingGame newGame)			
Variable or Constant 	Type	         Purpose	
newGame	               GuessingGame	Store the new game	
			
                                Data Table for GamePlayer()			
Variable or Constant	   Type	   Purpose	
option	               Int	   Used to store what menu uption the user selected	
easyModeToPass	         Boolean	Used to store the game variable easymode setting	
upperBound	            Int	   used to store the upper bound guessing limit	
			
                                    Data Table for play()			
Variable or Constant	   Type	Purpose	
option	               Int	Used to store what menu uption the user selected	
tempState	            Int	Used to store the temporory state of the game	

		Algoritihm for GuessingGame()		
class GamePlayer				
guessingGame <- newGame				
				
		Algoritihm for setPlayer()		
class GamePlayer				
function setPlayer(Scanner newPlayer)				
player <- newPlayer				
				
		Algorithm for GamePlayer()		
class GamePlayer				
option <- 1				
easyModeToPass <- true				
upperBound <- 10				
while (option != 3)				
    print "Select a menu option my entering the option's number:\n1. Choose difficulty level\n2. Pick upper bound for guess\n3. Play game"  				
    option <- player.nextInt()				
    switch (option) :				
        case 1:				
            print "Choose game difficulty: Easy(true) or Hard(false)"  				
            easyModeToPass <- player.nextBoolean()				
            break				
        case 2:				
            print "Set the highest number you want to guess:"				
            upperBound <- player.nextInt()				
            break				
       case 3:				
            print "Begining game"				
            break				
       default:				
            print "Invalid entry"				
            break 				
guessingGame.GuessingGame(upperBound, easyModeToPass)				
				
			Algorithim for play()	
class GamePlayer				
option <- 1				
tempState <- 5				
while (option != 4)				
    print "Select a menu option my entering the option's number:\n1. Make a guess\n2. Get a hint\n3. Print statistics\n4. Quit this game"				
    option <- player.nextInt()				
    switch (option) :  				
        case 1:				
            print "Make a guess:"				
            tempState <- guessingGame.getGameState()				
            guessingGame.makeGuess(player.nextInt())				
            if (tempState != guessingGame.getGameState())				
                print guessingGame.toString()				
            return				
            break				
        case 2:				
            print guessingGame.hint()				
            break				
        case 3:				
            print guessingGame.toString()				
            break				
        case 4:				
            if (guessingGame.getGameState() == 10)				
            guessingGame.quit()				
            print guessingGame.toString()				
            return				
            break				
        default:				
            print "Invalid entry"				
            break				
*/
public class GamePlayer
{
   GuessingGame guessingGame = new GuessingGame();
   Scanner player = new Scanner(System.in);
   public GuessingGame getGuessingGame()
   {
      return guessingGame;
   }
   public Scanner getPlayer()
   {
      return player;
   }
   public void setGuessingGame(GuessingGame newGame) 
   {
      guessingGame = newGame;
   }
   public void setPlayer(Scanner newPlayer) 
   {
      player = newPlayer;
   }
   public void GamePlayer()
   {
      int option = 1;
      boolean easyModeToPass = true;
      int upperBound = 10;
      while (option != 3)
      {
         System.out.println("Select a menu option my entering the option's number:\n1. Choose difficulty level\n2. Pick upper bound for guess\n3. Play game");
         option = player.nextInt();
         switch (option)
         {
            case 1:
               System.out.println("Choose game difficulty: Easy(true) or Hard(false)");
               easyModeToPass = player.nextBoolean();
               break;
            case 2:
               System.out.println("Set the highest number you want to guess:");
               upperBound = player.nextInt();
               break;
            case 3:
               System.out.println("Begining game");
               break;
            default:
               System.out.println("Invalid entry");
               break;
         }
      }
      guessingGame.GuessingGame(upperBound, easyModeToPass);
   }
      public void play()
   {
      int option = 1;
      int tempState = 5;
      while (option != 4)
      {
         System.out.println("Select a menu option my entering the option's number:\n1. Make a guess\n2. Get a hint\n3. Print statistics\n4. Quit this game");
         option = player.nextInt();
         switch (option)
         {
            case 1:
               System.out.println("Make a guess:");
               tempState = guessingGame.getGameState();
               guessingGame.makeGuess(player.nextInt());
               if (tempState != guessingGame.getGameState())
               {
                  System.out.println(guessingGame.toString());
                  return;
               }
               break;
            case 2:
               System.out.println(guessingGame.hint());
               break;
            case 3:
               System.out.println(guessingGame.toString());
               break;
            case 4:
               if (guessingGame.getGameState() == 10)
               {
                  guessingGame.quit();
                  System.out.println(guessingGame.toString());
                  return;
               }
               break;
            default:
               System.out.println("Invalid entry");
               break;
         }
      }
   
   }
}