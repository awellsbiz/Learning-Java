class Calculator {

  int a;// create a variable if needed- property

  public int add(int num1, int num2) // creating a method- behavior
  {
    int r = num1 + num2;
    System.out.println("in add");
    return r;
  }
}

public class Objects {
  public static void main(String a[]) {
    int num1 = 4;
    int num2 = 2;

    Calculator calc = new Calculator(); // this is how you create the objects. first you mention Calculator then the
                                        // variable name "calc" then new - and the design "Calculator"

    // calc.add();
    int result = calc.add(num1, num2);

    System.out.println(result);
  }

}

// OOP

// Object - Property and Behavior

// to create an object you need to first create a class- which is a blueprint. -
// class gets compiled to byte code
//

// Class
