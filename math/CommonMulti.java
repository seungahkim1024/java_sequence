package math;
import java.util.Scanner;
/**
정수들의 공약수(公約數, 영어: common divisor)는 
동시에 그들 모두의 약수인 정수다. 
적어도 하나가 0이 아닌 정수들의 
최대공약수(영어: greatest common divisor, 약자 GCD)는 
공약수 가운데 가장 큰 하나다.
12, 18
--> 6
공배수(公倍數)란 두 개 이상의 자연수의 공통인 배수를 말한다. 
예를 들어 3과 4의 공배수는 3의 배수이기도 하고 4의 배수이기도 한 수이다. 
두 수의 공배수 중에서 가장 작은 수를 최소공배수
Least Common Multi => LCM
 * */
public class CommonMulti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("최대공약수와 최소공배수를 구할 두 수를 입력하세요");
		int num1 = scanner.nextInt(),
			num2 = scanner.nextInt(),
			big = 0,
			small = 0,
			mok = 0,
			nmg = 0,
			lcm = 0,
			gcd = 0;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
		mok = big / small;
		nmg = big % small;
		
		if(nmg!=0) {
			for(int i=0;i<small;i++) {
				if(small % (i+1)==0 && big % (i+1)==0) {
					gcd = i+1;
				}
			}
			//gcd = nmg;
		}else {
			gcd = small;
		}
		lcm = (num1 * num2) / gcd;
		System.out.printf("%d , %d ::: 최소공배수: %d & 최대공약수: %d",
				num1, num2, lcm, gcd);
		
	}
}
