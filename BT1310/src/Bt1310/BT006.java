package Bt1310;
import java.util.Scanner;
public class BT006 {
	private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int luachon=nhapsonguyen("nhập lựa chọn với 1 là ptb1\nnhập lựa chọn với 2 là ptb2 ");
        if (luachon==1) 
            luachon1();
        else 
            luachon2();
    }
    public static void luachon2() {
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = BT006.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = BT006.scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        BT006.giaiPTBac2(a, b, c);
    }
     public static void luachon1(){
        int a;
        int b;
        a=nhapsonguyen("nhập a: ");
        b=nhapsonguyen("nhập b: ");
        giaipt(a,b);
    }
    public static int nhapsonguyen(String str){
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println(str);
        x=sc.nextInt();
        return x;
    }
    public static void giaipt(int a,int b){
        if(a==0)
        {
            if(b==0)
                System.out.println("phương trình vô số nghiệm");
            else
                System.out.println("phương trình vô nghiệm");
        }
        else
            System.out.println("phương trình có nghiệm x= :"+(-b/a));
    }
 
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
       
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
