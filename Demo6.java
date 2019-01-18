package generics;

public class Demo6 {
	public static void main(String[] args) {
		MyType<Integer, String, Integer> obj= new MyType<>();
		obj.print(2, "abc");
		obj.concat(3, "xyz", 6);
		obj.add(4, 5);
	}
}

class MyType<T1, T2, T3>{
	
	public void print(T1 a, T2 b) {
		System.out.println(a.getClass());
		System.out.println(b.getClass());
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void concat(T1 a, T2 b, T3 c) {
		System.out.println(a+""+b+""+c);
	}
}