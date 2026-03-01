package Math_Problems;
/*
 * Given a number N, your task is to calculate and print the sum of the table of N.
Sample test case 1:
Input:
N = 10
ouput: 55 * 10 = 550
550
Sample test case 2:
Input:
N = 68 N * (1-10) -> 55 * 68 = 3740
ouput:
3740
 */

public class SumofNtable {
  public static void main(String[] args) {
    int n = 10;
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += n * i;
    }
    System.out.println(sum);
  }  
}
