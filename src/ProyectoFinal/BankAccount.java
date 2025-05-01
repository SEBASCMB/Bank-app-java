package ProyectoFinal;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {

  private String accountHolder;
  private double balance;

  private static final NumberFormat currencyFormat;

  static {

    currencyFormat = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
    currencyFormat.setMaximumFractionDigits(0);

  }

  public BankAccount(String accountHolder, double initialBalance) {

    this.accountHolder = accountHolder;
    this.balance = initialBalance;

  }

  public void deposit(double amount) {

    if (!(amount > 0)) {
      System.out.println("Deposit amount must be positive.");
      return;
    }

    balance += amount;
    System.out.println("✅Deposited: " + currencyFormat.format(amount));
    System.out.println("💵New balance: " + currencyFormat.format(balance));

  }

  public void withdraw(double amount) {

    if (!(amount > 0)) {
      System.out.println("❌Withdrawal amount must be positive.");
      return;
    }

    if (!(amount <= balance)) {
      System.out.println("❌Insufficient funds.");
      return;
    }

    balance -= amount;
    System.out.println("✅Withdrawn: " + currencyFormat.format(amount));
    System.out.println("💵New balance: " + currencyFormat.format(balance));

  }

  public void displayBalance() {

    System.out.println("\n===============================");
    System.out.println("👤 Account holder: " + accountHolder);
    System.out.println("💵 Current balance: " + currencyFormat.format(balance));
    System.out.println("===============================\n");

  }

}
