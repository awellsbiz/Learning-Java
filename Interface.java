interface Computer {
  public void code();
}

class Laptop implements Computer {
  public void code() {
    System.out.println("code compile run in laptop ");
  }
}

class Desktop implements Computer {
  public void code() {
    System.out.println("code compile run in desktip");
  }
}

class Developer {
  public void devApp(Computer lap) {
    lap.code();
  }
}

public class Interface {

  public static void main(String a[]) {
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    Developer ajay = new Developer();
    ajay.devApp(desk);
  }
}

// instead of creating an abstract class you can create an Interface- by default
// its public abstract- like a class but by default all methoids ar public
// abstract.
// its not a class- cannot instanciate it
// create an interface for a design- gives the path/ directions- tell us (
// classes ) the methods we need