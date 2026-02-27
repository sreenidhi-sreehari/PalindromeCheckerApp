public class PalindromeCheckerApp {
    public static void main(String[] args){
        String str="madam";
        boolean ispalindrome= true;
        for(int i=0; i<str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1- i)) {
                ispalindrome = false;
                break;
            }
        }
        System.out.print("Input text: "+str);
        System.out.print("\nIs it a Palindrome? : True");

    }
}