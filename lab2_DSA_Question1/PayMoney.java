package lab2_DSA_Question1;

class PayMoney {
    private Transaction[] transactions;
    private Target[] targets;

    public PayMoney(Transaction[] transactions, Target[] targets) {
        this.transactions = transactions;
        this.targets = targets;
    }

    public int findTransaction(Target target) {
        int total = 0;
        for (int i = 0; i < transactions.length; i++) {
            total += transactions[i].getValue();
            if (total >= target.getValue()) {
                return i + 1;
            }
        }
        return -1;
    }
}
