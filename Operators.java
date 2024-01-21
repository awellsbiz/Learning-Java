class Operators 
{
  public static void main ( String args[] ) 
  {
    int num = 9;
    //int num2 = 5;

    // int result = num1 % num2;

   // num1--; decrement 
   // num1++; // post increment
   //++num1; // pre increment
   // num1 *= 2; // multiplication
   //num1 /= 2; // dvivision- dosnt give the remainder
   //num1 %= 2; //modular

   // int result = num++; //first it will fetch the value then increment and make it 10

   //int result = ++num // it will increment then fetch the valu

    // System.out.println(result);

    //::::::RELATIONAL OPERATORS:::::

    // == is how you compare what is equal
    // != is compare what is not equal

    // int x = 6;
    // int y = 2;

    //boolean result = x < y; //false
    // boolean result = x > y; //true

    // System.out.println(result);


    //:::::Logical operators::::::

    // & - and- if there is one false present it will return false  // | or- if there is one true ptresent it will return true // ! not


    // && -- || :::SHORT CIRCUTS::::
      // || or -- if you have one true it will return true. so it will only check if the first condition is true( hence short circut )
      // && and -- if the first one is false it would not check. 


      int x = 7;
      int y = 5;
      int a = 5;
      int b = 9;

      //boolean result = x > y && a < b; //true
      boolean result = a > b;

      System.out.println(!result); // expecting the oposite
  }
}