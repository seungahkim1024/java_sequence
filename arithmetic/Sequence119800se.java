package arithmetic;
/**
Count is 2, Number is 8, Sum is 10
Count is 3, Number is 14, Sum is 24
Count is 4, Number is 20, Sum is 44
Count is 5, Number is 26, Sum is 70
Count is 6, Number is 32, Sum is 102
Count is 7, Number is 38, Sum is 140
Count is 8, Number is 44, Sum is 184
Count is 9, Number is 50, Sum is 234
Count is 10, Number is 56, Sum is 290
// 중간 생략
Count is 198, Number is 1184, Sum is 117414
Count is 199, Number is 1190, Sum is 118604
Count is 200, Number is 1196, Sum is 119800

S is 119800
 * */
public class Sequence119800se {
	public static void main(String[] args) {
		int A = 2;
        int D = 6;
        int S = A;
        int N = 2; //Count 
        int AN = 0;
        
        while(true){
        	A+=D;
        	S+=A;
        	System.out.println("Count is "+N+"Number is"+A+"Sum is"+S);
        	N++;
        	if(N<201){
        		continue;
        	}else{
        		break;
        	}
        }
        //System.out.printf("S is %d", S);
	}
}