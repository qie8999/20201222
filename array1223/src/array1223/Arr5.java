package array1223;

public class Arr5 {

	public static void main(String[] args) {
		int[] arr1 =new int[100];//�Ѵ� ���� ����
		int arr2[] =new int[100]; 
		
		for(int i =0; i<arr1.length; i++) {
			arr1[i] =i * 2;
			//2�� ��� 200���� 100�� ��µȴ�
			System.out.println(arr1[i]);
		}
		System.out.println("###########################");
		for(int j=0; j<arr2.length; j++) {
			arr2[j] =arr1[99-j];
			//j�� 0���� ���۵ǹǷ� Ŀ���鼭 99-j�� �ȴ�
			//200���� 0���� 100�� ��µȴ�
			System.out.println(arr2[j]);
		}

	}

}
