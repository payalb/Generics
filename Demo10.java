package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo10 {
	public static void main(String[] args) {
		A10 obj= new A10();
		List<Integer> list= new ArrayList<>();
		obj.print(list);
	}
}
//superclass of Integer: Number| Object| Integer
class A10{
	//PECS rule: Producer extends Consumer super
	 /*void print(List<? super Integer> a) {
		System.out.println(a.getClass());
	}*/
	//We cannot add any element to this list: reading purpose
	<T extends Number> void print(List<T> a) { //Number, Integer, Float, 
		//a.add(10.9f);
		for(Number o: a) {
			System.out.println(o);
		}
	}
}