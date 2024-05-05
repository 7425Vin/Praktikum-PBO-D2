/**
 * File     : BankApp.java    09/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 */ 
public class BankApp {
    public static void main(String[] args) {
      BankAccount account = new BankAccount(700.0);
  
      // Skenario saldo mencukupi
      try {
        account.withdraw(400.0);
        System.out.println("Saldo saat ini: $" + account.getBalance());
      } catch (InsufficientFundsException e) {
        System.out.println("Error: " + e.getMessage());
      }
  
      // Skenario saldo tidak mencukupi
      try {
        account.withdraw(500.0);
        System.out.println("Saldo saat ini: $" + account.getBalance());
      } catch (InsufficientFundsException e) {
        System.out.println("Error: " + e.getMessage());
      }
    }
}
  