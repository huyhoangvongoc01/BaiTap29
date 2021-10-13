package Bt1310;
import java.util.Scanner; 
public class BT003 {
	public static void test()   
	{  
	    System.out.println("hello");          
	}  
	public static void repeat(int n){
	    for(int i=0;i<n;i++){
	        test();
	    }

	}

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter any number : ");
	        int n = scanner.nextInt();
	        repeat(n);
	                
	    }
}
