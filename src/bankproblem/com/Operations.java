package bankproblem.com;

public class Operations extends BankProblem {

    Operations(String n, int acc, double ba){
        super(n, acc, ba);
    }
    public double withdraw(double amount){
        if(amount< getBalance()){
            System.out.println("The balance is less than the amount to be withdrawn\n");
            return 0;
        }
        else{
            double bal = (getBalance()- amount);
            System.out.printf("%f withdrawn successfully.\n The remaining "
                    + "balance is %f\n", amount, bal );
            return bal;

        }

    }
    public  void deposit(double amount){

        double bal = (getBalance() +  amount);
        System.out.printf("%f depoist successfully.\n The "
                + "balance is %f\n", amount, bal );
    }
}
