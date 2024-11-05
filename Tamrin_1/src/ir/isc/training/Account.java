package ir.isc.training;



import java.time.LocalDateTime;

class Account  {
    String name;
    String branch;
    LocalDateTime opened;
    double balance;
    Boolean isblock;


    public Account(String name, LocalDateTime opened, double balance , Boolean isblock) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
        this.isblock = false;
    }

    
    public String getName() {
        return name;
    }

    public LocalDateTime getOpened() {
        return opened;
    }

    public double getBalance() {
        return this.balance;
    }
    public String getBranch() {
        return this.branch;
    }
    public void blockAccount() {
        isblock = true;
        System.out.println("حساب بلاک شد.");
    }

    public void unblockAccount() {
        isblock = false;
    }
}