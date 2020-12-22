package loop1222_ex;

import java.util.Scanner;

public class Loop1Ex {

	public static void main(String[] args) {
		// 기본 알고리즘 5번째 1.

		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("숫자를 입력하세요: ");
			int num1 = s.nextInt();

			if (num1 % 2 == 0) {

				System.out.printf("%d.Num %d =>%d\n", i, i, num1);
				System.out.println("짝수입니다");

			} else {
				System.out.printf("%d.Num %d =>%d\n", i, i, num1);
				System.out.println("홀수입니다");

			}

		}

	}

}
