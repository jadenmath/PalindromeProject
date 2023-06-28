//*****************************************************************
//  Main.java (Palindrome Project)       Forked by: Jaden Mathew
//
//  This program is a modified version of a Palindrome Program 
//  that not only detects Palindromes, but also makes exceptions  
//  for spaces, punctuation, and changes in uppercase and lowercase.
//*****************************************************************
// Import Scanner 
import java.util.Scanner;

// Setting public class Main
public class Main {
  public static void main(String[] args) {
  // Initializing variables
    String str, another = "y";
    int left, right;

    // Setting up scan for user input
    Scanner scan = new Scanner(System.in);

    // Setup while loop to have program loop if another is "y"
    while(another.equalsIgnoreCase("y"))
    {
      System.out.println("Enter a potential palindrome: ");
      str = scan.nextLine();

      // This line sets str to make user input all lowercase
      str = str.replaceAll("[^A-Za-z]+", "").toLowerCase();

      left = 0;
      right = str.length() - 1;

      // While loop calculates left and right to determine palindrome
      while(str.charAt(left) == str.charAt(right) && left < right)
      {
        left++;
        right--;
      }

      System.out.println();

      // If else used to determine palindrome
      if (left < right)
        System.out.println("That string is NOT a palindrome.");
      else
        System.out.println("That string IS palindrome.");

      // Asks user to loop program again
      System.out.println();
      System.out.println("Test another palindrome (y/n)? ");
      another = scan.nextLine();
    }
  }
}