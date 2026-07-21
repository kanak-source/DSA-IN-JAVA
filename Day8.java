// Problem: Given integers a and b, compute a^b using recursion without using pow() function.

// Input:
// - Two space-separated integers a and b

// Output:
// - Print a raised to power b

// Example:
// Input:
// 2 5

// Output:
// 32

// Explanation: 2^5 = 2 * 2 * 2 * 2 * 2 = 32
import java.util.*;
class Solution{
     public int power(int a, int b) {
        if (b == 0) {
            return 1; // Base case: any number raised to the power of 0 is 1
        } else {
            return a * power(a, b - 1); // Recursive case
        }
    }
}
public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer a:");
        int a = sc.nextInt();
        System.out.println("Enter the integer b:");
        int b = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.power(a, b));
        sc.close();
    }
}