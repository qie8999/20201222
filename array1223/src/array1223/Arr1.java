package array1223;

import java.util.Scanner;

public class Arr1 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int[] arr=new int[4];
		//int형 타입을 가지는 4개의 연속된 공간 크기 4
		int hap =0;
		
		System.out.println("1번째 숫자 입력: ");
		arr[0] =s.nextInt();
		System.out.println("2번째 숫자 입력: ");
		arr[1] =s.nextInt();
		System.out.println("3번째 숫자 입력: ");
		arr[2] =s.nextInt();
		
		hap =arr[0] +arr[1] +arr[2];
		System.out.println("배열의 합: "+ hap);
		hap = 0;
		for(int i =0; i <3; i++) {
			hap += arr[i]; //hap = hap + arr[i]
		}
		System.out.println("배열의 합: "+ hap);
		s.close();

	}

}
