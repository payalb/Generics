Java Generics Wildcards
Question mark (?) is the wildcard in generics and represent an unknown type. The wildcard can be used as the type of a parameter, field, or local variable and sometimes as a return type. We can’t use wildcards while invoking a generic method or instantiating a generic class. In the following sections, we will learn about upper bounded wildcards, lower bounded wildcards, and wildcard capture.

 Java Generics Lower bounded Wildcard
Suppose we want to add Integers to a list of integers in a method, we can keep the argument type as List<Integer> but it will be tied up with Integers whereas List<Number> and List<Object> can also hold integers, so we can use a lower bound wildcard to achieve this. We use generics wildcard (?) with super keyword and lower bound class to achieve this.

We can pass lower bound or any supertype of lower bound as an argument, in this case, java compiler allows to add lower bound object types to the list.

Generics in Java was added to provide type-checking at compile time and it has no use at run time, so java compiler uses type erasure feature to remove all the generics type checking code in byte code and insert type-casting if necessary. Type erasure ensures that no new classes are created for parameterized types; consequently, generics incur no runtime overhead.

For example, if we have a generic class like below;


public class Test<T extends Comparable<T>> {

    private T data;
    private Test<T> next;

    public Test(T d, Test<T> n) {
        this.data = d;
        this.next = n;
    }

    public T getData() { return this.data; }
}
The Java compiler replaces the bounded type parameter T with the first bound interface, Comparable, as below code:


public class Test {

    private Comparable data;
    private Test next;

    public Node(Comparable d, Test n) {
        this.data = d;
        this.next = n;
    }

    public Comparable getData() { return data; }
}

Restrictions on Static Members
No static member can use a type parameter declared by the enclosing class. For example, all of the static members of this class are illegal:

class Wrong<T> {
  // Wrong, no static variables of type T.
  static T ob;
/*  w  w  w  .ja va  2s. c om*/
  // Wrong, no static method can use T.
  static T getob() {
    return ob;
  }

  // Wrong, no static method can access object of type T.
  static void showob() {
    System.out.println(ob);
  }
}
You can declare static generic methods with their own type parameters
