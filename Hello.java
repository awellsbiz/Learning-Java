//::: THIS IS THE FLOW OF INFORMATION ::::

// Developer authors the .java code then 'javac' is the compiles it to Bytecode for the JVM (Java Virtual machine that sits on top of the OS- witch is inside of the JRE(java runtime enviroment) [with frameworks inbetween them])

// by default jvm is part of jre and inside you will have libraries. jvm is responsible for running things. 

// Write Once and Run Anywhere (WORA)

//So JVM is always looking for a file inorder to begin running the code and that is the code below. Run this with JVM and it will creat a .class folder.
// then a dev is able to run java <class name> and it will spit out the print statement


class Hello
{
    public static void main(String a[])
      {
        int num = 3;
        int num2 = 5;
        int result = num * num2;

        System.out.println(result);
        
      }

  
// Database is persistane storage (perminate)
//during processing you need to store data for temporary purposes- so you stor it in a variable its like a box. and variables have types. 
//Java is a strongly typed language
//everytinme you make a change you have to complie and then run. 

//println = print new line


//:::DATA TYPES:::

//::PRIMITIVE:::

    //1. integer- has different sizes. 1 int is equal to 4 bytes. long is 8 bytes. if you want to save space you go for short whitch is 2 bytes. a byte is a byte.
        // byte, short, ints, long( long needs and l flag after the number)

    //2. float- only takes 4 bytes. double takes 8 bytes- float is actually 8 bytes
        //double, float
        //to define that it is a float you need an f flag at the end -- float num = 6.7f - double is default when using float type. 

    {
      float marks = 6.7
    }

    //3. characters - is 2 bytes -- java supports unicode 
      //char c = 'k';


    //4. booleans- used for conditions and such. 
        //true or false

      //boolean b = true;


}


