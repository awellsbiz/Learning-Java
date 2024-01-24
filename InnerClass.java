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

    A.B obj2 = new A.B();
    obj2.config();
  }

}
