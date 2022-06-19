public class MyArrayList {
	private int[] listArray;
	private int listLength;

	public MyArrayList(int capacity) {
		listArray = new int[capacity];
		listLength=0;
	}
	
	public void add(int index, int value) {	
		
		// for문을 이용하여 뒤로 한 칸씩 이동
		for(int i=listLength;i>=index;i--) {
			listArray[i+1]=listArray[i];
		}
		// 저장하고자 했던 인덱스 위치에 저장하고자 하는 값을 저장
		listArray[index]=value;
		listLength++;

	}
	public int remove(int index) {
		// 삭제될 index의 값을 반환하기 위해 value라는 변수에 반환값을 저장
		int value=listArray[index];
		
		// for문을 이용하여 앞으로 한 칸씩 이동
		for(int i=index;i<listLength;i++) {
			listArray[i]=listArray[i+1];
		}
		listLength--;
		return value;
	}

	@Override
	public String toString() {
		String result = "(";
		for(int i=0;i<listLength-1;i++) {
			result+=listArray[i];
			result+=", ";
		}
		result+=listArray[listLength-1];
		result+=") ";
		return result;

	}

}
