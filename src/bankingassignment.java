import java.io.File;
import java.io.*;
import java.util.Scanner;
public class bankingassignment {
    public static void main(String[] args) throws IOException {
        double balance = 1000;
        int i=1;
        Scanner input = new Scanner(System.in);
        File file = new File("Bank.txt");
        PrintWriter pwriter = new PrintWriter(file);
        PrintWriter dwriter = new PrintWriter(file);
        pwriter.println("Current Balance: $"+balance);
        pwriter.close();
        System.out.println("Welcome to CIS-2348 Banking System!");
        while (true) {
            Scanner freader = new Scanner(file);
            System.out.println("Enter your Option in a number: 1. Display balance 2. Deposit amount 3. Withdraw amount");
            int num = input.nextInt();
            if (num == 1) {
                while (freader.hasNextLine()) {
                    System.out.println(freader.nextLine());
                }
            } else if (num == 2) {
                System.out.println("Enter amount to deposit: ");
                double dep = input.nextDouble();
                balance=balance+dep;
                System.out.println(balance);
                dwriter.printf(i+"    "+"Deposit"+"    $"+dep+"    $"+balance);
                dwriter.close();
                i++;
            } else if (num == 3) {

            } else {
                System.out.println("Error, Please input an appropriate value");
                break;
            }
        }
    }
}
