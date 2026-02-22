package programming;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> a=new LinkedList<Integer>();
		a.add(12);
		a.add(23);
		a.add(54);
		a.add(77);
		long s=a.stream().count();
		System.out.println(s);
	}
	

}
