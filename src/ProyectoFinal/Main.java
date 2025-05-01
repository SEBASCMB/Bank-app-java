package ProyectoFinal;

public class Main {

  public static void main(String[] args) {

    BankAccount account = new BankAccount("Sebastian", 500_000);
    BankApp app = new BankApp(account);
    app.start();

  }

}
