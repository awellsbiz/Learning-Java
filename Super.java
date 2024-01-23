class A {
  public A() {
    System.out.println("im in A");
  }
}

class B extends A {
  public B() { // this is the default constructor
    System.out.println("i am in b");
  }
}

public class Super {
  public static void main(String a[]) {
    A obj = new B();
  }
}

// final - means constant ( const in JS ) when used with variable.
// final - whe used with class it stops inheritance.
// final - when used with method you stop method over riding.
