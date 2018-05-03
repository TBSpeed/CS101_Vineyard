import java.util.*; 
/*
Data Table for GuessingGame(int largestPossibleNumber, boolean difficulty)			
Variable or Constant	   Type	   Purpose	
rand	                  Random	Generate the random number for the game	
largestPossibleNumber	Int	   Hold the largest possible number for the game	
difficulty	            Boolean	Hold the difficulty of the game	
			
             Data Table for GuessingGame(int largestPossibleNumber)			
Variable or Constant	   Type	Purpose	
largestPossibleNumber	Int	Hold the largest possible number for the game	
			
               Data Table for GuessingGame(boolean difficulty)			
Variable or Constant	Type	   Purpose	
difficulty	         Boolean	Hold the difficulty of the game	
			
                        Data Table for GuessingGame()			
Variable or Constant	Type	Purpose	
			
                   Data Table for setNumberToGuess(int number)			
Variable or Constant	   Type	Purpose	
number	               Int	pass the number to guess to the class variable	
			
                 Data Table for setNumberOfGuesses(int number)			
Variable or Constant	Type	Purpose	
number	            Int	pass the number of guesses to the class variable	
			
              Data Table for setLargestPossibleNumber(int number)			
Variable or Constant	Type	Purpose	
number	            Int	pass the largest number to guess to the class variable	
			
                 Data Table for setEasyGame(boolean difficulty)			
Variable or Constant	Type	   Purpose	
difficulty	         Boolean	pass the difficulty of the game to the class variable	
			
                Data Table for computeMaxNumberOfGuesses()			
Variable or Constant	Type	Purpose	
pong	               Int	Hold the return value	
mathWork	            Int	Hold the value being calculated	
loops	               Int	Hold the number of loops that have ran	
			
        Data Table for setMaximumNumberOfGuesses(int number)			
Variable or Constant	Type	Purpose	
number	            Int	Set the max number of guesses	
			
             Data Table for setCurrentMinimumRange(int min)			
Variable or Constant	Type	Purpose	
min	               Int	Pass the minimum guess range to the class variable	
			
            Data Table for setCurrentMaximumRange(int max)			
Variable or Constant	Type	Purpose	
max	               Int	Pass the maximum guess range to the class variable	
			
                   Data Table for setGameState(int state)			
Variable or Constant	Type	Purpose	
state	               Int	Pass the game state to the class variable	
			
           Data Table for setGuessTooLow(boolean tooLow)			
Variable or Constant	Type	   Purpose	
tooLow	            Boolean	Pass the game state to the class variable	
			
                 Data Table for makeGuess(int guess)			
Variable or Constant	Type	Purpose	
guess	               Int	Check the guess against the class variable	
			
                              Data Table for hint()			
Variable or Constant	Type	Purpose	
pong	               Int	Hold the return value	
			
                              Data Table for quit()			
Variable or Constant	Type	Purpose	
			
                              Data Table for toString()			
Variable or Constant	Type	Purpose	
pong	               Int	Hold the return value	
			
                  Data Table for setPlayer(Scanner newPlayer)			
Variable or Constant	Type	   Purpose	
newPlayer	         Scanner	Hold the return value	

			Algorithm for GuessingGame(largestPossibleNumber, difficulty)			
class GuessingGame						
Random rand <- new Random()						
setLargestPossibleNumber(largestPossibleNumber)						
setNumberToGuess(rand.nextInt(largestPossibleNumber) + 0)						
setNumberOfGuesses(0)						
setEasyGame(difficulty)						
setMaximumNumberOfGuesses(computeMaxNumberOfGuesses())						
setCurrentMinimumRange(0)						
setCurrentMaximumRange(largestPossibleNumber)						
setGameState(GAME_IN_PROGRESS)						
setGuessTooLow(false)						
						
			Algorithm for GuessingGame(largestPossibleNumber)			
class GamePlayer						
this.GuessingGame(largestPossibleNumber, EASY_GAME)						
						
			Algorithm for GuessingGame(difficulty)			
class GamePlayer						
this.GuessingGame(DEFAULT_MAXIMUM_RANGE, difficulty)						
						
			Algorithm for GuessingGame()			
class GamePlayer						
this.GuessingGame(DEFAULT_MAXIMUM_RANGE, EASY_GAME)						
						
			Algorithm for setNumberToGuess(number)			
class GamePlayer						
numberToGuess <- number						
						
			Algorithm for setNumberOfGuesses(number)			
class GamePlayer						
numberOfGuesses <- number						
						
			Algorithm for setLargestPossibleNumber(number)			
class GamePlayer						
largestPossibleNumber <- Math.max(number, DEFAULT_MAXIMUM_RANGE)						
						
			Algorithm for setEasyGame(difficulty)			
class GamePlayer						
easyGame <- difficulty						
						
			Algorithm for computeMaxNumberOfGuesses()			
class GamePlayer						
pong						
mathWork <- largestPossibleNumber						
loops <- 0						
if (easyGame)						
    pong <- largestPossibleNumber / 2						
else						
    while (mathWork >= 1)						
        mathWork <- mathWork / 2						
        loops++ 						
    loops++						
    pong <- loops						
return pong						
						
			Algorithm for setMaximumNumberOfGuesses(number)			
class GamePlayer						
maximumNumberOfGuesses <- number						
						
			Algorithm for setCurrentMinimunRange(min)			
class GamePlayer						
if (min < numberToGuess AND min >= currentMinimumRange)						
    currentMinimumRange <- min						
						
			Algorithm for setCurrentMaximumRange(max)			
class GamePlayer						
if (max > numberToGuess AND max <= currentMaximumRange)						
    currentMaximumRange <- max 						
						
			Algorithm for setGameState(state)			
class GamePlayer						
gameState <- state						
						
			Algorithm for setGuessTooLow(tooLow)			
class GamePlayer						
guessTooLow <- tooLow						
						
			Algorithm for makeGuess(guess)			
class GamePlayer						
if (gameState == GAME_WON)						
//do nothing						
else if (gameState == GAME_LOST) 						
//do nothing						
else if (gameState == GAME_IN_PROGRESS)						
    numberOfGuesses++						
if (guess == numberToGuess)						
    setGameState(GAME_WON)						
else if (guess < numberToGuess)						
    setGuessTooLow(true)						
    setCurrentMinimumRange(guess)						
else if (guess > numberToGuess)						
    setGuessTooLow(false) 						
    setCurrentMaximumRange(guess)						
if (numberOfGuesses == maximumNumberOfGuesses AND NOT (gameState == GAME_WON))						
    setGameState(GAME_LOST)						
						
			Algorithm for hint()			
class GamePlayer						
String pong <- "Choose a number between " + currentMinimumRange + " and " + currentMaximumRange						
return pong						
						
			Algorithm for quit()			
class GamePlayer						
setGameState(GAME_LOST)						
						
			Algorithm for toString()			
class GamePlayer						
String pong						
if (gameState == GAME_IN_PROGRESS)						
    pong <- "You have " + (maximumNumberOfGuesses - numberOfGuesses) + " guesses left"						
else if (gameState == GAME_WON)						
    pong <- "It took you " + numberOfGuesses + " tries to correctly guess " + numberToGuess + ". Good job!"						
else						
    pong <- "It took you " + numberOfGuesses + " guesses to lose. The number was " + numberToGuess + ". Better luck next time!"						
return pong						
*/
public class GuessingGame
{
   final boolean EASY_GAME = true;
   final boolean DIFFICULT_GAME = false;
   final int DEFAULT_MAXIMUM_RANGE = 10;
   final int GAME_LOST = 0;
   final int GAME_IN_PROGRESS = 10;
   final int GAME_WON = 1;
   private int gameState; 
   private int numberToGuess; 
   private int numberOfGuesses; 
   private int largestPossibleNumber; 
   private int maximumNumberOfGuesses; 
   private int currentMinimumRange = 0; 
   private int currentMaximumRange = Integer.MAX_VALUE; 
   private boolean guessTooLow = false; 
   private boolean easyGame; 
   public void GuessingGame(int largestPossibleNumber, boolean difficulty) 
   {
   Random rand = new Random();
   setLargestPossibleNumber(largestPossibleNumber);
   setNumberToGuess(rand.nextInt(largestPossibleNumber) + 0);
   setNumberOfGuesses(0);
   setEasyGame(difficulty);
   setMaximumNumberOfGuesses(computeMaxNumberOfGuesses());
   setCurrentMinimumRange(0);
   setCurrentMaximumRange(largestPossibleNumber);
   setGameState(GAME_IN_PROGRESS);
   setGuessTooLow(false);
   }
   public void GuessingGame(int largestPossibleNumber)
   {
      this.GuessingGame(largestPossibleNumber, EASY_GAME);
   }
   public void GuessingGame(boolean difficulty) 
   {
      this.GuessingGame(DEFAULT_MAXIMUM_RANGE, difficulty);
   }
   public void GuessingGame() 
   {
      this.GuessingGame(DEFAULT_MAXIMUM_RANGE, EASY_GAME);
   }
   public int getGameState()
   {
      return gameState;
   }
   public int getNumberToGuess()
   {
      return numberToGuess;
   }
   public int getNumberOfGuesses()
   {
      return numberOfGuesses;
   }
   public int getLargestPossibleNumber()
   {
      return largestPossibleNumber;
   }
   public int getMaximumNumberOfGuesses()
   {
      return maximumNumberOfGuesses;
   }
   public int getCurrentMinimumRange()
   {
      return currentMinimumRange;
   }
   public int getCurrentMaximumRange()
   {
      return currentMaximumRange;
   }
   public boolean getGuessTooLow()
   {
      return guessTooLow;
   }
   public boolean getEasyGame()
   {
      return easyGame;
   }
   private void setNumberToGuess(int number) 
   {
      numberToGuess = number;
   }
   private void setNumberOfGuesses(int number)
   {
      numberOfGuesses = number;
   }
   private void setLargestPossibleNumber(int number) 
   {
      largestPossibleNumber = Math.max(number, DEFAULT_MAXIMUM_RANGE);
   }
   private void setEasyGame(boolean difficulty)
   {
      easyGame = difficulty;
   }
   private int computeMaxNumberOfGuesses()
   {
      int pong;
      int mathWork = largestPossibleNumber;
      int loops = 0;
      if (easyGame)
         pong = largestPossibleNumber / 2;
      else
      {
         while (mathWork >= 1)
         {
            mathWork = mathWork / 2;
            loops++;
         }
         loops++;
         pong = loops;
      }
      return pong;
   }
   private void setMaximumNumberOfGuesses(int number)
   {
      maximumNumberOfGuesses = number;
   }
   private void setCurrentMinimumRange(int min)
   {
      if (min < numberToGuess && min >= currentMinimumRange)
         currentMinimumRange = min;
   }
   private void setCurrentMaximumRange(int max)
   {
      if (max > numberToGuess && max <= currentMaximumRange)
         currentMaximumRange = max;
   }
   private void setGameState(int state)
   {
      gameState = state;
   }
   private void setGuessTooLow(boolean tooLow)
   {
      guessTooLow = tooLow;
   }
   public void makeGuess(int guess)
   {
      if (gameState == GAME_WON)
      {
      //do nothing
      }
      else if (gameState == GAME_LOST)
      {
      //do nothing
      }
      else if (gameState == GAME_IN_PROGRESS)
         numberOfGuesses++;
      if (guess == numberToGuess)
         setGameState(GAME_WON);
      else if (guess < numberToGuess)
      {
         setGuessTooLow(true);
         setCurrentMinimumRange(guess);
      }
      else if (guess > numberToGuess)
      {
         setGuessTooLow(false);
         setCurrentMaximumRange(guess);
      }
      if (numberOfGuesses == maximumNumberOfGuesses && !(gameState == GAME_WON))
         setGameState(GAME_LOST);
   }
   public String hint()
   {
      String pong = "Choose a number between " + currentMinimumRange + " and " + currentMaximumRange;
      return pong;
   }
   public void quit()
   {
      setGameState(GAME_LOST);
   }
   public String toString()
   {
      String pong;
      if (gameState == GAME_IN_PROGRESS)
         pong = "You have " + (maximumNumberOfGuesses - numberOfGuesses) + " guesses left";
      else if (gameState == GAME_WON)
         pong = "It took you " + numberOfGuesses + " tries to correctly guess " + numberToGuess + ". Good job!";
      else
         pong = "It took you " + numberOfGuesses + " guesses to lose. The number was " + numberToGuess + ". Better luck next time!";
      return pong;
   }
}