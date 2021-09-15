package Cacbaitap;

import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args) {
		int number1, number2;
		System.out.println("Nhap vao 2 so:");
		Scanner sc = new Scanner(System.in);
		number1 = sc.nextInt();
		number2 = sc.nextInt();
	    if(number1 >= number2)
	    	System.out.println( +number1 + "-" +number2 + " Dung");
	    else
	    	System.out.println( +number1 + "-" +number2 + " Sai");
	}
}
