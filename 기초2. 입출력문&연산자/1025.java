import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		char[] a = data.toCharArray();
		
		System.out.println("[" + a[0] + "0000]");
        System.out.println("[" + a[1] + "000]");
        System.out.println("[" + a[2] + "00]");
        System.out.println("[" + a[3] + "0]");
        System.out.println("[" + a[4] + "]");
		
		
	}

}


//toCharArray은 char[]으로 변환
