package generics;

public class Demo7 {
	public static void main(String[] args) {
		MyType1<Integer, String> obj= new MyType1<>();
		obj.print(2, "abc");
		obj.<Integer>concat(3, "xyz", 6);
		obj.concat(3, "xyz", "ljh"); //String
		obj.concat(5, "asd", 5);
		obj.add(4, 5);
		MyType1.<Integer>print(4);
		MyType1.print("abc");
	}
}

class MyType1<T1, T2>{
	
	public void print(T1 a, T2 b) {
		System.out.println(a.getClass());
		System.out.println(b.getClass());
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	//In a generic method, type information should
	//be included before return type.
	public <T3> void concat(T1 a, T2 b, T3 c) {
		System.out.println(a+""+b+""+c);
	}
	
	public static <T4> void print(T4 obj) {
		System.out.println(obj.getClass());
	}
}