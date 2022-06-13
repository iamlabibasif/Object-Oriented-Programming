//NAME: Umme Labib Asif
//TITLE: Lab 5, Question 1


import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class OOPLab5 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in); //Declaring scanner

        System.out.println("SETTING ACCOUNT DETAILS IN THE FOLLOWING STEPS BELOW: ");
        System.out.println("Enter name of account Title below:");
        String AccountTitle = sc.next();
        System.out.println("Enter Account Type below:");
        String AccountType = sc.next();
        System.out.println("Enter name of Account Balance below:");
        double AccountBalance = sc.nextDouble();

        BankAccount MyAccount = new BankAccount(AccountTitle, AccountType, AccountBalance);

        System.out.println("To Deposit money in the Bank Account, press 2");
        System.out.println("To Withdraw money from the Bank Account, press 3");
        System.out.println("To View Bank Account Details, press 4");
        System.out.println("To EXIT application, press 5");

        int N = sc.nextInt();

        while (N < 5)
        {
            System.out.println(); //line churwana
            switch(N)
            {
                case 2:
                {
                    MyAccount.DepositAmount(500);
                    break;
                }

                case 3:
                {
                    MyAccount.withdrawAmount(400);
                    break;
                }

                case 4:
                {
                    System.out.println(MyAccount.GetAccountBalance());
                    System.out.println(MyAccount.GetAccountTitle());
                    System.out.println(MyAccount.GetAccountType());
                    break;
                }
            }
            System.out.println("To Assign Account Title, and Account Type of the Bank Account, press 1");
            System.out.println("To Deposit money in the Bank Account, press 2");
            System.out.println("To Withdraw money from the Bank Account, press 3");
            System.out.println("To View Bank Account Details, press 4");
            System.out.println("To EXIT application, press 5");

            System.out.println();
            N = sc.nextInt();
        }
        System.out.println("Exiting");
    }
    public static class BankAccount
    {
        private String AccountTitle;
        private String AccountType;
        private double AccountBalance;

        public BankAccount (String AccountTitle, String AccountType, double AccountBalance)
        {
            this.AccountBalance = AccountBalance;
            this.AccountTitle = AccountTitle;
            this.AccountType = AccountType;
        }
        public String GetAccountTitle()
        {
            return "The Account Title is: " + this.AccountTitle;
        }
        public String GetAccountType()
        {
            return "The Account Type is: " + this.AccountType;
        }
        public Double GetAccountBalance()
        {
            return this.AccountBalance;
        }

        public void withdrawAmount (int input)
        {
            if (AccountBalance < input)
            {
                System.out.println("Error: The amount withdrawn is greater than the current balance");
            }
            else
            {
                AccountBalance = AccountBalance - input;
                System.out.println("The amount withdrawn is " + input);
            }
        }
        public void DepositAmount (int input)
        {
            AccountBalance = AccountBalance + input;
            System.out.println("The Account balnace is " + AccountBalance);
        }
    }
}
