//NAME: Umme Labib Asif

import java.util.Scanner;

public class OOPLab7
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the numerator of the first Instance: ");
        int numerator1 = sc.nextInt();

        System.out.println("Type the denominator of the first Instance: ");
        int denominator1 = sc.nextInt();

        Fraction first = new Fraction();
        first.setDenominator(denominator1);
        first.setNumerator(numerator1);

        System.out.println("Type the numerator of the second Instance: ");
        int numerator2 = sc.nextInt();

        System.out.println("Type the denominator of the second Instance: ");
        int denominator2 = sc.nextInt();

        Fraction second = new Fraction();
        second.setDenominator(denominator2);
        second.setNumerator(numerator2);

        Fraction third = new Fraction();
        third.addFraction(first,second);

        System.out.println("The Numerator of the third instance for the first method is " + third.getNumerator());
        System.out.println("The Denominator of the third instance for the first method is " + third.getDenominator());

        third = first.addFraction(second);

        System.out.println("The Numerator of the third instance for the second method is " + third.getNumerator());
        System.out.println("The Denominator of the third instance for the second method is " + third.getDenominator());
    }

    public static class Fraction
    {
        private int numerator;
        private int denominator;

        public Fraction ()
        {
            numerator = 1;
            denominator = 1;
        }
        public void setNumerator (int input)
        {
            this.numerator = input;
        }
        public int getNumerator ()
        {
            return this.numerator;
        }
        public void setDenominator (int input)
        {
          this.denominator = input;
        }
        public int getDenominator ()
        {
            return this.denominator;
        }
        public void addFraction (Fraction a, Fraction b)
        {
            if(a.getNumerator() == b.getNumerator() && a.getDenominator() == b.getDenominator())
            {
                denominator = a.getDenominator() + b.getDenominator();
                numerator = a.getNumerator() + b.getNumerator();
            }
                else
            {
                int i = b.getDenominator() * a.getNumerator();
                int j = a.getDenominator() * b.getNumerator();

                denominator = a.getDenominator() * b.getDenominator();
                numerator = i + j;
            }
        }
        public Fraction addFraction (Fraction a)
        {
            Fraction c = new Fraction();

            if(a.getNumerator() == this.getNumerator() && a.getDenominator() == this.getDenominator())
            {
                c.setNumerator(this.getNumerator() + a.getNumerator());
                c.setDenominator(this.denominator + a.getDenominator());
            }
            else
            {
                int i = this.getDenominator() * a.getNumerator();
                int j = a.getDenominator() * this.getNumerator();

                c.setDenominator(denominator = a.getDenominator() * this.getDenominator());
                c.setNumerator(numerator = i + j);
            }
            return c;
        }
    }
}
