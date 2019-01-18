package generics;

import java.util.List;

public class Demo11 {
	public static void main(String[] args) {

	}
}


class A11<T>{
	T var;
	
	void print(T obj) {
		System.out.println(obj);
	}
	
	T get() {
		return var;
	}
	
	static void print(List<?> list) {
	//	list.add(5);
		for(Object o: list) {
			System.out.println(o);
		}
	}
	 

}