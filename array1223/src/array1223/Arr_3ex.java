package array1223;

public class Arr_3ex {

	public static void main(String[] args) {
		// 연습 문제 3
		int arr[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int arr1[] =new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr1[i]= arr[(arr.length-1)-i];
			System.out.println(arr1[i]);
			
		}

	}

}
