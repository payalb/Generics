package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>(); //non-veg person: veg
		list.add(4);
		addElemToList(list);

		for(Integer i: list){ //RuntimeError
			System.out.println(i);
		}
	}
	
	static void addElemToList(List list){ //non-veg
		list.add("hello");

	}
}
