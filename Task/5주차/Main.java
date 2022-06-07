package lab5_1;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("lab5_1 : 차희주");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		int sum=0;
		
		// (1) list1에 원소 10개 삽입
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		
		System.out.println(list1);
		
		// (2) list1의 특정 인덱스 위치에 원소 3개 삽입
		list1.add(10,777);
		list1.add(0,888);
		list1.add(5,999);
		
		System.out.println(list1);
		
		// (3) list1로 부터 특정 인덱스의 원소 3개 삭제
		sum+=list1.remove(12);
		sum+=list1.remove(4);
		sum+=list1.remove(0);
			//list1.remove(0); 하게 되면 remove만 하고 return 값은 버리게 됨
		
		System.out.println(list1+" 삭제 원소의 합: "+sum);

		// (4) 용량이 100인 MyArrayList객체 (list2)를 생성하여 원소 10개 삽입 후 리스트 출력
		MyArrayList list2 = new MyArrayList(100);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);
		System.out.println();
		System.out.println(list2);
	
		
	}
	
}
