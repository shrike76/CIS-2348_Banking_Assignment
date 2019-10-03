import java.io.*;
import java.util.Scanner;
public class bankingassignment {
    public static void main(String[] args) throws IOException {
        double balance = 1000;
        int i=1;
        Scanner input = new Scanner(System.in);
        FileWriter fwriter = new FileWriter("Bank.txt", true);
        File file = new File("Bank.txt");
        PrintWriter pwriter = new PrintWriter(fwriter);
        pwriter.println("Beginning Balance: $"+balance+"\n");
        pwriter.flush();
        System.out.println("Welcome to CIS-2348 Banking System!");
        while (true) {
            Scanner freader = new Scanner(file);
            System.out.println("Enter your Option in a number: 1. Display balance 2. Deposit amount 3. Withdraw amount 4. Exit");
            int num = input.nextInt();
            int n=1;
            if (num == 1) {
                while (freader.hasNextLine()) {
                    System.out.println(freader.nextLine());
                }
            } else if (num == 2) {
                while(n==1) {
                    System.out.println("Enter amount to deposit: ");
                    double dep = input.nextDouble();
                    balance = balance + dep;
                    System.out.println("$" + dep + " has been deposited into your account. Your new balance is $" + balance);
                    pwriter.printf(i + "    " + "Deposit" + "\t$" + dep + "\t$" + balance + "\n");
                    pwriter.flush();
                    i++;
                    System.out.println("Press 1 to make another deposit, or 2 to exit to main menu");
                    n = input.nextInt();
                }
            } else if (num == 3) {
                System.out.println("Enter amount to withdraw: ");
                double dep = input.nextDouble();
                if (dep>balance){
                    System.out.println("Cannot withdraw more than the balance");
                }
                else {
                    balance = balance - dep;
                    System.out.println(balance);
                    pwriter.printf(i + "    " + "Withdraw" + "\t$" + dep + "\t$" + balance + "\n");
                    pwriter.flush();
                    i++;
                }
            } else if (num==4){
                System.out.println("Thank you for using CIS-2348 Banking System!");
                break;
            }
            else {
                System.out.println("Error, Please input an appropriate value");
            }
        }
    }
}
