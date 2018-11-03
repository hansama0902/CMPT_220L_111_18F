package Lab8;

import java.util.Scanner;

public class Bank {

public static void main(String[] args) {

Scanner s = new Scanner(System.in);

SavingsAccount savings;

CheckingAccount checking;

System.out.println("\nEnter the ID: ");

int id = s.nextInt();

System.out.println("\nEnter the initial balance: ");

double bal = s.nextDouble();

Account account = new Account(id, bal);

System.out.print("After Creation, " );

account.toString(account.getBalance());

System.out.println("\nEnter the annual interest rate: ");

double rate = s.nextDouble();

account.setAnnualInterestRate(rate);

System.out.println("\nEnter the withdrawal amount: ");

double draw = s.nextDouble();

account.withdraw(draw);

System.out.print("After Withdrawal of $" + draw + ", " );

account.toString(account.getBalance());

System.out.println("\nEnter the deposit amount: ");

double dep = s.nextDouble();

account.deposit(dep);

System.out.println("After Deposit of $" + dep + ", " );

account.toString(account.getBalance());

System.out.println("\nEnter the initial balance for checking account: ");

double balCheck = s.nextDouble();

checking = new CheckingAccount(balCheck);

System.out.println("\nEnter the withdrawal amount for checking account: ");

double drawCheck = s.nextDouble();

checking.check(drawCheck);

System.out.println("\nEnter the deposit amount for checking account: ");

double depCheck = s.nextDouble();

checking.deposit(depCheck);

System.out.println("\nEnter the initial balance for savings account: ");

double balSave = s.nextDouble();

savings = new SavingsAccount(balSave);

System.out.println("\nEnter the withdrawal amount for savings account: ");

double drawSave = s.nextDouble();

savings.draw(drawSave);

System.out.println("\nEnter the deposit amount for savings account: ");

double depSave = s.nextDouble();

savings.deposit(depSave);

System.out.println("Balance is " + account.getBalance());

System.out.println("Monthly interest is " + account.getMonthlyInterest());

System.out.println("This account was created at " + account.getDateCreated());

System.out.println("Balance of checking account is " + checking.getBalance());

System.out.println("Balance of savings account is " + savings.getBalance()); //taking inputs from user and printing all required parameters

}

}
