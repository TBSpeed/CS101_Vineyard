public class Stiver
{
   public static void main(String[] args)
   {
   Speaker s = new Speaker("Santa");
   System.out.println(s.speak());
   s = new Grinch("The Fucking Grinch");
   System.out.println(s.speak());
   s = new Superhero("Power Girl");
   System.out.println(s.speak());
   }
   
}
