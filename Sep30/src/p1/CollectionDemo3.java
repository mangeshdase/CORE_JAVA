package p1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(2);
		a1.add(13);
		a1.add(1);
		a1.add(42);
		a1.add(33);
		a1.add(21);
		a1.add(1);
		a1.add(10);
		
		Stream<Integer> strm = a1.stream();
		//show the content of the  stream
		strm.forEach(ele -> System.out.println(ele));
	}

}
