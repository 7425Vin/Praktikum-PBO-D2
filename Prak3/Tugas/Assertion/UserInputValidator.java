/**
 * File     : UserInputValidator.java    09/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas UserInputValidator untuk memvalidasi inputan dari user
 */
public class UserInputValidator {
  public static void validateUsername(String username) {
    // Assertion untuk memenuhi persyaratan username
    assert username.matches("[a-zA-Z][a-zA-Z0-9_]{4,19}") : "Invalid username format";
  }

  public static void validateEmail(String email) {
    // Assertion untuk memenuhi persyaratan email
    assert email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") : "Invalid email format";
  }

  public static void validateAge(int age) {
    // Assertion untuk memenuhi persyaratan usia
    assert age >= 17 && age <= 99 : "Invalid age range";
  }
}