package loop1222_ex;

import java.util.Scanner;

public class Loop6Ex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1.Num1 : ");
		int num1 = s.nextInt();
		System.out.print("2.Num2 : ");
		int num2 = s.nextInt();
		
		int sum = 0;
		
		if (num2 < num1) {
			System.out.println("에러입니다");
		}
		
		for (int i =num1; i <=num2; i++) {
			sum += i;
		}
		System.out.printf("%d ~%d 까지의 합 : %d\n",num1,num2,sum);
		
		
		

	}

}
