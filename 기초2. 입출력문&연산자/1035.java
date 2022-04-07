import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.valueOf(a, 16);
		System.out.printf("%o", b);
		
	}

}


//서식지정자 %o
