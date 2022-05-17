package com.company;

import javax.naming.InsufficientResourcesException;

 class AccountRas {
    String owner, AccountNumber;
    int Balance;

    public AccountRas(String owner, String AccountNumber, int Balance) {
        this.owner = owner;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public void Transfer(int amount) throws InsufficientResourcesException {
        if (Balance > amount) {
            Balance -= amount;
        } else {
            throw new InsufficientResourcesException ("Insufficient Funds");
        }
    }

}

