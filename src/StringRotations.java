import java.util.Scanner;

public class StringRotations {

  public static void main(String[] args) throws Exception {
    // check if one String is a rotation of the other.

    Scanner scan = new Scanner(System.in);
    System.out.println("please enter a String");
    String input = scan.nextLine();

    System.out.println("please enter a rotation of the String");
    String rotation = scan.nextLine();


      if (checkRotation(input, rotation)) {
        System.out.println("[" + rotation + "] is a rotation of [" + input + "].");
      } else {
        System.out.println("[" + rotation + "] is not a rotation of [" + input + "].");
      }
      scan.close();


  }

  public static boolean checkRotation(String input, String rotation) {
    if (input.length() != rotation.length()) {
      return false;
    }
    String concatenated = input + input;

    if (concatenated.indexOf(rotation) != -1) {
      return true;
    }
    return false;
  }

}
