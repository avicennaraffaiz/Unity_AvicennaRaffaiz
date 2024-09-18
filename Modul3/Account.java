public class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;
    private AccountType accountType;

    public Account(int accountNumber, double balance, Bank bank,
                   AccountType accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

    // getter accountnumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // getter balance
    public double getBalance() {
        return balance;
    }

    // setter balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getter bank
    public Bank getBank() {
        return bank;
    }

    // getter accounttype

    public AccountType getAccountType() {
        return accountType;
    }

    // method deposit
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit berhasil. Saldo: " + this.balance);
        } else {
            System.out.println("Error: Deposit harus lebih dari 0 ");
        }
    }

    // method withdraw
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Penarikan berhasil. Saldo: " + this.balance);
        } else {
            System.out.println("Error: Saldo tidak cukup.");
        }
    }

    // method addInterest
    public void addInterest() {
        double interest = this.balance * (this.bank.getInterestRate() / 100);
        this.balance += interest;
        System.out.println("Bunga ditambah. Saldo: " + this.balance);
    }

    public void showDetail() {
        System.out.println("No. Akun: " + this.accountNumber);
        System.out.println("Saldo: " + this.balance);
        System.out.println("Bank Code: " + this.bank.getCode());
        System.out.println("Tipe Akun: " + this.accountType);
    }
}
