package array;

import java.util.Scanner;

public class MyClass3 {

	public static void main(String[] args) {
		/**int count = 0;
			String[]res = new String[count];
		-> String[] res = {};*/
		String[] res = new String[4];
		String[] vivace = {"은지","지우","현일","창준","서우"};
		String[] chung = {"창하","은영","정욱","수호",""};
		String[] atlas = {"동준","이레","지은","종협",""};
		String[] ntom = {"정우","기호","태혁","승아",""};
		System.out.println("팀장만 출력");
		String[][] mtx = {vivace, chung, atlas, ntom};
		
		for(int i=0; i<mtx.length;i++){
			for(int j=0;j<3; j++){
				res[i] = mtx[i][j];
			}
		}
		for(int i=0; i<res.length;i++){
			System.out.println(res[i]);
		}
	}
}
