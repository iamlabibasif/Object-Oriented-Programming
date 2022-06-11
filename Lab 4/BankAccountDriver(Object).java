public class BankAccountDriver {
    public static void main (String[] args)
    {
        BankAccount MyAccount = new BankAccount();
        MyAccount.setDetails("Labib", "000000", "Current");
        MyAccount.DepositAmount(10000);
        MyAccount.withdrawAmount(3000);
        MyAccount.checkBalance();
        MyAccount.viewDetails();
    }
}
