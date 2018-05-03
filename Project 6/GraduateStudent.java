public class GraduateStudent extends Student
{
   public String name, address, phoneNumber, email, status, assistantType;
   public Date birthDate;
   public GraduateStudent(String nameIn, String addressIn, String phoneIn, String emailIn, Date birthDateIn, String statusIn, String assistantTypeIn)
   {
      name = nameIn;
      address = addressIn;
      phoneNumber = phoneIn;
      email = emailIn;
      birthDate = birthDateIn;
      status = statusIn;
      assistantType = assistantTypeIn;
   }
   public String toString()
   {
      String pong = "Graduate Student";
      pong = pong + "\r\n\tname: " + name;
      pong = pong + "\r\n\taddress: " + address;
      pong = pong + "\r\n\tphone number: " + phoneNumber;
      pong = pong + "\r\n\te-mail address: " + email;
      pong = pong + "\r\n\tbirth date: " + birthDate;
      pong = pong + "\r\n\tstatus: " + status;
      pong = pong + "\r\n\tassistantship type: " + assistantType;
      return pong;
   }
   public Date getDate()
   {
      return birthDate;
   }
   public String getAddress()
   {
      return address;
   }
   public String getName()
   {
      return name;
   }
}
/*
Algorithm for toString() 
        String pong <- "Graduate Student"
        pong <- pong + "\r\n\tname: " + name
        pong <- pong + "\r\n\taddress: " + address
        pong <- pong + "\r\n\tphone number: " + phoneNumber
        pong <- pong + "\r\n\te-mail address: " + email
        pong <- pong + "\r\n\tbirth date: " + birthDate
        pong <- pong + "\r\n\tstatus: " + status
        pong <- pong + "\r\n\tassistantship type: " + assistantType
        return pong



Data Table for GraduateStudent		
Variable	      Type	   Use
__________________________________________		
name	         String	Hold a graduate student object's data
address     	String	Hold a graduate student object's data
phoneNumber 	String	Hold a graduate student object's data
email	         String	Hold a graduate student object's data
status      	String	Hold a graduate student object's data
assistantType	String	Hold a graduate student object's data
birthDate   	Date	   Hold a graduate student object's data
		
Data Table for GraduateStudent(String nameIn, String addressIn, String phoneIn, String emailIn, Date birthDateIn, String statusIn, String assistantTypeIn)		
Variable	            Type	   Use
__________________________________________		
nameIn	            String	Initalise a new object
addressIn         	String	Initalise a new object
phoneNumberIn     	String	Initalise a new object
emailIn	            String	Initalise a new object
statusIn	            String	Initalise a new object
assistantTypeIn   	String	Initalise a new object
birthDateIn	         Date  	Initalise a new object
		
Data Table for toString()		
Variable	Type	Use
__________________________________________		
pong	String	Hold the return value
		
Data Table for getDate()		
Variable	Type	Use
__________________________________________		
		
Data Table for getAddress()		
Variable	   Type	Use
__________________________________________		
addressInt	int	hold the int part of the address
		
Data Table for getName()		
Variable	Type	Use
__________________________________________		
*/