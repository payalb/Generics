package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		
	//	List list= new ArrayList(); //ages of the people | string
		MyList obj= new MyList();
		obj.o="hello";
		obj.o= 25;
	}
	
}

class MyList{
	
	Object o;
	
	void m1(Object o) {
		
	}
	
	Object m2() {
		return o;
	}
}