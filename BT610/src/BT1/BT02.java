package BT1;
import java.util.Scanner;
public class BT02 {
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
         
        int rows = sc.nextInt();         
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }       
        sc.close();
    }
}
