
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		System.out.println("hw5_1 : 차희주");
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		int sum=0;

		// (1)
		for(int i=1;i<=10;i++) {
			list1.add(i);
		}

		System.out.println(list1);

		// (2)
		list1.add(10,777);
		list1.add(0,888);
		list1.add(5,999);

		System.out.println(list1);

		// (3)
		sum+=list1.remove(12);
		sum+=list1.remove(4);
		sum+=list1.remove(0);

		System.out.println(list1+" 삭제 원소 합 : "+sum);

		// (4)
		MyArrayList list2 = new MyArrayList(100);
		for(int i=0;i<10;i++) {
			list2.add(i,i+1);
		}
		System.out.println();
		System.out.println(list2);

		// (5)
		list2.add(10,777);
		list2.add(0,888);
		list2.add(5,999);
		
		System.out.println(list2);

		// (6)
		sum=0;
		sum+=list2.remove(12);
		sum+=list2.remove(4);
		sum+=list2.remove(0);		
		
		System.out.println(list2+"삭제 원소 합 : "+sum);
	}

}
