package bankproblem.com;

public class BankProblem {

    private String name;
    private int accountNumber;
    private double balance;
    public BankProblem(){

    }
    public BankProblem(String n, int acc, double ba){
        setBankDetails(n, acc, ba);
    }
    public void setBankDetails(String n, int acc, double ba){
        name = n;
        accountNumber = acc;
        balance = ba;
    }
    public String getName(){
        return name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
}

