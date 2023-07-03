import madhav.PalindromeChecker;
class TestMadhav {
    public static void main(String[] args) {
        String str = "madam";

        if (PalindromeChecker.isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
