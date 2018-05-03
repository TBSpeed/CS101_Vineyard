public class Date
{
   public int dateMM, dateDD, dateYYYY;
   public Date(int dateMMIn, int dateDDIn, int dateYYYYIn)
   {
      dateMM = dateMMIn;
      dateDD = dateDDIn;
      dateYYYY = dateYYYYIn;
   }
   public int getMM()
   {
      return dateMM;
   }
   public int getDD()
   {
      return dateDD;
   }
   public int getYYYY()
   {
      return dateYYYY;
   }
   public String toString()
   {
      String pong = "";
      switch (dateMM) 
      {
         case 1:  pong = "January";
            break;
         case 2:  pong = "February";
            break;
         case 3:  pong = "March";
            break;
         case 4:  pong = "April";
            break;
         case 5:  pong = "May";
            break;
         case 6:  pong = "June";
            break;
         case 7:  pong = "July";
            break;
         case 8:  pong = "August";
            break;
         case 9:  pong = "September";
            break;
         case 10: pong = "October";
            break;
         case 11: pong = "November";
            break;
         case 12: pong = "December";
            break;
      }
      pong = pong + " " + dateDD + ", " + dateYYYY;
      return pong;
   }
   public int compareTo(Date otherDate)
   {
      // return 1 if first date is first, -1 if second date is first, 0 if dates are equal, and -5 if error
      if (dateYYYY > otherDate.getYYYY())
         return 1;
      else if (dateYYYY < otherDate.getYYYY())
         return -1;
      else
      {
         if (dateMM > otherDate.getMM())
            return 1;
         else if (dateMM < otherDate.getMM())
            return -1;
         else
         {
            if (dateDD > otherDate.getDD())
               return 1;
            else if (dateDD < otherDate.getDD())
               return -1;
            else
               return -5;
         }
      }
   }
}
/*
Algorithm for toString() 
        String pong <- ""
        switch (dateMM) :
            case 1:
                pong <- "January"
                break
            case 2:
                pong <- "February"
                break
            case 3:
                pong <- "March"
                break
            case 4:
                pong <- "April"
                break
            case 5:
                pong <- "May"
                break
            case 6:
                pong <- "June"
                break
            case 7:
                pong <- "July"
                break
            case 8:
                pong <- "August"
                break
            case 9:
                pong <- "September"
                break
            case 10:
                pong <- "October"
                break
            case 11:
                pong <- "November"
                break
            case 12:
                pong <- "December"
                break
        pong <- pong + " " + dateDD + ", " + dateYYYY
        return pong

    Algorithm for compareTo(Date otherDate) 
        if (dateYYYY > otherDate.getYYYY())
            return 1
        else if (dateYYYY < otherDate.getYYYY())
            return -1
        else
            if (dateMM > otherDate.getMM())
                return 1
            else if (dateMM < otherDate.getMM())
                return -1
            else
                if (dateDD > otherDate.getDD())
                    return 1
                else if (dateDD < otherDate.getDD())
                    return -1
                else
                    return -5


Data Table for Date		
Variable	Type	Use
__________________________________________		
dateMM	int	Hold the month of date
dateDD	int	Hold the day of date
dateYYYY	int	Hold the year of date
		
Data Table for Date(int dateMMIn, int dateDDIn, int dateYYYYIn)		
Variable	   Type	Use
__________________________________________		
dateMMIn	   int	Hold the month of date comeing in
dateDDIn	   int	Hold the day of date comeing in
dateYYYYIn	int	Hold the year of date comeing in
		
Data Table for getMM()		
Variable	Type	Use
__________________________________________		
		
Data Table for getDD()		
Variable	Type	Use
__________________________________________		
		
Data Table for getYYYY()		
Variable	Type	Use
__________________________________________		
		
Data Table for toString()		
Variable	Type	Use
__________________________________________		
pong	String	Hold the return value
		
Data Table for compareTo(Date otherDate)		
Variable	   Type	Use
__________________________________________		
otherDate	Date	Hold the other date being tested
*/