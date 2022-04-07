import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data[] = sc.next().split("");
		
		for (int i=0; i<data.length; i++) { 
		      System.out.println("'" + data[i] + "'"); 
		 }
	}

}

//""로 단어를 1개씩 입력 받는다

//String str = sc.next();
   // String data[] = str.split("")
