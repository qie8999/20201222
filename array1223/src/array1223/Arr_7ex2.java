package array1223;

import java.util.Random;

public class Arr_7ex2 {

	public static void main(String[] args) {
		// �迭 �������� 7
		System.out.println("--------------------------");
		System.out.println(" ���� ���� ���α׷� v1.1");
		System.out.println("--------------------------");
		System.out.println("1. �̸� �����Ͽ� ���Ͽ� �����ϱ�");
		System.out.println("2. ���Ͽ��� �̸� �о����");
		System.out.println("3. ���α׷� ����");
		System.out.println("--------------------------");
		System.out.println("�޴� ���� : ");
		
		String last[] = {"��","��","��","��","��"};
		String first[] = {"��","��","��","��","��"};
		String mid[] = {"��","��","��","��","��"};
		String name []= new String[50]; 
		
		for(int i =0; i< name.length; i++) {
		Random rand =new Random();
		String la = (last[new Random().nextInt(last.length)]);
		String fi = (first[new Random().nextInt(first.length)]);
		String mi = (mid[new Random().nextInt(mid.length)]);
		String fullname = la + fi + mi;
		
		System.out.printf("%d.�̸� [ %s ] \n",i+1,fullname);
		}
		
		
		
	}

}
