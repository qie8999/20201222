package loopTest1216;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		System.out.println("--------------------------------");
		System.out.println("�Է� �޴� ���� ���� ���ϴ� ���α׷� 1.0");
		System.out.println("--------------------------------");
		Scanner s =new Scanner(System.in);
		System.out.print("1.Num1 �Է� =>");
		int num1=s.nextInt();
		System.out.print("1.Num2 �Է� =>");
		int num2=s.nextInt();
		int hap = 0;
		
		if(num1 > num2) {
			System.out.println("num1�� ���� Ů�ϴ�.");
			//���α׷� ���� ����
			
		    System.exit(0);
		}
		
		for (int i=num1; i<=num2; i++) {
			hap += i;
		}
		
		System.out.printf("%d ~ %d������ ��: %d\n",
				num1,num2,hap);
		
		s.close();

	}

}
