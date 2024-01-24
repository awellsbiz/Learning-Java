class A {

  int age;

  public void show() {
    System.out.print("in show");
  }

  static class B {
    public void config() {
      System.out.println("in Config");
    }
  }
}

public class InnerClass {
  public static void main(String a[]) {
    A obj = new A();
    obj.show();

    // A.B obj2 = obj.new B();
    // obj2.config();

    A.B obj2 = new A.B(); // only can use this syntax when you have the inner class is static
    // when would a person want a static class? well its a design choice - aimed at
    // enhancing encapsulation -
    // if a class is only useful to one class- keep them together - encapsulate it
    // because of reveantcy.
  }

}

// :::Anonymous Inner class- can use if you want to use an abstract class and
// not wnat to creat a whole new class use and anonymous class.

// A noName = new A()
// {
// public void show(){
// System.out.println("in new show");
// }
// }