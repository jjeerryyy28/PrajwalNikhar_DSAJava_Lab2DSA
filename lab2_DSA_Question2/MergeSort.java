package lab2_DSA_Question2;

public class MergeSort {
    private int[] denominations;
    public MergeSort(int[] denominations) {
        this.denominations = denominations;
        // Sort the denominations in descending order
        mergeSort(0, denominations.length - 1);
    }

    public void makePayment(int amount) {
        // Make the payment using the highest denominations first
        int i = 0;
        while (amount > 0 && i < denominations.length) {
            int notes = amount / denominations[i];
            if (notes > 0) {
                System.out.println(denominations[i] + ": " + notes);
                amount -= notes * denominations[i];
            }
            i++;
        }

        if (amount > 0) {
            System.out.println("Denomination not possible");
        }
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(left, middle);
            mergeSort(middle + 1, right);
            merge(left, middle, right);
        }
    }

    private void merge(int left, int middle, int right) {
        int n1 = middle - left + 1; //left part
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = denominations[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = denominations[middle + 1 + i];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] > rightArray[j]) {
                denominations[k] = leftArray[i];
                i++;
            } else {
                denominations[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            denominations[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            denominations[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
