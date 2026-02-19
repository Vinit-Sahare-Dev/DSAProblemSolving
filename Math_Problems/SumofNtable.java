package Math_Problems;

public class SumofNtable {
  public static void main(String[] args) {
    int n = 10;
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += n * i;
    }
    System.out.println("The sum of the first 10 multiples of " + n + " is: " + sum);
  }  
}
