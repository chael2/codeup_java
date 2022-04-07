import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
		int a = sc.nextInt();
		String b = Integer.toOctalString(a);
		System.out.println(b);
		
	}

}


//Integer.toOctalString(int); : 10진수 >> 8진수 변환
