package BaiTap;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    System.out.print("Nhập số lượng phần tử cho mảng: ");
	    n = sc.nextInt();
	    int numberArr[] = new int[n];
	    for (int i = 0; i < n; i++) {
	      System.out.print("Nhập phần tử thứ " + i + ": ");
	      numberArr[i] = sc.nextInt();
	    }
	    double max = numberArr[0];
	    for (double num: numberArr) {
	      if(max < num)
	        max = num;
	    }
	    System.out.printf("Số lớn nhất trong mảng là: %.0f", max);
	}
}
