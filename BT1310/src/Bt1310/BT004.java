package Bt1310;
import java.util.Scanner; 
public class BT004 {
	public static void main(String[] args){
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
}
