package loop1222;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Loop4_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------");
			System.out.println("������ ���� ���� ���α׷� v1.0");
			System.out.println("-------------------------");
			System.out.println("1.���� ���� �� ����");
			System.out.println("2.���� �б�");
			System.out.println("3.����");
			System.out.println("-------------------------");
			System.out.print("�޴��� �����ϼ���: ");
			int menu = s.nextInt();
			String filename ="d:/test1.txt";
			switch (menu) {
			case 1:
				System.out.println("1.���� ���� �� ����");
				BufferedOutputStream bs = null;
				String str=null;
				try {
					bs = new BufferedOutputStream(

							new FileOutputStream(filename));
					str = "���� ���� �� ���� �����Դϴ�...";
					bs.write(str.getBytes());
					bs.close();
					//�۾��ϴ� ������ �߻��� ��� catch�� ����ش�
				} catch (FileNotFoundException e) {					
					e.printStackTrace();				
				} catch (IOException e) {					
					e.printStackTrace();
				}
				
				
			
				System.out.println("���ϸ�: " + filename);
				System.out.println("���ϳ���: " + str);
				System.out.println("���� ������ �����Ͽ����ϴ�.. ");
				break;

			case 2:
				System.out.println("2.���� �б�");
				BufferedReader br;
				try {
				br=new BufferedReader(
						new FileReader(new File("d:/test1.txt")));
				String str2=br.readLine();
				System.out.println("---���Ͽ��� ���� �о����---");
				System.out.println(str2);
				br.close();
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("���ϸ�: " + filename);
				System.out.println("���� ����: ���� ���� �׽�Ʈ�Դϴ� ");
				System.out.println("���� �бⰡ �����Ͽ����ϴ�.. ");
					break;
				}
			
			
		}

	}

	private static void BufferedReader(FileReader fileReader) {
		// TODO Auto-generated method stub
		
	}

}
