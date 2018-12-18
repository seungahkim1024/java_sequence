package array;

public class MyClass2 {

	public static void main(String[] args) {
		/**int count = 4;
		String[]res = new String[count];*/
		
		String[] res = new String[4];
		String[] vivace = {"은지","지우","현일","창준","서우"};
		String[] chung = {"창하","은영","정욱","수호",""};
		String[] atlas = {"동준","이레","지은","종협",""};
		String[] ntom = {"정우","기호","태혁","승아",""};
		String[][] num1 = {vivace, chung, atlas, ntom};
		
		for(int i=0; i<num1.length; i++){
			for(int j=2; j==2;j++){
				res[i] = num1[i][j];
			}
		}
		for(int i=0; i<res.length; i++){
			System.out.println(res[i]);
		}
		
	}
}
