package BT10;
import java.util.Scanner;
public class BT10 {
	public static void main(String[] args) {
        String  username = "HuyHoang" ;
        int	password = 2021;
        String guessUser;
        int	   guessPass;
        Scanner scanner = new Scanner(System.in);
         
       
            System.out.println("Nhập vào username: ");
            guessUser = scanner.nextLine();
            System.out.println("Nhập vào password: ");
            guessPass = scanner.nextInt();
         if((username == guessUser) || (password == guessPass)) {
        	 System.out.println("Nhập đúng. ");
         }
         else
        System.out.println("Nhập sai. ");
    }

}
