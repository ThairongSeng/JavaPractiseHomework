package InterfaceDemo;

public class SavingAccount implements Account  {
    private double balance;
    private float interestRate;

    SavingAccount(){
        balance=0;
        interestRate=50;
    }
    @Override
    public void Withdraw(double amount) {
        if(amount<=balance)
        {
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance!!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return balance*(interestRate/100);
    }
}
