
import java.util.Scanner;
public class ChuVi {
	public static void main(String[] args) {
		double r;
		double pi=3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap r: ");
        r = scanner.nextDouble();
        Double chuvi= 2*r*pi;
        System.out.println("Chu vi : "+chuvi);

	}
}
