public class BankAccount
{
    private String AccountTitle;
    private String AccountNumber;
    private String AccountType;
    private double AccountBalance;

    public void setDetails(String Title, String Number, String Type)
        {
            AccountTitle = Title;
            AccountNumber = Number;
            AccountType = Type;
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
        public void checkBalance ()
        {
            System.out.println("The current Balance is " + AccountBalance);
        }
        public void viewDetails ()
        {
            System.out.println("The Account Title is " + AccountTitle);
            System.out.println("The Account Number is " + AccountNumber);
            System.out.println("The Account Type is " + AccountType);
        }
    }


