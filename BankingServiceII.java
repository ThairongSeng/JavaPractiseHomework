package InterfaceDemo;

public class BankingServiceII {
    private Account account;

    public BankingServiceII(Account account){
        this.account=account;
    }
    public double showBalance(){
        return account.checkBalance();
    }
    public void withdrawMoney(double amount){
        account.Withdraw(amount);
    }
    public void deposit(double amount){
        account.deposit(amount);
    }
}
