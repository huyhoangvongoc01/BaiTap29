package BaiTap;

import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args)
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số mà bạn muốn kiểm tra:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" là dương");
        }
        else if(number < 0)
        {
            System.out.println(number+" là âm");
        }
        
    }
}
