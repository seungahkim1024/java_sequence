package math;
import java.util.Random;
/**
<문제>
영어 시험 성적이 80점 이상인 학생들의 수를 구하는 알고리즘을 제시하라.
- 전체 학생의 수는 100명이다.
- 영어 점수는 100점 만점을 기준으로 채점되었다.
- 영어 점수는 배열 변수 JUMSU(100)에 이미 저장되어 있다고 가정한다.
 * */
public class Count {
	public static void main(String[] args) {
		int[] JUMSU = new int[100];
		Random random = new Random();
		int count=0;
		for(int i=0;i<JUMSU.length;i++) {
			JUMSU[i] = random.nextInt(101);
		}
		for(int i=0;i<JUMSU.length;i++) {
			System.out.print("i 값:"+i+"\t");
			System.out.println("JUMSU[i] 값:"+JUMSU[i]+"\t");
			System.out.println("JUMSU 값:"+JUMSU+"\t");
			if(JUMSU[i] >= 80) {
				count++;
			}
		}
		//System.out.printf("영어 시험 성적이 80점 이상인 학생들의 수는 %d명이다",count);
	}
}







