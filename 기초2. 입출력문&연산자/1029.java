import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double data = sc.nextDouble();
		System.out.printf("%.11f", data);
		
	}

}

//%.11f은 소수점 이하 11자리까지 출력
