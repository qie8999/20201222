package loop1222_ex;

import java.util.Scanner;

public class Loop5Ex {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
						int sum = 0;
			System.out.print("1.Num1 : ");
			int num1 = s.nextInt();
			System.out.print("2.Num2 : ");
			int num2 =s.nextInt();
			
			if( num1 > num2 || num1 == num2) {
				System.out.println("����");	
				System.exit(0);}
			
			
			for(int i = num1; i <=num2; i++) {
							sum += i;
				
			}
			System.out.printf("%d ~%d ������ �� : %d\n",num1,num2,sum);
			s.close();
		}

	}


