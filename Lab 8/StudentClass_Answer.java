//NAME: Umme Labib Asif
//ERP: 21749

import java.util.Scanner;

public class OOPLab8
{
    public static void main (String[] args)
    {
        Gradebook [] a;
        a = new Gradebook[3]; //array of 3 elements of class Gradebook

        a [0] = new Gradebook("CS", 5);

        for(int i = 0; i<5; i++)
        {
            a[0].setMarks(i,34); //every student has 34 marks //ask the user
        }
    }
    public static class Gradebook
    {
        private String CourseName;
        private int[] StudentMarks;

        public Gradebook (String CourseName, int StudentMarks)
        {
            this.CourseName = CourseName;
            this.StudentMarks = new int[StudentMarks]; //size of the array
        }
        public String getCourseName ()
        {
            return this.CourseName;
        }
        public void setMarks (int input, int input2)
        {
            StudentMarks[input] = input2;
        }
        public int getMarks (int input)
        {
            return StudentMarks[input];
        }
    }
}