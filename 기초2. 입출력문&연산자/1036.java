import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		int b = (int)a;
		System.out.println(b);
		
	}

}


//charAt : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
//(int)a; = 10진수로 변환
