//NAME: Umme Labib Asif
//ERP: 21749

import java.util.Scanner;

public class OOPLab10
{
    public static void main (String[] args)
    {
        Rectangle myRectangles[ ] = new Rectangle[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the color of the first Instance: ");
        String Color1 = sc.next();

        System.out.println("Type the width of the first Instance: ");
        double width1 = sc.nextDouble();

        System.out.println("Type the length of the first Instance: ");
        double length1 = sc.nextDouble();

        myRectangles[0] = new Rectangle(Color1, length1, width1);

        System.out.println("Type the color of the second Instance: ");
        String Color2 = sc.next();

        System.out.println("Type the width of the second Instance: ");
        double width2 = sc.nextDouble();

        System.out.println("Type the length of the second Instance: ");
        double length2 = sc.nextDouble();

        myRectangles[1] = new Rectangle(Color2, length2, width2);

        System.out.println("Type the color of the third Instance: ");
        String Color3 = sc.next();

        System.out.println("Type the width of the third Instance: ");
        double width3 = sc.nextDouble();

        System.out.println("Type the length of the third Instance: ");
        double length3 = sc.nextDouble();

        myRectangles[2] = new Rectangle(Color3, length3, width3);

        System.out.println("The color of the first instance is " + myRectangles[0].getColor());
        System.out.println("The color of the first Paramtere is " + myRectangles[0].getParameter());

        System.out.println("The color of the second instance is " + myRectangles[1].getColor());
        System.out.println("The color of the second Paramtere is " + myRectangles[1].getParameter());

        System.out.println("The color of the second instance is " + myRectangles[2].getColor());
        System.out.println("The color of the second Paramtere is " + myRectangles[2].getParameter());

    }
    public static class Shape
    {
        private String color;

        public Shape (String color)
        {
            this.color = color;
        }
        public String getColor ()
        {
            return this.color;
        }
    }

    public static class Rectangle extends Shape
    {
        private double width;
        private double length;

        public Rectangle(String color, double length, double width)
        {
            super(color);
            this.length = length;
            this.width = width;
        }
        public double getLength()
        {
            return this.length;
        }

        public double getWidth() {
            return width;
        }
        public double getParameter ()
        {
            return ((2*width) + (2*length));
        }
    }
}
