package array1223;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[4];
		// int�� Ÿ���� ������ 4���� ���ӵ� ���� ũ�� 4
		int hap = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print(i+1 +"��° ���� �Է� : ");
			arr[i] = s.nextInt();
		}

		hap = arr[0] + arr[1] + arr[2];
		System.out.println("�迭�� ��: " + hap);
		hap = 0;
		for (int i = 0; i < 3; i++) {
			hap += arr[i]; // hap = hap + arr[i]
		}
		System.out.println("�迭�� ��: " + hap);
		s.close();

	}

}
