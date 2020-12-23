package array1223;

import java.util.Random;
import java.util.StringTokenizer;

public class Arr_7ex {

	public static void main(String[] args) {
		//연습 문제 7
		System.out.println("-------------------------");
		System.out.println("파일 제어 프로그램 v1.1");
		System.out.println("--------------------------");
		System.out.println("1. 이름 생성하여 파일에 저장하기");
		System.out.println("2. 파일에서 이름 읽어오기");
		System.out.println("3. 프로그램 종료");
		System.out.println("--------------------------");
		System.out.println("메뉴 선택 : ");
		
		String last[] = {"김","박","이","최","장"};
		String first[] = {"바","사","아","자","차"};
		String mid[] = {"가","나","다","라","마"};
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
