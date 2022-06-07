package lab5_1;

public class MyArrayList {
	private int[] listArray; // 정수 원소를 저장할 배열
	private int listLength; //실제 저장된 원소 개수 (즉, 리스트의 길이)

	public MyArrayList(int capacity) { 
		listArray = new int[capacity];
		listLength = 0;

	}
	public void add(int item) {
		listArray[listLength++]= item;
	}

	@Override
	public String toString() {
		String result = "(";
		for(int i=0;i<listLength-1;i++) {
			result+=listArray[i];
			result+=", ";
		}
		result+=listArray[listLength-1];
		result+=")";
		return result;
	}

}
