import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = Integer.toHexString(a);
		System.out.println(b);
		
	}

}


//Integer.toHexString(int); : 10진수 >> 16진수 변환
