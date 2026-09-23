package samplearrays;

public class BankAccount {

    private String name;
    private double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    private double[] transactions=new double[1000];
    private  int i=0;

    public BankAccount(String name, double  startingBalance){
        this.name=name;
        this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Sorry ! The amount must be positive ");
            return;
        }
        this.currentBalance+=amount;
        transactions[i]=amount;
        i++;
        System.out.println("Name: " + this.name + "\nDeposited amount: " + amount + "\nNew Balance: " + this.currentBalance);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Sorry! The amount must be positive.");
            return;
        }
        if(amount>this.currentBalance ){
            System.out.println("Withdrawal was unsuccessful (You do not have enough money!)");
            return;
        }
        this.currentBalance-=amount;
        transactions[i]=-amount;
        i++;

    }

    public void displayTransactions(){
        for(int j=0;j<this.i;j++){
            System.out.println((j+1)+": "+this.transactions[j]);
        }

    }

    public void displayBalance(){
        System.out.println("Your current balance is: "+this.currentBalance);

    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
