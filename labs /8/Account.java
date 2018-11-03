package Lab8;
import java.util.Date;

import java.util.Scanner; //importing Java libraries

class Account {

private int id;

double balance;

private static double annualInterestRate;

private Date dateCreated;

public Account() {

dateCreated = new Date();

}

public Account(int newId, double newBalance) {

id = newId;

balance = newBalance;

dateCreated = new Date();

}

public int getId() {

return this.id;

}

public double getBalance() {

return balance;

}

public static double getAnnualInterestRate() {

return annualInterestRate;

}

public void setId(int newId) {

id = newId;

}

public void setBalance(double newBalance) {

balance = newBalance;

}

public static void setAnnualInterestRate(double newAnnualInterestRate) {

annualInterestRate = newAnnualInterestRate;

}

public double getMonthlyInterest() {

return balance * (annualInterestRate / 1200);

}

public Date getDateCreated() {

return dateCreated;

}

public void withdraw(double amount) {

balance -= amount;

}

public void deposit(double amount) {

balance += amount;

}

public void toString(double b) {

System.out.printf("The current balance is " + "$" + "%4.2f" + "%n", b); //declaring all member functions for Account class

}

}

class SavingsAccount extends Account {

double overdraftLimit = 0, balance;

public SavingsAccount(double newBalance) {

balance = newBalance;

}

public void draw(double w) {

if (balance - w < overdraftLimit) {

String temp = toString();

System.out.println(temp);

}

else

balance -= w;

}

public String toString() {

return "Insufficient Funds!";

}

public void deposit(double amount) {

balance += amount;

}

public double getBalance() {

return balance; //declaring all member functions for SavingsAccount class

}

}

class CheckingAccount extends Account {

double overDraft = -1000, balance;

public CheckingAccount(double newBalance) {

balance = newBalance;

}

public void check(double w) {

if (balance - w < overDraft) {

String temp = toString();

System.out.println(temp);

balance -= 25;

}

else

balance -= w;

}

public String toString() {

return "Failure! Can't overdraft more than $1,000. A $25 " + "overdraft fee will be deducted from your account.";

}

public void deposit(double amount) {

balance += amount;

}

public double getBalance() {

return balance; //declaring all member functions for CheckingAccount class

}

}

