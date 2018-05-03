import java.util.*;
import java.io.*;
public class Driver
{
   public static Set[] sets;
   /*
   Data Table for Driver				
Variable or Constant	Type	Purpose
____________________________________________
sets                 Set[] track the set objects
   */
   public static void main(String[] args)throws Exception
   {
      sets = new Set[100];
      File inputFile = new File(args[0]);
      Scanner fileScan = new Scanner(inputFile);
      File outFile = new File(args[1]);
      PrintStream fileOutput = new PrintStream(outFile);
      int setNumber, setNumber1, setNumber2, setNumber3;
      int newNumber;
      while(fileScan.hasNextLine())
      {
         switch(fileScan.next())
         {
            case "C":
               setNumber = fileScan.nextInt();
               sets[setNumber] = new Set();
               fileOutput.println("Set " + setNumber + " has been created as a new, empty set.");
               break;
            case "I":
               setNumber = fileScan.nextInt();
               boolean empty = true;
               if(sets[setNumber] == null){
                  fileOutput.println("There is no set " + setNumber);
               }
               else if (empty){
                  empty = sets[setNumber].isEmpty();
                  if(empty){
                     fileOutput.println("Set " + setNumber + " is empty.");
                  }
                  else
                     fileOutput.println("Set " + setNumber + " is not an empty set.");
               }
               break;
            case "S":
               setNumber = fileScan.nextInt();
               if(sets[setNumber] == null){
                  fileOutput.println("There is no set " + setNumber);
               }
               else
                  fileOutput.println("Set " + setNumber + " contains " + sets[setNumber].size() + " values.");
               break;
            case "X":
               setNumber = fileScan.nextInt();
               if (sets[setNumber] == null){
                  fileOutput.println("There was no set " + setNumber + " to empty.");
               }
               else if (sets[setNumber].size() >= 0){
                  sets[setNumber].makeEmpty();
                  fileOutput.println("The set " + setNumber + " has been emptied.");
               }
               break;
            case "A":
               setNumber = fileScan.nextInt();
               newNumber = fileScan.nextInt();
               if (sets[setNumber] == null){
                  fileOutput.println("The set " + setNumber + " does not exist.");
               }
               
               else if (!sets[setNumber].elementOf(newNumber)){
                  sets[setNumber].add(newNumber);
                  fileOutput.println("The value " + newNumber + " has been added to the set " + setNumber + ".");
               }
               else if (sets[setNumber].elementOf(newNumber)){
                  fileOutput.println("The value " + newNumber + " already exists in the set " + setNumber + ".");
               }
               break;
            case "R":
               setNumber = fileScan.nextInt();
               newNumber = fileScan.nextInt();
               if (sets[setNumber] == null){
                  fileOutput.println("There is not set " + setNumber + ", in which to find the value " + newNumber + ".");
               }
               else 
               {
                  sets[setNumber].remove(newNumber);
                  fileOutput.println("The value " + newNumber + " has been removed from set " + setNumber + ".");
               }
               break;
            case "F":
               setNumber = fileScan.nextInt();
               newNumber = fileScan.nextInt();
               if (sets[setNumber] == null){
                  fileOutput.println("There is not set " + setNumber + ", in which to find the value " + newNumber + ".");
               }
               else if (sets[setNumber].elementOf(newNumber))
                  fileOutput.println("Set " + setNumber + " contains the value " + newNumber + ".");
               else if (!sets[setNumber].elementOf(newNumber))
                  fileOutput.println("Set " + setNumber + " does not contain the value " + newNumber + ".");
               break;
            case "U":
               setNumber1 = fileScan.nextInt();
               setNumber2 = fileScan.nextInt();
               setNumber3 = fileScan.nextInt();
               if(sets[setNumber1] == null || sets[setNumber2] == null){
                  fileOutput.println("The union could not be done as one or more sets do not exist.");
               }
               else if(sets[setNumber1] != null && sets[setNumber2] != null){
                  sets[setNumber3] = sets[setNumber1].union(sets[setNumber2]);
                  fileOutput.println("Set " + setNumber3 + " is the union set of sets " + setNumber1 + " & " +  setNumber2 + ".");
               }
               break;
            case "N":
               setNumber1 = fileScan.nextInt();
               setNumber2 = fileScan.nextInt();
               setNumber3 = fileScan.nextInt();
               if(sets[setNumber1] == null || sets[setNumber2] == null){
                  fileOutput.println("The intersection could not be done as one or more sets do not exist.");
               }
               else if(sets[setNumber1] != null && sets[setNumber2] != null){
                  sets[setNumber3] = sets[setNumber1].intersection(sets[setNumber2]);
                  fileOutput.println("Set " + setNumber3 + " is the intersection set of sets " + setNumber1 + " & " +  setNumber2 + ".");
               }               
               break;
            case "D":
               setNumber1 = fileScan.nextInt();
               setNumber2 = fileScan.nextInt();
               setNumber3 = fileScan.nextInt();
               if(sets[setNumber1] == null || sets[setNumber2] == null){
                  fileOutput.println("The intersection could not be done as one or more sets do not exist.");
               }
               else if(sets[setNumber1] != null && sets[setNumber2] != null){
               
                  sets[setNumber3] = sets[setNumber1].setDifference(sets[setNumber2]);
                  fileOutput.println("Set " + setNumber3 + " is the difference set of sets " + setNumber1 + " & " +  setNumber2 + ".");
               }
               break;
            case "P":
               setNumber = fileScan.nextInt();
               if (sets[setNumber] == null){
                  fileOutput.println("The set " + setNumber + " does not exist, and cannot be printed.");
               }
               else
                  fileOutput.println("Set " + setNumber + " is: " + "\n\t" + sets[setNumber].toString());
               break;
            case "M":
               setNumber = fileScan.nextInt();
               newNumber = 0;
               sets[setNumber] = new Set();
               while(fileScan.hasNextInt()){
                  newNumber = fileScan.nextInt();
                  sets[setNumber].add(newNumber);
               }
               break;
            case "#":
               String com = fileScan.nextLine();
               fileOutput.println(com);
               break;
            
         }
      }
   }
   /*
   Algotithm for main(String[] args)throws Excption
        sets <- Set[0..99]
        File inputFile <- new File(args[0])
        Scanner fileScan <- new Scanner(inputFile)
        File outFile <- new File(args[1])
        PrintStream fileOutput <- new PrintStream(outFile)
        declare ints setNumber, setNumber1, setNumber2, setNumber3
        declare int newNumber
        while (fileScan.hasNextLine()) 
            switch (fileScan.next()) :
                case "C":
                    setNumber <- fileScan.nextInt()
                    sets[setNumber] <- new Set()
                    fileOutput.println("Set " + setNumber + " has been created as a new, empty set.")
                    break
                case "I":
                    setNumber <- fileScan.nextInt()
                    empty <- true
                    if (sets[setNumber] == NIL)
                        fileOutput.println("There is no set " + setNumber)
                    else if (empty)
                        empty <- sets[setNumber].isEmpty()
                        if (empty)
                            fileOutput.println("Set " + setNumber + " is empty.")
                        else
                            fileOutput.println("Set " + setNumber + " is not an empty set.")
                    break
                case "S":
                    setNumber <- fileScan.nextInt()
                    if (sets[setNumber] == NIL)
                        fileOutput.println("There is no set " + setNumber)
                    else if (sets[setNumber].size() > 0)
                        fileOutput.println("Set " + setNumber + " contains " + sets[setNumber].size() + " values.")
                    else if (sets[setNumber].isEmpty())
                        fileOutput.println("Set " + setNumber + " is empty")
                    break
                case "X":
                    setNumber <- fileScan.nextInt()
                    if (sets[setNumber] == NIL)
                        fileOutput.println("There was no set " + setNumber + " to empty.")
                    else if (sets[setNumber].size() >= 0)
                        sets[setNumber].makeEmpty()
                        fileOutput.println("The set " + setNumber + " has been emptied.")
                    break
                case "A":
                    setNumber <- fileScan.nextInt()
                    newNumber <- fileScan.nextInt()
                    if (sets[setNumber] == NIL)
                        fileOutput.println("The set " + setNumber + " does not exist.")
                    else if (NOT sets[setNumber].elementOf(newNumber))
                        sets[setNumber].add(newNumber)
                        fileOutput.println("The value " + newNumber + " has been added to the set " + setNumber + ".")
                    else if (sets[setNumber].elementOf(newNumber))
                        fileOutput.println("The value " + newNumber + " already exists in the set " + setNumber + ".")
                    break
                case "R":
                    setNumber <- fileScan.nextInt()
                    newNumber <- fileScan.nextInt()
                    if (sets[setNumber] == NIL)
                        fileOutput.println("There is not set " + setNumber + ", in which to find the value " + newNumber + ".")
                    else 
                        sets[setNumber].remove(newNumber)
                        fileOutput.println("The value " + newNumber + " has been removed from set " + setNumber + ".")
                    break
                case "F":
                    setNumber <- fileScan.nextInt()
                    newNumber <- fileScan.nextInt()
                    if (sets[setNumber] == NIL)
                        fileOutput.println("There is not set " + setNumber + ", in which to find the value " + newNumber + ".")
                    else if (sets[setNumber].elementOf(newNumber))
                        fileOutput.println("Set " + setNumber + " contains the value " + newNumber + ".")
                    else if (NOT sets[setNumber].elementOf(newNumber))
                        fileOutput.println("Set " + setNumber + " does not contain the value " + newNumber + ".")
                    break
                case "U":
                    setNumber1 <- fileScan.nextInt()
                    setNumber2 <- fileScan.nextInt()
                    setNumber3 <- fileScan.nextInt()
                    if (sets[setNumber1] == NIL OR sets[setNumber2] == NIL)
                        fileOutput.println("The union could not be done as one or more sets do not exist.")
                    else if (sets[setNumber1] != NIL AND sets[setNumber2] != NIL)
                        sets[setNumber3] <- sets[setNumber1].union(sets[setNumber2])
                        fileOutput.println("Set " + setNumber3 + " is the union set of sets " + setNumber1 + " & " + setNumber2 + ".")
                    break
                case "N":
                    setNumber1 <- fileScan.nextInt()
                    setNumber2 <- fileScan.nextInt()
                    setNumber3 <- fileScan.nextInt()
                    if (sets[setNumber1] == NIL OR sets[setNumber2] == NIL)
                        fileOutput.println("The intersection could not be done as one or more sets do not exist.")
                    else if (sets[setNumber1] != NIL AND sets[setNumber2] != NIL)
                        sets[setNumber3] <- sets[setNumber1].intersection(sets[setNumber2])
                        fileOutput.println("Set " + setNumber3 + " is the intersection set of sets " + setNumber1 + " & " + setNumber2 + ".")
                    break
                case "D":
                    setNumber1 <- fileScan.nextInt()
                    setNumber2 <- fileScan.nextInt()
                    setNumber3 <- fileScan.nextInt()
                    if (sets[setNumber1] == NIL OR sets[setNumber2] == NIL)
                        fileOutput.println("The intersection could not be done as one or more sets do not exist.")
                    else if (sets[setNumber1] != NIL AND sets[setNumber2] != NIL)
                        sets[setNumber3] <- sets[setNumber1].setDifference(sets[setNumber2])
                        fileOutput.println("Set " + setNumber3 + " is the difference set of sets " + setNumber1 + " & " + setNumber2 + ".")
                    break
                case "P":
                    setNumber <- fileScan.nextInt()
                    if (sets[setNumber] == NIL)
                        fileOutput.println("The set " + setNumber + " does not exist, and cannot be printed.")
                    else
                        fileOutput.println("Set " + setNumber + " is: " + "\n\t" + sets[setNumber].toString())
                    break
                case "M":
                    setNumber <- fileScan.nextInt()
                    newNumber <- 0
                    sets[setNumber] <- new Set()
                    while (fileScan.hasNextInt()) 
                        newNumber <- fileScan.nextInt()
                        sets[setNumber].add(newNumber)
                    break
                case "#":
                    String com <- fileScan.nextLine()
                    fileOutput.println(com)
                    break
                    
                    
        Data Table for main(String[] args)				
Variable or Constant	Type	      Purpose
____________________________________________
args	               String[]    peramiter, unused
inputFile	         File        the files that commands are pulled in from
fileScan	            Scanner     the scanner to read the in file
outFile	            File        the file that output is going to
fileOutput	         PrintStream the printstream used to output to the outfile
setNumber	         int         used to track set input
setNumber1	         int         used to track set input for the union, differance, and intersection commands
setNumber2	         int         used to track set input for the union, differance, and intersection commands
setNumber3	         int         used to track set input for the union, differance, and intersection commands
newNumber	         int         used to track the number of the new set that will be created
empty	               boolean     used to track wether or not the set is empty for the is empty command
com	               string      used to hold the command and the comments for the switch and file output respectivly
   */
}