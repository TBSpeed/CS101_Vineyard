public class numbers {

	public static void main(String[] args) {
		int bs = ((5+(7*5))/(6+(15/7)))*(((((8-3)/4)*5)*6)/((3+6)-5)/2);
      
		System.out.println(bs);
      
      
      //mixed types
      byte a = 127;
      byte c = 13;
      //byte d = a + c; result is a compiler error
      byte d = (byte)(a + c); //cast to a byte
      
      System.out.println(
      5 - 2.0 / 2 + "hello" + 17 + 16/20 + 8 % 4
      );
      }
}      