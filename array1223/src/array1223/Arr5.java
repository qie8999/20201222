package array1223;

public class Arr5 {

	public static void main(String[] args) {
		int[] arr1 =new int[100];//둘다 같은 식임
		int arr2[] =new int[100]; 
		
		for(int i =0; i<arr1.length; i++) {
			arr1[i] =i * 2;
			//2의 배수 200까지 100개 출력된다
			System.out.println(arr1[i]);
		}
		System.out.println("###########################");
		for(int j=0; j<arr2.length; j++) {
			arr2[j] =arr1[99-j];
			//j가 0부터 시작되므로 커지면서 99-j가 된다
			//200에서 0까지 100개 출력된다
			System.out.println(arr2[j]);
		}

	}

}
