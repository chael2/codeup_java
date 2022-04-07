import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		String [] time = data.split(":");
    
		int a = Integer.parseInt(time[1]);
		System.out.printf("%d", a);
		
		
	}

}


//sc - data - time 순
