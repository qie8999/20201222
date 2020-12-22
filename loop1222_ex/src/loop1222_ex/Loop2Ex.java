package loop1222_ex;

import java.util.Scanner;

public class Loop2Ex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		for(int i=1; i<=5; i++) {
			System.out.print("숫자를 입력하시오: ");
			int num1 =s.nextInt();
			if(num1%2 == 0) {
				System.out.printf("%d .Num %d => %d\n",i,i,num1);
				System.out.println("짝수입니다");
			}else {
				System.out.printf("%d .Num %d => %d\n",i,i,num1);
				System.out.println("홀수입니다");
			}
		}

	}

}
