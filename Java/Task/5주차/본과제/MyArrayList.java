public class MyArrayList {
	private int[] listArray;
	private int listLength;

	public MyArrayList(int capacity) {
		listArray = new int[capacity];
		listLength=0;
	}
	
	public void add(int index, int value) {	
		
		// for���� �̿��Ͽ� �ڷ� �� ĭ�� �̵�
		for(int i=listLength;i>=index;i--) {
			listArray[i+1]=listArray[i];
		}
		// �����ϰ��� �ߴ� �ε��� ��ġ�� �����ϰ��� �ϴ� ���� ����
		listArray[index]=value;
		listLength++;

	}
	public int remove(int index) {
		// ������ index�� ���� ��ȯ�ϱ� ���� value��� ������ ��ȯ���� ����
		int value=listArray[index];
		
		// for���� �̿��Ͽ� ������ �� ĭ�� �̵�
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
