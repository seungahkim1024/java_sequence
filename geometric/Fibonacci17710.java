package geometric;
/**
 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다. 
 처음 여섯 항은 각각 1, 1, 2, 3, 5, 8이다.
 피보나치 수열의 20번째 항까지의 합은 얼마인가? 17710
 5항까지의 합이 12가 나오는 식을 먼저 만듭니다.
 */
public class Fibonacci17710 {
	public static void main(String[] args) {
		int A = 1; //1번째
		int B = 1; //2번째
		int S = A + B; 
		int N = 2; //COUNT
		int C = 0; //3~20번째 항
		
		for(N=2; N<20; N++) {
			C=A+B;
			System.out.println("A="+A+"B="+B+"C"+C);
			S +=C;
			A=B;
			B=C;
			}
		System.out.printf("S is %s",S);
	}
}
