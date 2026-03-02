package Strings;
import java.util.Scanner;
public class reverseaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()) {
            String s = sc.next();
            StringBuilder result = new StringBuilder();
            for(int i = s.length()-1; i >= 0; i--) {
                result.append(s.charAt(i));
            }
            System.out.println(result);
        }
    }
}