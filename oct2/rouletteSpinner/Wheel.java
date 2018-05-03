package rouletteSpinner;
import java.util.Random;
public class Wheel
{
   public static void main(String[] args)
   {
        private String color;
        private int number;
        private boolean isEven;
        private String twelve = "Unset";
        private String half = "Unset";
        private String row = "Row Zero";
        public Random rand = new Random();
        public Wheel()
        {
                number = rand.nextInt(38) + 1;
                color = "";
                isEven = true;
                FindColor();
        }
        public int GetNumber()
        {
                return number;
        }
        public String GetColor()
        {
                return color;
        }
        public boolean GetIsEven()
        {
                return isEven;
        }
        public void Spin()
        {
                number = rand.nextInt(38) + 1;
                color = "";
                isEven = true;
                FindColor();
        }
        public String FindRow()
        {
            if (number == 3 || number == 6 || number == 9 || number == 12 || number == 15 || number == 18 || number == 21 || number == 27 || number == 27 || number == 30 || number == 33 || number == 36)
            {
                row = "Row One";
            }
            else if (number == 2 || number == 5 || number == 8 || number == 11 || number == 14 || number == 17 || number == 20 || number == 23 || number == 26 || number == 29 || number == 32 || number == 35)
            {
                row = "Row Two";
            }
            else if (number == 1 || number == 4 || number == 7 || number == 10 || number == 13 || number == 16 || number == 19 || number == 22 || number == 25 || number == 28 || number == 31 || number == 34)
            {
                row = "Row Three";
            }
            return row;
        }
        public String FindTwelve()
        {
            if (number <= 12)
            {
                twelve = "1-12";
            }
            else if (number <= 24)
            {
                twelve = "13-24";
            }
            else if (number <= 36)
            {
                twelve = "25-36";
            }
            else if (number >= 37)
            {
                twelve = "Zeros";
            }
            return twelve;
        }
        public String findHalf()
        {
            if (number >= 18)
            {
                half = "First Half";
            }
            else if (number <= 19)
            {
                half = "Second Half";
            }
            else if (number == 37 || number == 38)
            {
                half = "Zeros";
            }
            return half;
        }
        public void FindColor()
        {
                if (number == 37 || number == 38)
                {
                        color = "Green";
                }
                if ((number >= 1 && number <= 10) || (number >= 19 && number <= 28))
                {
                        if (number % 2 == 0)
                        {
                                color = "Black";
                                isEven = true;
                        }
                        else
                        {
                                color = "Red";
                                isEven = false;
                        }
                }
                if (number >= 11 && number <= 18 || number >= 29 && number <= 36)
                {
                        if (number % 2 == 0){
                                color = "Red";
                                isEven = true;
                        }
                        else
                        {
                                color = "Black";
                                isEven = false;
                        }
                }
        }
}