package lab3_1;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("lab3_1: 차희주");
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 양의 정수 입력 : ");
		int a = sc.nextInt();
		int n = sc.nextInt();

		repeat(a,n);
		System.out.print(power(a,n));


		sc.close();
	}


	private static void repeat (int a, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	private static int power (int a, int n) {
		int value=1;
		for(int i=0;i<n;i++) {
			value*=a;
		}
		return value;
	}

}
