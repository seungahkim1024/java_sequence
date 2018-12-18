package array;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		/**int count = 0;
			String[]res = new String[count];
		-> String[] res = {};*/

		String[] res = {};
		String[] class1 = new String[20];
		String[] vivace = {"은지","지우","현일","창준","서우"};
		String[] chung = {"창하","은영","정욱","수호",""};
		String[] atlas = {"동준","이레","지은","종협",""};
		String[] ntom = {"정우","기호","태혁","승아",""};
		//String[][] res = {vivace,chung,atlas,ntom};

		Scanner scanner = new Scanner(System.in);
		System.out.println("팀명을 입력하세요");
		String team = scanner.next();

			switch(team){
			case "vivace": res = vivace; break;
			case "chung": res = chung; break;
			case "atlas": res = atlas; break;
			case "ntom": res = ntom; break;
			}
			for(int i=0; i<res.length; i++){
			System.out.println(res[i]);
		}
	}
}
