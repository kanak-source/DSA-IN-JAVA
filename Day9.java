// Problem: A secret system stores code names in forward order. To display them in mirror format, you must transform the given code name so that its characters appear in the opposite order.

// Input:
// - Single line: a lowercase string containing only alphabetic characters (no spaces)

// Output:
// - Print the transformed code name after applying the mirror operation

// Example:
// Input:
// hello

// Output:
// olleh

// Explanation: The first character moves to the last position, the second to the second-last, and so on until the entire string is mirrored
import java.util.*;
class solution{
    public String reverseString(String s){
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
public class Day9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code name: ");
        String s = sc.nextLine();
        solution sol = new solution();
        System.out.println(sol.reverseString(s));
        sc.close();
    }
}
