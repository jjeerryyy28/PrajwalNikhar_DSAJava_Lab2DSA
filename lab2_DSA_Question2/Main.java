package lab2_DSA_Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //user defined datatype
        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();

        int[] denominations = new int[size]; //n-1
        System.out.println("Enter the currency denominations value: ");

        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }
        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();
        scanner.close();

        MergeSort sort = new MergeSort(denominations);
        sort.makePayment(amount);
    }
}