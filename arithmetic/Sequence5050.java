package arithmetic;
/**
1+2+3+4+...+100 까지의 합계를 구하는 순서도를 작성하시오
[변수]
      i : 항
      sum : 합계
[결과]
      ====================
      1+2+3+...+100까지 합
      =====================
      5050
      =====================
 * */
public class Sequence5050 {
	public static void main(String[] args) {
		 int i=0, x=0;
		 while(true) {
			i++;
			x += i;
			if(i<100) {
				continue;
			}else {
				break;
			}
		 }
		 System.out.print(x);
	}
}