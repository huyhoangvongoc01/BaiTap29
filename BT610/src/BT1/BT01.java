package BT1;
import java.util.Scanner;
public class BT01 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = scanner.nextInt();

        System.out.println("\nNatural numbers from 1 to " + num);

        int i = 1;

        while (i <= num) {

            System.out.print(i + " ");
            i++;
        }

    }
}
