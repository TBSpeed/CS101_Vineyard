public class StringName
{
   public static void main(String [] args)
   {
   String fFullName = "Ray Thomas";
   int under = fFullName.indexOf(" ");
   String fName = fFullName.substring(0, under);
   String lName = fFullName.substring(under+1);
   String lFullName = lName + " " + fName;
   System.out.println(lFullName);
   }
}