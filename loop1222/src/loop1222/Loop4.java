package loop1222;

public class Loop4 {

	public static void main(String[] args) {
		int result = 0;
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				result = i*j;
				System.out.printf("%dx%d=%d\n",i,j,result);
			}
		}

	}

}
