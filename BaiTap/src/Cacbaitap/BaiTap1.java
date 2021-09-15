package Cacbaitap;

import java.util.Scanner;
import java.lang.Math;

public class BaiTap1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = (int)(Math.random() * 30) +0;
		int b = (int)(Math.random() * 30) + a; 
		int c = b - a;
	    System.out.println("Ket qua cua phep toan " + b + "-" + a +" la gi:");
	    System.out.println("Nhap dap an cua ban");
	    int x = input.nextInt();
	    if(x==c)
	    	System.out.println( " Correct");
	    else
	    	System.out.println(" Wrong");
	}
}
