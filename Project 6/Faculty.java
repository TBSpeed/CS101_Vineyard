public class Faculty extends Employee
{
   public String name, address, phoneNumber, email, office, title, officeHours;
   public Date hireDate;
   public float salary;
   public Faculty(String nameIn, String addressIn, String phoneIn, String emailIn, String officeIn, float salaryIn, Date hireDateIn, String titleIn, String officeHoursIn)
   {
      name = nameIn;
      address = addressIn;
      phoneNumber = phoneIn;
      email = emailIn;
      office = officeIn;
      salary = salaryIn;
      hireDate = hireDateIn;
      title = titleIn;
      officeHours = officeHoursIn;
   }
   public String toString()
   {
      String pong = "Faculty";
      pong = pong + "\r\n\tname: " + name;
      pong = pong + "\r\n\taddress: " + address;
      pong = pong + "\r\n\tphone number: " + phoneNumber;
      pong = pong + "\r\n\te-mail address: " + email;
      pong = pong + "\r\n\toffice: " + office;
      pong = pong + "\r\n\tsalary: " + salary;
      pong = pong + "\r\n\thire date: " + hireDate;
      pong = pong + "\r\n\ttitle: " + title;
      pong = pong + "\r\n\toffice hours: " + officeHours;
      return pong;
   }
   public Date getDate()
   {
      return hireDate;
   }
   public float getSalary()
   {
      return salary;
   }
   public String getName()
   {
      return name;
   }
}
/*
 Algorithm for toString() 
        String pong <- "Faculty"
        pong <- pong + "\r\n\tname: " + name
        pong <- pong + "\r\n\taddress: " + address
        pong <- pong + "\r\n\tphone number: " + phoneNumber
        pong <- pong + "\r\n\te-mail address: " + email
        pong <- pong + "\r\n\toffice: " + office
        pong <- pong + "\r\n\tsalary: " + salary
        pong <- pong + "\r\n\thire date: " + hireDate
        pong <- pong + "\r\n\ttitle: " + title
        pong <- pong + "\r\n\toffice hours: " + officeHours
        return pong


Data Table for Faculty		
Variable	   Type	   Use
__________________________________________		
name	      String	Hold a faculty object's data
address	   String	Hold a faculty object's data
phoneNumber	String	Hold a faculty object's data
email	      String	Hold a faculty object's data
office   	String	Hold a faculty object's data
title	      String	Hold a faculty object's data
officeHours	String	Hold a faculty object's data
hireDate 	Date	   Hold a faculty object's data
salary	   float	   Hold a faculty object's data
		
Data Table for Faculty(String nameIn, String addressIn, String phoneIn, String emailIn, String officeIn, float salaryIn, Date hireDateIn, String titleIn, String officeHoursIn)		
Variable	      Type	   Use
__________________________________________		
nameIn	      String	Initalise a new object
addressIn   	String	Initalise a new object
phoneNumberIn	String	Initalise a new object
emailIn	      String	Initalise a new object
officeIn	      String	Initalise a new object
titleIn	      String	Initalise a new object
officeHoursIn	String	Initalise a new object
hireDateIn  	Date	   Initalise a new object
salaryIn	      float	   Initalise a new object
		
Data Table for toString()		
Variable	Type	   Use
__________________________________________		
pong	   String	Hold the return value
		
Data Table for getDate()		
Variable	Type	Use
__________________________________________		
		
Data Table for getSalary()		
Variable	Type	Use
__________________________________________		
		
Data Table for getName()		
Variable	Type	Use
__________________________________________		
*/