import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data[] = sc.next().split("\\.");
		
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);
		
		System.out.printf("%d\n%d", a, b);
	}

}

//split로 나누어서 출력
