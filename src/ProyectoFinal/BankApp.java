package ProyectoFinal;

import java.util.Scanner;

public class BankApp {

  private BankAccount account;
  private Scanner scanner;

  public BankApp(BankAccount account) {

    this.account = account;
    this.scanner = new Scanner(System.in);

  }

  public void start() {

    int option;

    do {

      displayMenu();
      option = scanner.nextInt();
      processOption(option);

    } while (option != 4);

  }

  private void displayMenu() {

    System.out.println("=====================================");
    System.out.println("         🌟 Welcome to the Bank App 🌟");
    System.out.println("=====================================");
    System.out.println("1️⃣  Deposit");
    System.out.println("2️⃣  Withdraw");
    System.out.println("3️⃣  Display Balance");
    System.out.println("4️⃣  Exit");
    System.out.println("=====================================");
    System.out.print("👉 Choose an option: ");

  }

  private int getUserOption() {
    return scanner.nextInt();
  }

  private void handleDeposit() {

    System.out.println("\n💰 Enter amount to deposit:");
    double amount = scanner.nextDouble();
    account.deposit(amount);
    System.out.println("✅ Deposit completed!\n");

  }

  private void handleWithdraw() {

    System.out.println("\n💸 Enter amount to withdraw:");
    double amount = scanner.nextDouble();
    account.withdraw(amount);
    System.out.println("✅ Withdrawal completed!\n");

  }

  private void processOption(int option) {

    switch (option) {

      case 1: {
        handleDeposit();
        break;
      }
      case 2: {
        handleWithdraw();
        break;
      }
      case 3: {
        account.displayBalance();
        break;
      }
      case 4: {
        System.out.println("\n👋 Thank you for using the Bank App. Goodbye!");
        break;
      }
      default: {
        System.out.println("\n❌ Invalid option. Please try again.\n");
        break;
      }

    }

  }

}
