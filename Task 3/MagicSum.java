//NAME: Umme Labib Asif
//TITLE: Lab 3, Question 2
//QUESTION: Write a program called MagicSum, which prompts user for numbers, and produce the sum of numbers
//containing the digit 8. Your program should use the above methods.

import java.util.Scanner;

public class OOPLab3Q2
{
    public static void main (String[] args)
    {
            Scanner Enter = new Scanner(System.in);
            int sum = 0;
            while (true)
            {
                System.out.print("Enter the integer: ");
                int number = Enter.nextInt();

                if (number == -1) break;
                if (hasEight(number)) sum += number;
            }
            System.out.println("The magic sum is: " + sum);
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