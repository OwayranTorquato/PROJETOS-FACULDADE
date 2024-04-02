package Palindromo;

public class PalindromeCheck {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        
        // Handle cases where the length of the palindrome is odd
        // For example, if x = 12321, after the loop x = 12 and revertedNumber = 123
        // We need to check if x == revertedNumber / 10
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
    


