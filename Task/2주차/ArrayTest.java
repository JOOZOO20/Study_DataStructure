package hw3_1;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		System.out.println("hw3_1 : ������");
		System.out.print("10���� ������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);

		int array[]=new int[10]; // ũ�Ⱑ 10�� int�� �迭 ����
		int sum=0;

		//10���� �������� �Է¹޾� �迭�� �����ϰ�, �迭�� �հ踦 ����
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
			sum+=array[i];
		}

		//����� ����
		double average = sum /10.0;
		System.out.println("��� = "+average);

		
		//��� �̻��� ������ ���
		System.out.print("��� �̻� = ");
		for(int i=0;i<10;i++) {
			if(array[i]>=average) {
				System.out.print(array[i]+" ");
			}
		}

		
		sc.close();
	}

}
