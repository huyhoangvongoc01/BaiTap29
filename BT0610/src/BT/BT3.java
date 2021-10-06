package BT;
import java.util.Scanner;
public class BT3 {
	private static Scanner scanner = new Scanner(System.in);
	   public static void main(String[] args) {
	       System.out.print("Nhập số nguyên dương n = ");
	       int n = scanner.nextInt();
	       System.out.println(n + " số đầu tiên của dãy số fibonacci: ");
	       for (int i = 0; i < n; i++) {
	           System.out.print(fibonacci(i) + " ");
	       }
	   }
	   public static int fibonacci(int n) {
	       if (n < 0) {
	           return -1;
	       } else if (n == 0 || n == 1) {
	           return n;
	       } else {
	           return fibonacci(n - 1) + fibonacci(n - 2);
	       }
	   }
}
