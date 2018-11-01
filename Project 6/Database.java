import java.util.*;
import java.io.*;
public class Database
{
   public static Person[] people;
   public static void main(String[] args)throws Exception
   {
      String name, address, phoneNumber, email, office, dateStr, title, officeHours, supervisor, status, assistantType;
      Date date;
      int dateMM, dateDD, dateYYYY;
      float salary;
      people = new Person[100];
      int personCount = 0;
      File inputFile = new File(args[0]);
      Scanner fileScan = new Scanner(inputFile);
      File outFile = new File(args[1]);
      PrintStream fileOutput = new PrintStream(outFile);
      fileOutput.println("Project 6\r\nTBSpeed - CS 101-02\r\nThe next lines contain an echo of the input file");
      int lineTotal = 0;
      while(fileScan.hasNextLine())
      {
         fileOutput.println("\t" + fileScan.nextLine());
         lineTotal++;
      }
      inputFile = new File(args[0]);
      fileScan = new Scanner(inputFile);
      fileScan.useDelimiter("#|\\n|\\r");
      //String wastedInput;
      while(personCount < lineTotal)
      {
         switch(fileScan.next())
         {
            case "u":
               name = fileScan.next();
               address = fileScan.next();
               phoneNumber = fileScan.next();
               email = fileScan.next();
               dateStr = fileScan.next();
               dateMM = Integer.parseInt(dateStr.substring(0, 2));
               dateDD = Integer.parseInt(dateStr.substring(3, 5));
               dateYYYY = Integer.parseInt(dateStr.substring(6, 10));
               date = new Date(dateMM, dateDD, dateYYYY);
               status = fileScan.next();
               people[personCount] = new UndergraduateStudent(name, address, phoneNumber, email, date, status);
               personCount++;
               /*
               if (personCount <= 19)
                  wastedInput = fileScan.next();
               */
               break;
            case "g":
               name = fileScan.next();
               address = fileScan.next();
               dateStr = fileScan.next();
               dateMM = Integer.parseInt(dateStr.substring(0, 2));
               dateDD = Integer.parseInt(dateStr.substring(3, 5));
               dateYYYY = Integer.parseInt(dateStr.substring(6, 10));
               date = new Date(dateMM, dateDD, dateYYYY);
               phoneNumber = fileScan.next();
               email = fileScan.next();
               status = fileScan.next();
               assistantType = fileScan.next();
               people[personCount] = new GraduateStudent(name, address, phoneNumber, email, date, status, assistantType);
               personCount++;
               /*
               if (personCount <= 19)
                  wastedInput = fileScan.next();
               */
               break;
            case "f":
               name = fileScan.next();
               address = fileScan.next();
               phoneNumber = fileScan.next();
               email = fileScan.next();
               office = fileScan.next();
               salary = fileScan.nextFloat();
               dateStr = fileScan.next();
               dateMM = Integer.parseInt(dateStr.substring(0, 2));
               dateDD = Integer.parseInt(dateStr.substring(3, 5));
               dateYYYY = Integer.parseInt(dateStr.substring(6, 10));
               date = new Date(dateMM, dateDD, dateYYYY);
               title = fileScan.next();
               officeHours = fileScan.next();
               people[personCount] = new Faculty(name, address, phoneNumber, email, office, salary, date, title, officeHours);
               personCount++;
               /*
               if (personCount <= 19)
                  wastedInput = fileScan.next();
               */
               break;
            case "s":
               name = fileScan.next();
               address = fileScan.next();
               title = fileScan.next();
               phoneNumber = fileScan.next();
               email = fileScan.next();
               office = fileScan.next();
               salary = fileScan.nextFloat();
               dateStr = fileScan.next();
               dateMM = Integer.parseInt(dateStr.substring(0, 2));
               dateDD = Integer.parseInt(dateStr.substring(3, 5));
               dateYYYY = Integer.parseInt(dateStr.substring(6, 10));
               date = new Date(dateMM, dateDD, dateYYYY);
               supervisor = fileScan.next();
               people[personCount] = new Staff(name, address, title, phoneNumber, email, office, salary, date, supervisor);
               personCount++;
               /*
               if (personCount <= 19)
                  wastedInput = fileScan.next();
               */
               break;
         }
      }
         //Print The entire database, sorted by name, with its own header
      Person temp;
      boolean again = true;
      String arg1, arg2;
      Date temp1, temp2;
      while (again)
      {
         for (int index = 0; index < personCount-1; index++)
         {  
            arg1 = people[index].getName();
            arg2 = people[index+1].getName();
            if (0 < arg1.compareTo(arg2))
            {
               temp = people[index];
               people[index] = people[index+1];
               people[index+1] = temp;
               again = false;
            }
         }
         if (!again)
            again = true;
         else
            again = false;
      }
      fileOutput.println("\r\nDatabase Printout, sorted by name");
      for (int index = 0; index < personCount; index++)
      {
         fileOutput.println(people[index]);
      }
         //The staff, sorted by date, with its own header
      int staffCount = 0;
      int count = 0;
      again = true;
      for (int index = 0; index <= personCount; index++)
      {
         if (people[index] instanceof Staff)
            staffCount++;
      }
      Person[] printOut = new Person[staffCount];
      for (int index = 0; index <= personCount; index++)
      {
         if (people[index] instanceof Staff)
         {
            printOut[count] = people[index];
            count++;
         }
      }
      while (again)
      {
         for (int index = 0; index < staffCount-1; index++)
         {
            temp1 = printOut[index].getDate();
            temp2 = printOut[index+1].getDate();
            if (0 <  temp1.compareTo(temp2))
            {
               temp = printOut[index];
               printOut[index] = printOut[index+1];
               printOut[index+1] = temp;
               again = false;
            }
         }
         if (!again)
            again = true;
         else
            again = false;
      }
      fileOutput.println("\r\nStaff Printout, sorted by hire date");
      for (int index = 0; index < printOut.length; index++)
      {
         fileOutput.println(printOut[index]);
      }
         //Print The employees, sorted by salary, with its own header
      count = 0;
      again = true;
      int employeeCount = 0;
      for (int index = 0; index <= personCount; index++)
      {
         if (people[index] instanceof Employee)
            employeeCount++;
      }
      printOut = new Person[employeeCount];
      for (int index = 0; index <= personCount; index++)
      {
         if (people[index] instanceof Employee)
         {
            printOut[count] = people[index];
            count++;
         }
      }
      while (again)
      {
         for (int index = 0; index < employeeCount-1; index++)
         {
            if (printOut[index].getSalary() > printOut[index+1].getSalary())
            {
               temp = printOut[index];
               printOut[index] = printOut[index+1];
               printOut[index+1] = temp;
               again = false;
            }
         }
         if (!again)
            again = true;
         else
            again = false;
      }
      fileOutput.println("\r\nEmployee Printout, sorted by salary");
      for (int index = 0; index < printOut.length; index++)
      {
         fileOutput.println(printOut[index]);
      }
         //Print The graduate students sorted by address, with its own header
      count = 0;
      again = true;
      int gradCount = 0;
      for (int index = 0; index <= personCount; index++)
      {
         if (people[index] instanceof GraduateStudent)
            gradCount++;
      }
      printOut = new Person[gradCount];
      for (int index = 0; index <= personCount; index++)
      {
         if (people[index] instanceof GraduateStudent)
         {
            printOut[count] = people[index];
            count++;
         }
      }
      while (again)
      {
         for (int index = 0; index < gradCount-1; index++)
         {
            arg1 = printOut[index].getAddress();
            arg2 = printOut[index+1].getAddress();
            if (0 < arg1.compareTo(arg2))
            {
               temp = printOut[index];
               printOut[index] = printOut[index+1];
               printOut[index+1] = temp;
               again = false;
            }
         }
         if (!again)
            again = true;
         else
            again = false;
      }
      fileOutput.println("\r\nGraduate Student Printout, sorted by address");
      for (int index = 0; index < printOut.length; index++)
      {
         fileOutput.println(printOut[index]);
      }
   }
}
/*
Algorithm of main(String[] args)
 
        String name, address, phoneNumber, email, office, dateStr, title, officeHours, supervisor, status, assistantType
        Date date
        int dateMM, dateDD, dateYYYY
        float salary
        people <- Person[0..99]
        personCount <- 0
        File inputFile <- new File(args[0])
        Scanner fileScan <- new Scanner(inputFile)
        File outFile <- new File(args[1])
        PrintStream fileOutput <- new PrintStream(outFile)
        fileOutput.println("Project 6\r\nTBSpeed - CS 101-02\r\nThe next lines contain an echo of the input file")
        lineTotal <- 0
        while (fileScan.hasNextLine()) 
            fileOutput.println("\t" + fileScan.nextLine())
            lineTotal++
        inputFile <- new File(args[0])
        fileScan <- new Scanner(inputFile)
        fileScan.useDelimiter("#|\\n")
        String wastedInput
        while (personCount < lineTotal) 
            switch (fileScan.next()) :
                case "u":
                    name <- fileScan.next()
                    address <- fileScan.next()
                    phoneNumber <- fileScan.next()
                    email <- fileScan.next()
                    dateStr <- fileScan.next()
                    dateMM <- Integer.parseInt(dateStr.substring(0, 2))
                    dateDD <- Integer.parseInt(dateStr.substring(3, 5))
                    dateYYYY <- Integer.parseInt(dateStr.substring(6, 10))
                    date <- new Date(dateMM, dateDD, dateYYYY)
                    status <- fileScan.next()
                    people[personCount] <- new UndergraduateStudent(name, address, phoneNumber, email, date, status)
                    personCount++
                    if (personCount <= 19)
                        wastedInput <- fileScan.next()
                    break
                case "g":
                    name <- fileScan.next()
                    address <- fileScan.next()
                    phoneNumber <- fileScan.next()
                    email <- fileScan.next()
                    dateStr <- fileScan.next()
                    dateMM <- Integer.parseInt(dateStr.substring(0, 2))
                    dateDD <- Integer.parseInt(dateStr.substring(3, 5))
                    dateYYYY <- Integer.parseInt(dateStr.substring(6, 10))
                    date <- new Date(dateMM, dateDD, dateYYYY)
                    status <- fileScan.next()
                    assistantType <- fileScan.next()
                    people[personCount] <- new GraduateStudent(name, address, phoneNumber, email, date, status, assistantType)
                    personCount++
                    if (personCount <= 19)
                        wastedInput <- fileScan.next()
                    break
                case "f":
                    name <- fileScan.next()
                    address <- fileScan.next()
                    phoneNumber <- fileScan.next()
                    email <- fileScan.next()
                    office <- fileScan.next()
                    salary <- fileScan.nextFloat()
                    dateStr <- fileScan.next()
                    dateMM <- Integer.parseInt(dateStr.substring(0, 2))
                    dateDD <- Integer.parseInt(dateStr.substring(3, 5))
                    dateYYYY <- Integer.parseInt(dateStr.substring(6, 10))
                    date <- new Date(dateMM, dateDD, dateYYYY)
                    title <- fileScan.next()
                    officeHours <- fileScan.next()
                    people[personCount] <- new Faculty(name, address, phoneNumber, email, office, salary, date, title, officeHours)
                    personCount++
                    if (personCount <= 19)
                        wastedInput <- fileScan.next()
                    break
                case "s":
                    name <- fileScan.next()
                    address <- fileScan.next()
                    title <- fileScan.next()
                    phoneNumber <- fileScan.next()
                    email <- fileScan.next()
                    office <- fileScan.next()
                    salary <- fileScan.nextFloat()
                    dateStr <- fileScan.next()
                    dateMM <- Integer.parseInt(dateStr.substring(0, 2))
                    dateDD <- Integer.parseInt(dateStr.substring(3, 5))
                    dateYYYY <- Integer.parseInt(dateStr.substring(6, 10))
                    date <- new Date(dateMM, dateDD, dateYYYY)
                    supervisor <- fileScan.next()
                    people[personCount] <- new Staff(name, address, title, phoneNumber, email, office, salary, date, supervisor)
                    personCount++
                    if (personCount <= 19)
                        wastedInput <- fileScan.next()
                    break
        Person temp
        again <- true
        String arg1, arg2
        Date temp1, temp2
        while (again) 
            for index <- 0 loop till index < personCount - 1 by index++ each step 
                arg1 <- people[index].getName()
                arg2 <- people[index + 1].getName()
                if (-1 == arg1.compareTo(arg2))
                    temp <- people[index]
                    people[index] <- people[index + 1]
                    people[index + 1] <- temp
                    again <- false
            if (NOT again)
                again <- true
            else
                again <- false
        fileOutput.println("\r\nDatabase Printout, sorted by name")
        for index <- 0 loop till index < personCount by index++ each step 
            fileOutput.println(people[index])
        staffCount <- 0
        count <- 0
        again <- true
        for index <- 0 loop till index <= personCount by index++ each step 
            if (people[index] instanceof Staff)
                staffCount++
        Person[] printOut <- Person[0..staffCount-1]
        for index <- 0 loop till index <= personCount by index++ each step 
            if (people[index] instanceof Staff)
                printOut[count] <- people[index]
                count++
        while (again) 
            for index <- 0 loop till index < staffCount - 1 by index++ each step 
                temp1 <- printOut[index].getDate()
                temp2 <- printOut[index + 1].getDate()
                if (-1 == temp1.compareTo(temp2))
                    temp <- printOut[index]
                    printOut[index] <- printOut[index + 1]
                    printOut[index + 1] <- temp
                    again <- false
            if (NOT again)
                again <- true
            else
                again <- false
        fileOutput.println("\r\nStaff Printout, sorted by hire date")
        for index <- 0 loop till index < printOut.length by index++ each step 
            fileOutput.println(printOut[index])
        count <- 0
        again <- true
        employeeCount <- 0
        for index <- 0 loop till index <= personCount by index++ each step 
            if (people[index] instanceof Employee)
                employeeCount++
        printOut <- Person[0..employeeCount-1]
        for index <- 0 loop till index <= personCount by index++ each step 
            if (people[index] instanceof Employee)
                printOut[count] <- people[index]
                count++
        while (again) 
            for index <- 0 loop till index < employeeCount - 1 by index++ each step 
                if (printOut[index].getSalary() < printOut[index + 1].getSalary())
                    temp <- printOut[index]
                    printOut[index] <- printOut[index + 1]
                    printOut[index + 1] <- temp
                    again <- false
            if (NOT again)
                again <- true
            else
                again <- false
        fileOutput.println("\r\nEmployee Printout, sorted by salary")
        for index <- 0 loop till index < printOut.length by index++ each step 
            fileOutput.println(printOut[index])
        count <- 0
        again <- true
        gradCount <- 0
        for index <- 0 loop till index <= personCount by index++ each step 
            if (people[index] instanceof GraduateStudent)
                gradCount++
        printOut <- Person[0..gradCount-1]
        for index <- 0 loop till index <= personCount by index++ each step 
            if (people[index] instanceof GraduateStudent)
                printOut[count] <- people[index]
                count++
        while (again) 
            for index <- 0 loop till index < gradCount - 1 by index++ each step 
                if (printOut[index].getAddress() < printOut[index + 1].getAddress())
                    temp <- printOut[index]
                    printOut[index] <- printOut[index + 1]
                    printOut[index + 1] <- temp
                    again <- false
            if (NOT again)
                again <- true
            else
                again <- false
        fileOutput.println("\r\nGraduate Student Printout, sorted by address")
        for index <- 0 loop till index < printOut.length by index++ each step 
            fileOutput.println(printOut[index])

Data Table for Database		
Variable	Type	   Use
__________________________________________		
people	Person[]	Track the people
		
Data Table for main(String[] args)		
Variable	      Type	      Use
__________________________________________		
args	         String[]	   unused
name	         String	   pass input to the object constructors
address	      String	   pass input to the object constructors
phoneNumber	   String	   pass input to the object constructors
email	         String	   pass input to the object constructors
office	      String	   pass input to the object constructors
dateStr	      String	   pass input to the object constructors
title	         String	   pass input to the object constructors
officeHours	   String	   pass input to the object constructors
supervisor	   String	   pass input to the object constructors
status   	   String	   pass input to the object constructors
assistantType	String	   pass input to the object constructors
date	         Date	      pass input to the object constructors
dateMM	      int	      pass input to the object constructors
dateDD	      int	      pass input to the object constructors
dateYYYY	      int	      pass input to the object constructors
salary	      float	      pass input to the object constructors
personCount	   int	      Count how many person objects exist
inputFile	   File	      track the input file
fileScan	      Scanner	   read the input file
outFile	      File	      track the output file
fileOutput	   PrintStream	print to the output file
lineTotal	   int	      count the number of lines of input
wastedInput	   String   	clear the input for next line
temp	         Person   	hold a temperary person
again	         boolean  	track weather or not to go again in the while loop
arg1	         String	   hold arg1 for sorting
arg2	         String	   hold arg2 for sorting
temp1	         Date	      hold a temp date for sorting
temp2	         Date	      hold a temp date for sorting
staffCount	   int	      Count the number of staff
count	         int	      count the number of iterations
index	         int	      count the number of loops
printOut	      Person[]	   hold the array to be printed
employeeCount	int	      hold the number of employees
gradCount	   int	      hold the number of grad students
*/
