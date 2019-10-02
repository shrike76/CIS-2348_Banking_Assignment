import java.io.*;
import java.util.Scanner;
public class bankingassignment {
    public static void main(String[] args) throws IOException {
        double balance = 1000;
        Scanner input = new Scanner(System.in);
        FileWriter fwriter = new FileWriter("Bank.txt");
        PrintWriter pwriter = new PrintWriter(fwriter);
        pwriter.printf("Current Balance: $"+balance);
        pwriter.close();
        System.out.println("Welcome to CIS-2348 Banking System!");
        while (true) {
            System.out.println("Enter your Option in a number: 1. Display balance 2. Deposit amount 3. Withdraw amount");
            int num = input.nextInt();
            if (num == 1) {

            } else if (num == 2) {

            } else if (num == 3) {

            } else {
                System.out.println("Error, Please input an appropriate value");
                break;
            }
        }
    }
}
