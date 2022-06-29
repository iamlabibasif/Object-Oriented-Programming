import java.util.Scanner;

 public class HealthProfile
    {
      private String FirstName;
      private String LastName;
      private int DateOfBirth;
      private String MonthOfBirth;
      private int YearOfBirth;
      private double HeightInInches;
      private double WeightInPounds;

      public HealthProfile (String FirstName, String LastName, int DateOfBirth, String MonthOfBirth, int YearOfBirth, double HeightInInches, double WeightInPounds)
      {
          this.FirstName = FirstName;
          this.LastName = LastName;
          this.DateOfBirth = DateOfBirth;
          this.MonthOfBirth = MonthOfBirth;
          this.YearOfBirth = YearOfBirth;
          this.HeightInInches = HeightInInches;
          this.WeightInPounds = WeightInPounds;
      }

      public String getFirstName()
      {
          return this.FirstName;
      }

      public String getLastName()
      {
          return this.LastName;
      }

      public int getDateOfBirth()
      {
          return this.DateOfBirth;
      }

      public String getMonthOfBirth()
      {
          return this.MonthOfBirth;
      }

      public int getYearOfBirth()
      {
          return this.YearOfBirth;
      }

      public double getHeightInInches()
      {
            return this.HeightInInches;
      }

      public double getWeightInPounds()
      {
          return this.WeightInPounds;
      }

      public void setFirstName(String Name)
      {
          this.FirstName = Name;
      }

      public void setLastName(String Name)
      {
            this.LastName = Name;
      }

      public void setDateOfBirth(int DOB)
      {
          this.DateOfBirth = DOB;
      }

      public void setMonthOfBirth(String Month)
      {
         this.MonthOfBirth = Month;
      }

      public void YearOfBirth(int Year)
      {
         this.YearOfBirth = Year;
      }

      public void setHeightInInches(int Height)
      {
          this.HeightInInches = Height;
      }

      public void WeightInPounds(int Weight)
      {
          this.WeightInPounds = Weight;
      }

      public int Age()
      {
          int Count = 0;

          for(int i = this.YearOfBirth+1; i <= 2020; i++ )
          {
              Count++;
          }

          if (this.MonthOfBirth.equals("February") || this.MonthOfBirth.equals("January"))
          {
               Count++;
          }

          if (this.MonthOfBirth.equals("March") && this.DateOfBirth <= 10)
          {
              Count++;
          }
            return Count;
      }

      public double BMI()
      {
          double value = (this.WeightInPounds * 703) / (double) (this.HeightInInches * getHeightInInches());

          if (value < 18.5)
          {
              System.out.print("According to the results, the patient is UNDERWEIGHT because the BMI is ");
          }

          if (value > 18.5 && value < 24.9)
          {
              System.out.print("According to the results, the patient is NORMAL WEIGHT because the BMI is ");
          }

          if (value > 25 && value < 29.9)
          {
              System.out.print("According to the results, the patient is OVER WEIGHT because the BMI is ");
          }

          if (value > 30)
          {
              System.out.print("According to the results, the patient is OBESE because the BMI is ");
          }

          return value;
      }

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the First Name of the patient: ");
        String First1 = sc.next();

        System.out.println("Type the Last Name of the patient: ");
        String Last1 = sc.next();

        System.out.println("Type the Date on which the patient was born: ");
        int Date1 = sc.nextInt();

        System.out.println("Type the Month in which the patient was born: ");
        String Month1 = sc.next();

        System.out.println("Type the Year in which the patient was born: ");
        int Year1 = sc.nextInt();

        System.out.println("Type the Height in inches of the patient: ");
        double Height1 = sc.nextDouble();

        System.out.println("Type the Weight in pounds of the patient: ");
        double Weight1 = sc.nextDouble();

        HealthProfile Patient1 = new HealthProfile (First1, Last1, Date1, Month1, Year1, Height1, Weight1);

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        System.out.println("The First name of the patient is: " + Patient1.getFirstName());
        System.out.println("The Last name of the patient is: " + Patient1.getLastName());
        System.out.println("Hence, FULL NAME: " + Patient1.getFirstName() + " " + Patient1.getLastName());
        System.out.println("The Date of Birth of the patient is: " + Patient1.getDateOfBirth() + " " + Patient1.getMonthOfBirth() + ", " + Patient1.getYearOfBirth());
        System.out.println("The Weight in Pounds of the patient is: " + Patient1.getWeightInPounds());
        System.out.println("The Height in Inches of the patient is: " + Patient1.getHeightInInches());
        System.out.println("The Age of the patient is: " + Patient1.Age() + " " + "years");
        System.out.println(Patient1.BMI());
    }
 }
