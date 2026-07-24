// Problem: Read a string and check if it is a palindrome using two-pointer comparison.

// Input:
// - Single line: string s

// Output:
// - Print YES if palindrome, otherwise NO

// Example:
// Input:
// level

// Output:
// YES

// Explanation: String reads same forwards and backwards
import java.util.*;
public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}