package Cacbaitap;

	import java.util.Scanner;
	public class java1592021bai3 {
	    public static void main(String[] args) { 
	    Scanner input = new Scanner(System.in); 
	    System.out.println("(0-Độc thân, 1-kết hôn chung,\n" +"2-kết hôn riêng, 3-chủ hộ)\n" + "Nhập trạng thái của bạn : "); 
	    int status = input.nextInt(); 
	    System.out.println("Nhập thu nhập chịu thuế: "); 
	    double income = input.nextDouble(); 
	    double tax = 0;
	    if (status == 0) { 
	    if (income <= 8350)
	    tax = income * 0.10;
	    else if (income <= 33950)
	    tax = 8350 * 0.10 + (income - 8350) * 0.15;
	    else if (income <= 82250)
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
	    (income - 33950) * 0.25;
	    else if (income <= 171550) 
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (income - 82250) * 0.28;
	    else if (income <= 372950)
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(income - 171550) * 0.35;
	    else
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
	    }
	    else if (status == 1) { 
	    if (income <= 16700)
	    tax = income * 0.10;
	    else if (income <= 67900)
	    tax = 16700 * 0.10 + (income - 16700) * 0.15;
	    else if (income <= 137050)
	    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
	    else if (income <= 208850) 
	    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
	    else if (income <= 372950)
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(income - 171550) * 0.35;
	    else
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
	    }
	    else if (status == 2) { 
	    if (income <= 16700)
	    tax = income * 0.10;
	    else if (income <= 67900)
	    tax = 16700 * 0.10 + (income - 16700) * 0.15;
	    else if (income <= 137050)
	    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
	    else if (income <= 208850) 
	    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
	    else if (income <= 372950)
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(income - 171550) * 0.35;
	    else
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
	    }

	    else if (status == 3) { 
	    if (income <= 16700)
	    tax = income * 0.10;
	    else if (income <= 67900)
	    tax = 16700 * 0.10 + (income - 16700) * 0.15;
	    else if (income <= 137050)
	    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
	    else if (income <= 208850) 
	    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
	    else if (income <= 372950)
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(income - 171550) * 0.35;
	    else
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(372950 - 171550) * 0.33 + (income - 372950) * 0.35;

	    }
	    else {
	    System.out.println("khong tim thay.");
	    System.exit(0);
	    }

	     System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	    }
	}
