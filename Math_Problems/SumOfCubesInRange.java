package Math_Problems;
/*
 * You are given two integers, a and b. Your task is to calculate and print the sum of cubes of all integers from a to b (both inclusive).
*/
import java.util.Scanner;

public class SumOfCubesInRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;

        for (int i = a; i <= b; i++) {
            total += i * i * i;
        }

        System.out.println(total);
        sc.close();
    }
}

