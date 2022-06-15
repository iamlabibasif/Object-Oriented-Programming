//NAME: Umme Labib Asif
//TITLE: Lab 6, Question 1


public class OOPLab6 {
    public static void main (String[] args)
    {
        Student FirstStudent = new Student();
        FirstStudent.SetName("Labib");
        FirstStudent.SetMarks(50);
        Student SecondStudent = new Student();
        SecondStudent.SetName("Labib2");
        SecondStudent.SetMarks(100);
        System.out.println("Name of the student is " + FirstStudent.GetName());
        System.out.println("The marks of the student is " + FirstStudent.GetMarks());
        System.out.println("Name of the student is " + SecondStudent.GetName());
        System.out.println("The marks of the student is " + SecondStudent.GetMarks());
        System.out.println("Total number of the student is " + Student.GetTotalStudents());
    }

    public static class Student
    {
        private String Name;
        private int Marks;
        private static int totalStudents;

        public Student ()
        {
            totalStudents+=1;
        }
        public void SetName (String name)
        {
            this.Name = name;
        }
        public String GetName ()
        {
            return this.Name;
        }
        public void SetMarks (int marks)
        {
            this.Marks = marks;
        }
        public int GetMarks ()
        {
            return this.Marks;
        }
        public static int GetTotalStudents ()
        {
            return totalStudents;
        }
    }
}
