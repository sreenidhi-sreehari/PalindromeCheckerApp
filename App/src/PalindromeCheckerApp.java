import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);

                // Taking input from user
                System.out.println("Enter a string to check if it is a palindrome:");
                String originalString = scanner.nextLine();

                String reversedString = "";

                // Reversing the string using for loop
                for (int i = originalString.length() - 1; i >= 0; i--) {
                    reversedString = reversedString + originalString.charAt(i);
                }

                // Comparing original and reversed string using equals()
                if (originalString.equals(reversedString)) {
                    System.out.println("The given string is a Palindrome.");
                } else {
                    System.out.println("The given string is NOT a Palindrome.");
                }

                scanner.close();
            }
        }