class Student {
  int id;
  String name;
  int grade;

}

public class Array {
  public static void main(String a[]) {
    // int nums[] = { 3, 4, 6, 7 };

    // for (int i = 0; i <= 3; i++)
    // System.out.println(nums[i]);

    // int nums[][] = new int[3][4];

    // for (int i = 0; i < 3; i++) {
    // for (int j = 0; j < 4; j++) {
    // // System.out.println(nums[i][j]);
    // System.out.print(nums[i][j] + " "); // 2 dimensional array- for it to come
    // ouy in a box. we took lthe ln out of
    // // print and concated a space after the number.

    // }
    // System.out.println();

    // }

    Student kelvin = new Student();
    kelvin.id = 101;
    kelvin.name = "kelvin";
    kelvin.grade = 65;

    Student darwin = new Student();
    darwin.id = 101;
    darwin.name = "darwin";
    darwin.grade = 65;

    Student chelsea = new Student();
    chelsea.id = 101;
    chelsea.name = "chelsea";
    chelsea.grade = 65;

    Student Ben = new Student();
    Ben.id = 101;
    Ben.name = "Ben";
    Ben.grade = 65;

    Student studentList[] = new Student[4];
    studentList[0] = darwin;
    studentList[1] = chelsea;
    studentList[2] = Ben;
    studentList[3] = kelvin;

    for (int i = 0; i < studentList.length; i++) {
      System.out.println(studentList[i].name + " : " + studentList[i].grade);
    }

    for (Student student : studentList) {
      System.out.println(student.name + " : " + student.id);
    }

  }
}
