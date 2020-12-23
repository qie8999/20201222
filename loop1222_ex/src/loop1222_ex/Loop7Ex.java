package loop1222_ex;

public class Loop7Ex {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("구구단 프로그램 v1.0");
		System.out.println("-------------------");
		for(int j=1; j<=9; j++)
		{	
			for(int i=2; i<=9; i++)
			{
				System.out.printf("%d x %d = %d \t",i,j,i*j);
			}
			System.out.println();
			
		}

	}

}
