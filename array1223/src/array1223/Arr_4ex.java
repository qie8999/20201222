package array1223;

public class Arr_4ex {

	public static void main(String[] args) {
		// 배열 연습 문제 4
		int arr[][]= {{1, 2},{2, 4},{3, 6},{4, 8},{5, 10}};
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<2; j++) {
				
				result = (i+1)*(j+1);
				System.out.printf("arr[%d][%d] = %d , ",i,j,result);
				
			}
			System.out.println("");
		}

	}

}
