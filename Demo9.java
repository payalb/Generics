package generics;

import java.io.Serializable;

public class Demo9 {

}
//Cloneable, Serializble, Number
class A9<T1 extends Number & Cloneable & Serializable>{
	
	void add(T1 a, T1 b) {
		System.out.println(a+ ""+ b);
	}
}