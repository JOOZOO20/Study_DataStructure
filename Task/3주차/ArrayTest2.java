
public class ArrayTest2 {

	public static void main(String[] args) {
		System.out.println("hw3_2 : 차희주");
		int[] array1 = {10, 20, 30, 999, 50, 60, 999, 70, 999, 90};
		int[] array2 = {90, 20, 30, 40, 50, 60, 70, 10};
		int[] array3 = {-20, -30, -40, -50, -60, -70, -80, -90, -10};



		outParameter(array1);	// array1의 원소를 나열하며 출력
		System.out.println();
		System.out.print("최대값 인덱스 = "+getParameter(array1)+" ");
		System.out.println("최대값 = "+array1[getParameter(array1)]);

		outParameter(array2);	// array2의 원소를 나열하며 출력
		System.out.println();
		System.out.print("최대값 인덱스 = "+getParameter(array2)+" ");
		System.out.println("최대값 = "+array2[getParameter(array2)]);

		outParameter(array3);	// array3의 원소를 나열하며 출력
		System.out.println();
		System.out.print("최대값 인덱스 = "+getParameter(array3)+" ");
		System.out.println("최대값 = "+array3[getParameter(array3)]);
	}


	// 인자로 받은 배열을 나열하며 출력하는 outParameter 메소드
	public static void outParameter(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

	// 인자로 받은 배열의 원소 중에서 최대값 인덱스와 최대값을 추출하는 getParameter 메소드
	public static int getParameter (int[] array) {
		int max=array[0]; // 최대값을 비교하기 위한 변수 선언
		int maxIndex = 0; // 최대값 인덱스를 반환하기 위한 변수 선언
		for(int i=0;i<array.length;i++) {
			if (array[i]>max) {		
				max=array[i];
				maxIndex=i;
			}
		}

		return maxIndex;
	}

}
