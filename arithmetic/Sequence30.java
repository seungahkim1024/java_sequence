package arithmetic;

import java.util.Scanner;

public class Sequence30 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        System. out.println( "1부터 합산고자 하는 한계 숫자를 입력하세요");
        System. out.println( "1부터 입력값 범위내의 짝수만 합산됩니다.");
         int sum = 0;
         int num = scanner.nextInt();
         for ( int i = 1; i <= num; i++) {
               if ( i % 2 == 1) { // 홀수인 경우
                     continue; // 더하지 않고 다음 반복으로 진행
               }else { // 짝수인 경우
                     sum += i;
               }
        }
        System. out.println( "1부터 " + num + "까지 짝수의 합은 " + sum);
  }
}