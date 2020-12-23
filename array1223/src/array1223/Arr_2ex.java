package array1223;

public class Arr_2ex {

	public static void main(String[] args) {
		// 배열 문제 2
		int arr[] = new int[100];

		for (int i = 0; i < arr.length; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("#########################");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
			if(i == 90) {
				break;
			}

		}
	}

}
