package hw3_1;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		System.out.println("hw3_1 : 차희주");
		System.out.print("10개의 정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);

		int array[]=new int[10]; // 크기가 10인 int형 배열 생성
		int sum=0;

		//10개의 정수값을 입력받아 배열에 저장하고, 배열의 합계를 구함
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
			sum+=array[i];
		}

		//평균을 구함
		double average = sum /10.0;
		System.out.println("평균 = "+average);

		
		//평균 이상인 값들을 출력
		System.out.print("평균 이상 = ");
		for(int i=0;i<10;i++) {
			if(array[i]>=average) {
				System.out.print(array[i]+" ");
			}
		}

		
		sc.close();
	}

}
