package array1223;

import java.util.Random;
import java.util.StringTokenizer;

public class Arr_7ex {

	public static void main(String[] args) {
		//���� ���� 7
		System.out.println("-------------------------");
		System.out.println("���� ���� ���α׷� v1.1");
		System.out.println("--------------------------");
		System.out.println("1. �̸� �����Ͽ� ���Ͽ� �����ϱ�");
		System.out.println("2. ���Ͽ��� �̸� �о����");
		System.out.println("3. ���α׷� ����");
		System.out.println("--------------------------");
		System.out.println("�޴� ���� : ");
		
		String last[] = {"��","��","��","��","��"};
		String first[] = {"��","��","��","��","��"};
		String mid[] = {"��","��","��","��","��"};
		String name[]= new String[50];
		
		for(int i=0; i <name.length; i++ ) {
			String la =(last[new Random().nextInt(last.length)]);
			String fi =(first[new Random().nextInt(first.length)]);
			String mi =(mid[new Random().nextInt(mid.length)]);
			String fullname = la + fi + mi;
			
			name[i] = fullname;
			
	System.out.printf("name[%d] : %s \n", i, fullname);
		
	}
	}

}
