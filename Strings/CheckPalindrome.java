package Strings;

import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int left = 0, right = s.length() - 1;
        boolean isPalin = true;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                isPalin = false;
                break;
            }
            left++; right--;
        }
        System.out.println(isPalin ? "Yes" : "No");
    }
}