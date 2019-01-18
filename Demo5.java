package generics;

public class Demo5 {
	public static void main(String[] args) {
		Box1<Integer> box= new Box1<>();
		box.set("abc"); //compile time check
		Integer i= box.get(); //no type casting reqd.
		
		
		Box1<String> box2= new Box1<>();	//Reusing the class for diff data types
		box2.set("abc");
		String s=box2.get();
	}
}//ClassCastException
//Type: T, Key: K, Value: V, Element :E
class Box1<abc> { //when u create an object of this class, u shud define the type for it
	private abc o;

	public void set(abc o) {
		this.o = o;
	}

	public abc get() {
		return o;
	}
}