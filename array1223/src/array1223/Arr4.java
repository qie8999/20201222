package array1223;

public class Arr4 {

	public static void main(String[] args) {
		int arr[]=new int[10];//10���� ����
		
		//���� 0~9
		for (int i=0; i<arr.length; i++) {
			arr[i] = i;
			//�߰�ȣ �ȿ��� ����� ���� 
			//�ۿ� ������ ��ġ�� ���Ѵ�
		}
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

