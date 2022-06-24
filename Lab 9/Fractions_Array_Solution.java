//NAME: Umme Labib Asif

import java.util.Scanner;

public class OOPLab9 {
    public static void main(String[] args) {

        Fraction[] F = new Fraction[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the numerator of the first Instance: ");
        int numerator1 = sc.nextInt();

        System.out.println("Type the denominator of the first Instance: ");
        int denominator1 = sc.nextInt();

        F[0] = new Fraction();
        F[0].setDenominator(denominator1);
        F[0].setNumerator(numerator1);

        System.out.println("Type the numerator of the second Instance: ");
        int numerator2 = sc.nextInt();

        System.out.println("Type the denominator of the second Instance: ");
        int denominator2 = sc.nextInt();

        F[1] = new Fraction();
        F[1].setDenominator(denominator2);
        F[1].setNumerator(numerator2);

        F [2] = new Fraction();
        F[2] = F[0].addFraction(F[1]);

        System.out.println("The Numerator of the third instance for the second method is " + F[2].getNumerator());
        System.out.println("The Denominator of the third instance for the second method is " + F[2].getDenominator());

        F[3] = new Fraction();
        F[3] = F[1].subFraction(F[0]);

        System.out.println("The Numerator of the forth instance for the second method is " + F[3].getNumerator());
        System.out.println("The Denominator of the forth instance for the second method is " + F[3].getDenominator());

        F[4] = new Fraction();
        F[4] = F[0].mulFraction(F[1]);

        System.out.println("The Numerator of the fifth instance for the second method is " + F[4].getNumerator());
        System.out.println("The Denominator of the fifth instance for the second method is " + F[4].getDenominator());

    }

    public static class Fraction
    {
        private int numerator;
        private int denominator;

        public Fraction()
        {
            numerator = 1;
            denominator = 1;
        }

        public Fraction(int numerator, int denominator)
        {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public void setNumerator(int input)
        {
            this.numerator = input;
        }

        public int getNumerator()
        {
            return this.numerator;
        }

        public void setDenominator(int input)
        {
            this.denominator = input;
        }

        public int getDenominator()
        {
            return this.denominator;
        }

        public Fraction addFraction(Fraction a)
        {
            Fraction c = new Fraction();
            {
                int i = this.getDenominator() * a.getNumerator();
                int j = a.getDenominator() * this.getNumerator();

                c.setDenominator(a.getDenominator() * this.getDenominator());
                c.setNumerator(i + j);
            }
            return c;
        }

        public Fraction subFraction(Fraction a)
        {
            Fraction c = new Fraction();
            {
                int i = this.getDenominator() * a.getNumerator();
                int j = a.getDenominator() * this.getNumerator();

                c.setDenominator(a.getDenominator() * this.getDenominator());
                c.setNumerator(i - j);
            }
            return c;
        }

        public Fraction mulFraction(Fraction a)
        {
            Fraction c = new Fraction();
            {
                c.setNumerator(this.getNumerator() * a.getNumerator());
                c.setDenominator(a.getDenominator() * this.getDenominator());
            }
            return c;
        }
    }
}