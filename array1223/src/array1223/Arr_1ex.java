package array1223;

public class Arr_1ex {

	public static void main(String[] args) {
		// 배열 문제 1
		int arr[] = { 20, 34, 22, 14, 36, 23, 67, 25, 99, 88 };
		int sum = 0;
		int ave = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

		for (int i = 0; i < arr.length; i++) {
			ave = sum / arr.length;

		}
		System.out.println(ave);
	}

}
