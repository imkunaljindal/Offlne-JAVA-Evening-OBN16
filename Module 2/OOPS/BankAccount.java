public class BankAccount {

    private long accountNo;
    int balance;

    public long getAccountNo() {
        return this.accountNo;
    }

    int getBalance() {
        return this.balance;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    void printBalance() {
        System.out.println("your balance is "+this.balance);
    }
}
