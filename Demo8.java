package generics;

public class Demo8 {
	public static void main(String[] args) {
	//	A8<String, String> obj= new A8();
		
		A8<Integer> obj1= new A8<>();
		
		A8<Number> obj2= new A8<>();
	}
}
//Bounded Type parameter
//Restrict: Numeric data type
class A8<T1 extends Number>{
	public void add(T1 a, T1 b) {
		System.out.println(a+""+b);
	}
}