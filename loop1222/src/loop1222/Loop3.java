package loop1222;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.println("---------------------");
		System.out.println("�޴� ���α׷� �׽�Ʈ 1.0");
		System.out.println("---------------------");
		System.out.println("1.������ ����");
		System.out.println("2.������ �б�");
		System.out.println("3.���α׷� ����");
		System.out.println("---------------------");
		System.out.print("�޴� ���� : ");
		
		int menu =s.nextInt();
		switch(menu) {
		case 1:
			System.out.println("������ ���� �۾� ó��");
			break;
		case 2:
			System.out.println("������ �б� �۾� ó��");
			break;
		case 3:
			System.out.println("���α׷� ���� ó��");
			s.close();
			System.exit(0);
			break;
		default:
			System.out.println("�߸��� �޴� ����!");
			break;
		}
		
		}
	}

}
