package com.encapsulation.bank;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        System.out.println("Initial balance: " + account.getBalance() + "TL");

        account.deposit(500);
        System.out.println("Current balance: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Final balance: " + account.getBalance());
    }
}
