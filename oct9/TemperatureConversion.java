/* Temperature Conversion
   Anderson, Franceschi
   Belloli, Thomas
*/

public class TemperatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
      int factor = 100000;
	   final double ADD_SUBTRACT_VALUE = 32;
      final double ADD_SUBTRACT_VALUE_TENS = ADD_SUBTRACT_VALUE * factor;
      final double MULTIPLY_DEVIDE_FIVE = 5;
      final double MULTIPLY_DEVIDE_NINE = 9;
      int stepMathVar;
      int tempFar;
      int tempCel;
      int tempFarTens;
      int tempCelTens;
			
      //***** 2.  declare temperature in Fahrenheit as an int 
	  
      tempFar = 457;
      final int START_FAR = tempFar;
      tempFarTens = tempFar * factor;
	  		
      //***** 3. calculate equivalent Celsius temperature	
	  
      stepMathVar = tempFarTens - ((int)ADD_SUBTRACT_VALUE_TENS);
      stepMathVar = stepMathVar * ((int)MULTIPLY_DEVIDE_FIVE);
      tempCelTens = stepMathVar / ((int)MULTIPLY_DEVIDE_NINE);
	  		
      //***** 4. output the temperature in Celsius
	   
      tempCel = tempCelTens / factor;
      System.out.println(tempCel);
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
		
      stepMathVar = tempCelTens * ((int)MULTIPLY_DEVIDE_NINE);
      stepMathVar = stepMathVar / ((int)MULTIPLY_DEVIDE_FIVE);
      tempFarTens = stepMathVar + ((int)ADD_SUBTRACT_VALUE_TENS);

      //***** 6. output Fahrenheit temperature to check correctness 
		
      tempFar = tempFarTens / factor;
      String tempFarTensString = Integer.toString(tempFarTens);
      int round = tempFarTensString.indexOf("999");
      if (round >= 0) {
            tempFar = tempFar + 1;
            }
		System.out.println(tempFar);
      int error = tempFar - START_FAR;
      System.out.print("Error analysis:\nThe temprature started as: " + START_FAR);
      System.out.print(" Fahrenheit, it then became: " + tempCel + " Celsius,\nand returned to: " + tempFar);
      System.out.print(" Fahrenheit. The calculation is off by: " + error + " from the starting temprature.");
   }
} 