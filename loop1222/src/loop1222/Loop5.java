package loop1222;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		String str = "���� ���� �� ���� �����Դϴ�..";
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("d:/test1.txt"));

			bs.write(str.getBytes());
			bs.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File("d:/test1.txt")));
			String str2 = br.readLine();
			System.out.println("---���Ͽ��� ���� �о����---");
			System.out.println(str2);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("-------------------------");
			System.out.println("������ ���� ���� ���α׷� v1.0");
			System.out.println("-------------------------");
			System.out.println("1.���� ���� �� ����");
			System.out.println("2.���� �б�");
			System.out.println("3.����");
			System.out.println("-------------------------");
			System.out.print("�޴��� �����ϼ���: ");
			int menu = s.nextInt();
			switch (menu) {
			case 1:
				System.out.println("���ϸ� : test1.txt");
				System.out.println("���� ���� : " + str);
				System.out.println("���� ������ �����Ͽ����ϴ�.");
				break;

			case 2:
				System.out.println("���ϸ� : test1.txt");
				System.out.println("���� ���� : ���� ���� �׽�Ʈ�Դϴ�..");
				System.out.println("���� �бⰡ �����Ͽ����ϴ�.");
				s.close();
				System.exit(0);
				break;
			}
		}
	}

}
