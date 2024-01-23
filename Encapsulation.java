
class Human {
  private String name; // instance variable - non-static (meaning that they can have more than one
                       // copy-- [static means there is only one copy regardless of howm mant instances
                       // there is of it]) variables which are defined in a class outside any method,
                       // constructor or a block
  private int age; // instance variable -- stored in heap w address-- if you want to perform an
                   // operation do it in a method dont do it in and instance

  // constructor looks like a method itself. -- special method that never
  // returns--everytime you create a new obj you create a new consrtuctor
  // anything-- can so whatever inside.

  public Human() { // -- default constructor -- constuctor -- writes connections to the DB in side
                   // of the constructor.
    System.out.println("in constructor");
    age = 12;
    name = "John Doe";
  }

  public Human(int a, String name)// paramatized constructor
  {
    age = a;
    this.name = name;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() { // getter
    return name;
  }

  public void setAge(int age) { // setter
    this.age = age;// to mention that its an instance variable you ahve to use this.the key word
                   // this reps the current object.
  }

  public int getAge() {
    return age;
  }

}

public class Encapsulation {
  public static void main(String a[]) {
    Human banana = new Human();// storing in stack memory-- creating a blank objcet in heap memort
    // banana.setName("Banana");
    // banana.setAge(7);
    Human cheese = new Human(65, "Cheese");

    System.out.println(banana.getName() + " : " + banana.getAge());
    cheese.setAge(54);
    System.out.println(cheese.getName() + " : " + cheese.getAge());

  }

}

// make every instance / variable private when creating a class.- encapsulation/
// makine sure that its restricted and only to be used by its own methods.

// every class in java extends the Object class.

// super() -- when caled inside of a construtor - performs the constructor
// method of the super class. if a perameter is passed then it performs that one
// whuch has a parameter

// this()-- when used in a constructor calls the constructor(default
// constructor) of the local class
