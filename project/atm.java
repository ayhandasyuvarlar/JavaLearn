import java.util.Scanner;

/*
@author alfonso
 */
public class atm {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        String userName, password;
        int right = 3, select, withdraw, deposit, balance = 3000;

        while (right > 0) {
            System.out.print("Enter your username: ");
            userName = sc.nextLine();
            System.out.print("Enter your password: ");
            password = sc.nextLine();

            if ((userName.equals("Example") || userName.equals("Example")) && (password.equals("1453"))) {
                System.out.println("Welcome to Example Bank.");
                do {
                    System.out.println("withdraw -> 1\nDeposit -> 2\nBalance inquiry -> 3\nlog out -> 4");
                    System.out.print("Please choose the you want to do action: ");
                    select = sc.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Enter how much you want to withdraw: ");
                            withdraw = sc.nextInt();
                            if (balance < withdraw) {
                                System.out.println("Not enough balance. ");
                            } else {
                                balance -= withdraw;
                            }
                        case 2:
                            System.out.print("Enter how much you want to deposit: ");
                            deposit = sc.nextInt();
                            balance += deposit;
                        case 3:
                            System.out.println("Your balance = " + balance);
                    }
                } while (select != 4);
                System.out.println("See you soon...");
                break;
            } else {
                System.out.println("Incorrect username or password.");
                right--;
                if (right == 0) {
                    System.out.print("Your account is blocked.Please contact your customer advisor.");
                } else {
                    System.out.println("Your remain enter right: " + right);
                }
            }
        }
    }
}
