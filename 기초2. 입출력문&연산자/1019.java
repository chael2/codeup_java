import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data[] = sc.next().split("\\.");
		
		int year = Integer.parseInt(data[0]);
		int month = Integer.parseInt(data[1]);
		int day = Integer.parseInt(data[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month , day);
	}

}


//Integer.parseInt 문자열이 아닌 정수로 변환해주는 명령어 (String타입의 숫자를 int타입으로 변환)
