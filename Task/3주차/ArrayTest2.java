
public class ArrayTest2 {

	public static void main(String[] args) {
		System.out.println("hw3_2 : ������");
		int[] array1 = {10, 20, 30, 999, 50, 60, 999, 70, 999, 90};
		int[] array2 = {90, 20, 30, 40, 50, 60, 70, 10};
		int[] array3 = {-20, -30, -40, -50, -60, -70, -80, -90, -10};



		outParameter(array1);	// array1�� ���Ҹ� �����ϸ� ���
		System.out.println();
		System.out.print("�ִ밪 �ε��� = "+getParameter(array1)+" ");
		System.out.println("�ִ밪 = "+array1[getParameter(array1)]);

		outParameter(array2);	// array2�� ���Ҹ� �����ϸ� ���
		System.out.println();
		System.out.print("�ִ밪 �ε��� = "+getParameter(array2)+" ");
		System.out.println("�ִ밪 = "+array2[getParameter(array2)]);

		outParameter(array3);	// array3�� ���Ҹ� �����ϸ� ���
		System.out.println();
		System.out.print("�ִ밪 �ε��� = "+getParameter(array3)+" ");
		System.out.println("�ִ밪 = "+array3[getParameter(array3)]);
	}


	// ���ڷ� ���� �迭�� �����ϸ� ����ϴ� outParameter �޼ҵ�
	public static void outParameter(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

	// ���ڷ� ���� �迭�� ���� �߿��� �ִ밪 �ε����� �ִ밪�� �����ϴ� getParameter �޼ҵ�
	public static int getParameter (int[] array) {
		int max=array[0]; // �ִ밪�� ���ϱ� ���� ���� ����
		int maxIndex = 0; // �ִ밪 �ε����� ��ȯ�ϱ� ���� ���� ����
		for(int i=0;i<array.length;i++) {
			if (array[i]>max) {		
				max=array[i];
				maxIndex=i;
			}
		}

		return maxIndex;
	}

}
