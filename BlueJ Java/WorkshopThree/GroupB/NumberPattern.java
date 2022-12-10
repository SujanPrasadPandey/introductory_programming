public class NumberPattern {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      // Print leading spaces
      for (int j = 0; j < 4 - i; j++) {
        System.out.print(" ");
      }

      // Print left half of the pattern
      for (int j = i; j >= 0; j--) {
        System.out.print(j + 1);
      }

      // Print right half of the pattern
      for (int j = 1; j <= i; j++) {
        System.out.print(j + 1);
      }

      System.out.println(); // Move to the next line
    }
  }
}
