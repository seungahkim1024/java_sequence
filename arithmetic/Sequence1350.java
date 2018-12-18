package arithmetic;

public class Sequence1350 {
	public static void main(String[] args) {
		
		 int i = 0, d = 1, sum = 1;

	        while (true) {
	        	d += i++;
	        	sum += d+i;
	        	System.out.println(d+"and"+sum);
	           if(i<19) {	
	        	   continue;
	           }else {
	        	   break;
	           }
	        }
	       
	        System.out.printf(
	                  "======================================================\n"
	                + "1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합 \n"
	                + "======================================================\n"
	                + "sum\n"
	                + "=======================================================",sum);

		
	}
}