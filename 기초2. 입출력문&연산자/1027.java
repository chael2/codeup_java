import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		String [] time = data.split("\\.");
		
		int y = Integer.parseInt(time[0]);
		int m = Integer.parseInt(time[1]);
		int d = Integer.parseInt(time[2]);
		System.out.printf("%02d-%02d-%04d", d, m, y);
		
		
	}
