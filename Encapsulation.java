class Human {
  private String name;
  private int age;

  public void setName(String n) {
    name = n;
  }

  public String getName() { // getter
    return name;
  }

  public void setAge(int a) { // setter
    age = a;
  }

  public int getAge() {
    return age;
  }

}

public class Encapsulation {
  public static void main(String a[]) {
    Human banana = new Human();
    banana.setName("Banana");
    banana.setAge(7);

    System.out.println(banana.getName() + " : " + banana.getAge());

  }

}

// make every instance / variable private when creating a class.- encapsulation/
// makine sure that its restricted and only to be used by its own methods.
