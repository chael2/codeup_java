import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.valueOf(a, 8);
		System.out.printf("%d", b);
		
	}

}

//Integer.valueOf : 8진수 >> 10진수 변환
