public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount kiranAccount=new BankAccount(1000);

        kiranAccount.withdraw(500);
        kiranAccount.withdraw(400);
        System.out.println("Balance is $"+kiranAccount.getBalance());
        kiranAccount.addInterest(10);
        System.out.println("Balance after interest is $"+kiranAccount.getBalance());
    }
}
