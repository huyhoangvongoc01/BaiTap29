package BT1;
import java.util.Scanner;
public class BT03 {
	public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        num = sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Tổng các số tự nhiên từ 1 đến "+ num +" là: "+sum);
    }
}
