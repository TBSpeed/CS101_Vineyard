public class UndergraduateStudent extends Student
{
   public String name, address, phoneNumber, email, status;
   public Date birthDate;
   public UndergraduateStudent(String nameIn, String addressIn, String phoneIn, String emailIn, Date birthDateIn, String statusIn)
   {
      name = nameIn;
      address = addressIn;
      phoneNumber = phoneIn;
      email = emailIn;
      birthDate = birthDateIn;
      status = statusIn;
   }
   public String toString()
   {
      String pong = "Undergraduate Student";
      pong = pong + "\r\n\tname: " + name;
      pong = pong + "\r\n\taddress: " + address;
      pong = pong + "\r\n\tphone number: " + phoneNumber;
      pong = pong + "\r\n\te-mail address: " + email;
      pong = pong + "\r\n\tbirth date: " + birthDate;
      pong = pong + "\r\n\tstatus: " + status;
      return pong;
   }
   public Date getDate()
   {
      return birthDate;
   }
   public String getName()
   {
      return name;
   }
}
/*
Algorithm for toString() 
        String pong <- "Undergraduate Student"
        pong <- pong + "\r\n\tname: " + name
        pong <- pong + "\r\n\taddress: " + address
        pong <- pong + "\r\n\tphone number: " + phoneNumber
        pong <- pong + "\r\n\te-mail address: " + email
        pong <- pong + "\r\n\tbirth date: " + birthDate
        pong <- pong + "\r\n\tstatus: " + status
        return pong



Data Table for UndergraduateStudent		
Variable	      Type	   Use
__________________________________________		
name	         String	Hold a graduate student object's data
address     	String	Hold a graduate student object's data
phoneNumber 	String	Hold a graduate student object's data
email	         String	Hold a graduate student object's data
status	      String	Hold a graduate student object's data
birthDate   	Date  	Hold a graduate student object's data
		
Data Table for UndergraduateStudent(String nameIn, String addressIn, String phoneIn, String emailIn, Date birthDateIn, String statusIn)		
Variable    	Type	   Use
__________________________________________		
nameIn	      String	Initalise a new object
addressIn   	String	Initalise a new object
phoneNumberIn	String	Initalise a new object
emailIn	      String	Initalise a new object
statusIn	      String	Initalise a new object
birthDateIn 	Date	   Initalise a new object
		
Data Table for toString()		
Variable	      Type  	Use
__________________________________________		
pong	         String	Hold the return value
		
Data Table for getDate()		
Variable	Type	Use
__________________________________________		
		
Data Table for getName()		
Variable	Type	Use
__________________________________________		
*/