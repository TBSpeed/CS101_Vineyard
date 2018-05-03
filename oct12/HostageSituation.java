import javax.swing.*;
import java.text.*;
public class HostageSituation
{
public static void main( String [] args )
{
String name = JOptionPane.showInputDialog(null, "What is your name?");
String age = JOptionPane.showInputDialog(null, "How old are you");
String salary = JOptionPane.showInputDialog(null, "How much do you make in a year?");
JOptionPane.showMessageDialog(null, "Your name is " + name);
int ageTen = Integer.parseInt(age);
ageTen = ageTen + 10;
JOptionPane.showMessageDialog(null, "Your age in 10 years will be  " + ageTen);
double salaryTen = Integer.parseInt(salary);
double salaryTenDiv = salaryTen / 10;
salaryTen = salaryTen + salaryTenDiv;
String format1 = "$##,##0.00";
DecimalFormat def = new DecimalFormat(format1);
String salaryOut = def.format(salaryTen);
JOptionPane.showMessageDialog(null, "Your salary after a 10% rase will be  " + salaryOut);

}

}