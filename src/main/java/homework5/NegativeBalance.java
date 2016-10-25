package homework5;

import java.util.Scanner;

/**
 NegativeBalanceException

 Create BankAccount class which contains:
 an instance variable named userBalance of type double
 constructor that sets the userBalance
 method named withdraw which takes a parameter of type double representing the amount to withdraw.
 and throw a custom NegativeBalanceException if the required amount to withdraw is greater than the userBalance.

 Note! the new custom NegativeBalanceException should include a meaningful error message.

 Create a program and test BankAccount userBalance & withdraw flows.
 */
public class NegativeBalance {
    private double userBalance;

    private NegativeBalance(double userBalance) {
        this.userBalance = userBalance;
    }

    private static double setInitialUserBalance() {
        Scanner scInitialUserBalance = new Scanner(System.in);

        return scInitialUserBalance.nextDouble();
    }

    private void withdraw() throws NegativeBalanceException {
        System.out.println("Enter amount you wanna withdraw from your account: ");
        Scanner scAmountToWithdraw = new Scanner(System.in);
        double amountToWithdraw = scAmountToWithdraw.nextDouble();
        System.out.println();

        if (amountToWithdraw > userBalance) {
            throw new NegativeBalanceException("The amount you trying to withdraw is greater that the current BALANCE");
        }
        userBalance -= amountToWithdraw;
        System.out.println("Success! Your current BALANCE is " + userBalance);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Please enter BALANCE of your imaginary bank account: ");
        NegativeBalance negativeBalance = new NegativeBalance(setInitialUserBalance());
        System.out.println();

        while (negativeBalance.userBalance > 0) {
            try {
                negativeBalance.withdraw();
            } catch (NegativeBalanceException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
    }
}