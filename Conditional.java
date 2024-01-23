// ::CONDITIONAL STSTMENTS::
//

class Conditionals {
  public static void main( String[] args)
  {
    // int x = 70;
    // int y = 60;
    // int z = 65;

    // if (x > y)
    // {
    //   System.out.println(x);
    //   System.out.println("Thanks");
    // }
    // else
    //   System.out.println(y);

// you can use if, if else and else - just like in javascript. 
//need curly brackets when you have more than one line. 
//dont need semi colan when fater if statement. 

//::::Ternerary Oprorator ::::

  // int n = 4;
  // int result = 0;

  // // if (n % 2 == 0)
  // //   result = 10;
  // // else
  // //   result = 20;

  // //ternary- ?: 

  // result =  n % 2 == 0 ? 10 : 20;

  // System.out.println(result);

  //::: Swich Statement:::

  int n = 1;

  switch(n){

    case 1:
    System.out.println("Mon");
      break;
    case 2:
    System.out.println("Tue");
    break;
    case 3:

  System.out.println("Wed");
  case 4:
  System.out.println("Thur");
  case 5:
  System.out.println("Frid");
  case 6:
  System.out.println("Sat");
  case 7:
  System.out.println("Sunday");
  default  // uses default if noe of the cases match

  // you can use an arrow to make the cases all on one line 
  // case 1 -> System.out.println("yes")

  //you can use switch case as an expression too. Well stor it in a variable
  // result = switch(day)
  //{
      //case "monday", "tueday" -> "6am"; -- no colan
      //case "monday", "tueday": yield "6am"; -- if you want to use a colan you have to use yield 
  //}


  }


  }

}
