package loop1222;

public class Loop1 {

	public static void main(String[] args) {
		for(int i=0; i<2; i++) { //밖은 2번 돌고
			for(int j=0; j<3; j++) { //안은 3번 돈다
				//i가 0일때. j=0, 1, 2
				//i가 1일때 j=0, 1, 2
			}
		}

		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				//i = 0, j = 0, 1, 2, 3
				//i = 1, j = 0, 1, 2, 3
				//i = 2, j = 0, 1, 2, 3
				//루프를 많이 쓰는게 좋은 것은 아니다. 
				//알고리즘이 나빠짐
				
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<2; j++) {
				//i = 0, j = 0, 1
				//i = 1, j = 0, 1
				//i = 2, j = 0, 1
				//i = 3, j = 0, 1
				//루프를 많이 쓰는게 좋은 것은 아니다. 
				//알고리즘이 나빠짐
				System.out.printf("i:%d,j:%d\n",i,j);
			}
		}
	}

}
