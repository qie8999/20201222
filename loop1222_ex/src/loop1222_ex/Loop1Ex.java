package loop1222_ex;

import java.util.Scanner;

public class Loop1Ex {

	public static void main(String[] args) {
		// �⺻ �˰����� 5��° 1.

		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("���ڸ� �Է��ϼ���: ");
			int num1 = s.nextInt();

			if (num1 % 2 == 0) {

				System.out.printf("%d.Num %d =>%d\n", i, i, num1);
				System.out.println("¦���Դϴ�");

			} else {
				System.out.printf("%d.Num %d =>%d\n", i, i, num1);
				System.out.println("Ȧ���Դϴ�");

			}

		}

	}

}