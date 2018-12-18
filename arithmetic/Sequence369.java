package arithmetic;

/**
 * 3의 배수를 제외한 1 부터 10까지 정수 출력 [결과] 1 2 4 5 7 8 10
 */
public class Sequence369 {
	public static void main(String[] args) {
		String res = "";
		
		for(int i=0; i<11; i++){
			if(i%3!=0){
				res += i;
			}
		}
		System.out.println(res) ;
	}
}