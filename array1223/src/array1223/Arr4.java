package array1223;

public class Arr4 {

	public static void main(String[] args) {
		int arr[]=new int[10];//10개의 공간
		
		//공간 0~9
		for (int i=0; i<arr.length; i++) {
			arr[i] = i;
			//중괄호 안에서 선언된 것은 
			//밖에 영향을 미치지 못한다
		}
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

