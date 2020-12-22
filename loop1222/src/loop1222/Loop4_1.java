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
			System.out.println("간단한 파일 관리 프로그램 v1.0");
			System.out.println("-------------------------");
			System.out.println("1.파일 생성 및 쓰기");
			System.out.println("2.파일 읽기");
			System.out.println("3.종료");
			System.out.println("-------------------------");
			System.out.print("메뉴를 선택하세요: ");
			int menu = s.nextInt();
			String filename ="d:/test1.txt";
			switch (menu) {
			case 1:
				System.out.println("1.파일 생성 및 쓰기");
				BufferedOutputStream bs = null;
				String str=null;
				try {
					bs = new BufferedOutputStream(

							new FileOutputStream(filename));
					str = "파일 생성 및 쓰기 예제입니다...";
					bs.write(str.getBytes());
					bs.close();
					//작업하다 오류가 발생한 경우 catch가 잡아준다
				} catch (FileNotFoundException e) {					
					e.printStackTrace();				
				} catch (IOException e) {					
					e.printStackTrace();
				}
				
				
			
				System.out.println("파일명: " + filename);
				System.out.println("파일내용: " + str);
				System.out.println("파일 생성이 성공하였습니다.. ");
				break;

			case 2:
				System.out.println("2.파일 읽기");
				BufferedReader br;
				try {
				br=new BufferedReader(
						new FileReader(new File("d:/test1.txt")));
				String str2=br.readLine();
				System.out.println("---파일에서 내용 읽어오기---");
				System.out.println(str2);
				br.close();
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("파일명: " + filename);
				System.out.println("읽은 내용: 파일 생성 테스트입니다 ");
				System.out.println("파일 읽기가 성공하였습니다.. ");
					break;
				}
			
			
		}

	}

	private static void BufferedReader(FileReader fileReader) {
		// TODO Auto-generated method stub
		
	}

}
