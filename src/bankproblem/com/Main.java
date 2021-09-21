package bankproblem.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the number of customers\n");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Operations [] bank = new Operations[3];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the details of customer "+ (i+1));

            System.out.println("Enter the customer name\n");
            String name = input.next();

            System.out.println("Enter the customer account number\n");
            int number = input.nextInt();

            System.out.println("Enter the initial balance of the customer\n");
            double bal = input.nextDouble();

            bank[i] = new Operations(name, number, bal);
            System.out.println("Enter 1 for deposit\n Enter 2 to withdraw\nEnter 0 to exit\n");
            int choice = input.nextInt();
            if(choice==1){
                System.out.println("Enter amount to deposit\n");
                double amount = input.nextDouble();
                bank[i].deposit(amount);
            }
            else if(choice == 2){
                System.out.println("Enter amount to deposit\n");
                double amount = input.nextDouble();
                bank[i].withdraw(amount);
            }


        }
    }

}

