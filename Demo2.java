package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();//compile time
	list.add("abc");//instead of runtime error
	
	for(Integer i: list) { //No typecasting required
		System.out.println(i); 
	}
}
}

