package lab2_DSA_Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the transaction array: ");
        int n = scanner.nextInt();
        Transaction[] transactions = new Transaction[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter value of transaction %d: ", i + 1);
            int value = scanner.nextInt();
            transactions[i] = new Transaction(value);
        }

        System.out.print("Enter the total number of targets that need to be achieved: ");
        int m = scanner.nextInt();
        Target[] targets = new Target[m];
        for (int i = 0; i < m; i++) {
            System.out.printf("Enter the value of target %d: ", i + 1);
            int value = scanner.nextInt();
            targets[i] = new Target(value);
        }

        PayMoney payMoney = new PayMoney(transactions, targets);
        for (Target target : targets) {
            int result = payMoney.findTransaction(target);
            if (result == -1) {
                System.out.println("Target not achieved");
            } else {
                System.out.printf("Target achieved after %d transactions\n", result);
            }
        }
    }
}
