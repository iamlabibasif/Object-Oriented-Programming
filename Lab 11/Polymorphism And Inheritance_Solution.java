//NAME: Umme Labib Asif
//ERP: 21749

import java.util.Scanner;

public class OOPLab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student objects[] = new Student[5];

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Please type 1 for Undergraduate student and 2 for Graduate student: ");
            int input = sc.nextInt();

            if (input == 1) {
                System.out.println("Please type the name of the student number " + (i + 1) + ":");
                String name = sc.next();
                objects[i] = new UndergraduateStudent(name);
            }
            if (input == 2) {
                System.out.println("Please type the name of the students number " + (i + 1) + ":");
                String name = sc.next();
                objects[i] = new GraduateStudent(name);
            }
        }
        for (int j = 0; j < objects.length; j++) {
            System.out.println("Please type the scores of the student number " + (j + 1) + ":");
            int input = sc.nextInt();

            objects[j].setTestScore(input);
            objects[j].computeGrade();
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        for(int k = 0; k<objects.length; k++)
        {
            System.out.println("The name of student number " + (k+1) + " is: " + objects[k].getName());
            System.out.println("The grade of student number " + (k+1) + " is: " + objects[k].getGrade());
            System.out.println("The score of student number " + (k+1) + " is: " + objects[k].testScore);
            System.out.println();
        }

        /* System.out.println("The name of the first student is: " + objects[0].getName());
        System.out.println("The grade of the first student is: " + objects[0].getGrade());
        System.out.println("The score of the first student is: " + objects[0].testScore);

        System.out.println("The name of the second student is: " + objects[1].getName());
        System.out.println("The grade of the second student is: " + objects[1].getGrade());
        System.out.println("The score of the second student is: " + objects[1].testScore);

        System.out.println("The name of the third student is: " + objects[2].getName());
        System.out.println("The grade of the third student is: " + objects[2].getGrade());
        System.out.println("The score of the third student is: " + objects[2].testScore);

        System.out.println("The name of the forth student is: " + objects[3].getName());
        System.out.println("The grade of the forth student is: " + objects[3].getGrade());
        System.out.println("The score of the forth student is: " + objects[3].testScore);

        System.out.println("The name of the fifth student is: " + objects[4].getName());
        System.out.println("The grade of the fifth student is: " + objects[4].getGrade());
        System.out.println("The score of the forth student is: " + objects[4].testScore); */ //Thats an alternative way
    }

    public static class Student
    {
        private String name;
        protected int testScore;
        protected String grade;

        public Student(String name)
        {
            this.name = name;
            //this.testScore = testScore;
           // this.grade = grade;
        }

        public String getName ()
        {
            return this.name;
        }
        public void setTestScore (int score)
        {
            this.testScore = score;
        }
        public String getGrade ()
        {
            return this.grade;
        }
        public void computeGrade ()
        {

        }
    }

    public static class UndergraduateStudent extends Student
    {
        public UndergraduateStudent(String name) {
            super(name);
        }
        public void computeGrade ()
        {
            if (testScore >= 60) this.grade = "PASS";
            else this.grade = "FAIL";
        }
    }

    public static class GraduateStudent extends Student
    {
        public GraduateStudent(String name)
        {
            super(name);
        }
        public void computeGrade ()
        {
            if (testScore >= 70) this.grade = "PASS";
            else this.grade = "FAIL";
        }
    }
}
