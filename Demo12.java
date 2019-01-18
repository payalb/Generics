package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo12 {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();
	A.print2(list);
	
	List<Object> list1= new ArrayList<>();
	A.print2(list1);
	list1.add(4);
	
	List<Number> list2= new ArrayList<>();
	A.print2(list2);
	list2.add(5);
}
}

class A{
	
	void print(List<? extends Number> list) {
		for(Object o: list )
		System.out.println(o);
	}
	
	<T extends Number> void print1(List<T> list) {
		for(T o: list )
		System.out.println(o);
	}
	
	static void print2(List<? super Integer> a) {// Integer, Number, Object
		//write operation can be done
	}
}