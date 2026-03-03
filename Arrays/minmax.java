package Arrays;

import java.util.Scanner;
public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            int val = sc.nextInt();
            if(val > max) max = val;
            if(val < min) min = val;
        }
        System.out.println(max + " " + min);
    }
}
