import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a = a.replace("-", "");
		System.out.println(a);
	}

}


//split 실패
//replace로 -를 
