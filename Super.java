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

// :::Abstract keyowrd::::
// when you are not sure how you want to implement a method or want another
// child class to do it you can use abstraction key word. You need to make the
// class abstract and the method inorder to declare the method. - this make it
// override the method.
// cannot create a obj of an abstract class- must create a concreat class
// you will have to override the method in child class.
// public adstract void drive()