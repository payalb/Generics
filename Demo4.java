package generics;

public class Demo4 {
	public static void main(String[] args) {
		Box b= new Box();
		b.set("Payal");
		int i= (int)b.get();
	}
}//ClassCastException

class Box {
	private Object o;

	public void set(Object o) {
		this.o = o;
	}

	public Object get() {
		return o;
	}
}