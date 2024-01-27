// interface Computer {
//   int age = 66; // final and static

//   public void code();
// }

// class Laptop implements Computer {
//   public void code() {
//     System.out.println("code compile run in laptop ");
//   }
// }

// class Desktop implements Computer {
//   public void code() {
//     System.out.println("code compile run in desktip");
//   }
// }

// class Developer {
//   public void devApp(Computer lap) {
//     lap.code();
//   }
// }

// class C implements Computer // with implements you only get methods not variables. thats why its static and
//                             // finaal beacuse interface dosent have own memory in heap.
// {
//   public void code() {
//     System.out.println("from C ");
//   }
// }

// public class Interface {

//   public static void main(String a[]) {
//     Computer lap = new Laptop();
//     Computer desk = new Desktop();

//     Developer ajay = new Developer();
//     ajay.devApp(desk);

//     Computer mac;

//     mac = new C();
//     mac.code();

//   }
//}

// instead of creating an abstract class you can create an Interface- by default
// its public abstract- like a class but by default all methoids ar public
// abstract.
// its not a class- cannot instanciate it
// create an interface for a design- gives the path/ directions- tell us (
// classes ) the methods we need

// class -> class = extendte
// class -interface -> implements
// interfact - interface -> extends

// you can implement more than one interfactes with a class ::: implements
// y,c::::

// ::::Enums ::::::

// enum Status
// {
// running, Failed, Pending, Success;
// }

// public class Demo
// {
// public static void main( String a [])
// [
// int i = 5;
// Status s = Status.Running; //prints running

// Status[] ss = Status.value();

// for (Status s : ss)
// {
// System.out.println(s);
// }
// ]
// }

// you can pass arguemnets with the objevts in the enums class. then create a
// constructor.

// Lambda expression
// @FunctionalInterface
// interface a{
// void show()
// }
// public class Demo{

// publick static void main (String a [])
// {
// //A obj = () -> System.out.println("...");
// obj.show()
// }
// }

// lambda expression only works with a functional interface

// Diufferent type of interfaces(only declare methods automically public
// abstract ):

// 1.Normal- multiple methods

// 2. functiona interface /SAM -Single Abstract Method-

// 3. Marks- blank interface- why? to update something to the compiler.
// Civilaization you can take a obj and it had diff variables if you can save in
// hard drive. Deserilization you can import thos saved values into the heap
// when its called back ( re-complied again )

// :: Different errors ::

// 1. complie time error
// 2. runtime error - execution normally stops. -> exception and need to handle
// the exceptions- is a try catch block- you can have more than one catch block ad be specific with Exception class like (ArithmicticException e ). Excetion is a parent class - put st end

//inside of a catch block you can handle exception like calling another datatbsase or setingthe variable to another value or whatever. 
// 3.logical errror - testing- checking inputs and out puts.

//use extends Exeption to create your own exception. 
//use super to pass a an argument. 

public class Interface {
  public static void main(String a[]) {
    int i = 9;
  }
}