//NAME: Umme Labib Asif
//TITLE: Lab 3, Question 1
//QUESTION: Write a boolean method called hasEight(), which takes an int as input and returns true if the number
//contains the digit 8 (e.g., 18, 808) 

public class OOPLab3Q1
{
    public static void main (String[]args)
    {
        int input = Integer.parseInt(args[0]);
        System.out.print(hasEight(input));
    }
    public static boolean hasEight(int input)
    {
        boolean Result = false;

        while(input>0)
        {
            int x = input % 10;

            if (x == 8)
            {
                Result = true;
                break;
            }
            else
            {
                Result = false;
                input = input/10;
            }
        }
        return Result;
    }
}
