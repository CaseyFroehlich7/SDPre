import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    java.util.Scanner scanner = new java.util.Scanner(System.in);
      Scanner keyboard = new Scanner(System.in);

      int intInput1 = 1, intInput2 = 7, intInput3 = 5;
      double doubleInput1 = 1.1,  doubleInput2 = 2.2, doubleInput3 = 3.3;

      System.out.print("Please enter the first whole number you would like to add.");
      intInput1 = keyboard.nextInt();
      System.out.println(intInput1);

      System.out.print("Please enter the second whole number you would like to add.");
      intInput2 = keyboard.nextInt();
      System.out.println(intInput2);

      System.out.print("Please enter the third whole number you would like to add.");
       intInput3 = keyboard.nextInt();
      System.out.println(intInput3);

      System.out.print("Please enter the first decimal you would lke to add.");
      doubleInput1 = keyboard.nextDouble();
      System.out.println(doubleInput1);

      System.out.print("Please enter the second decimal you would like to add.");
      doubleInput2 = keyboard.nextDouble();
      System.out.println(doubleInput2);

      System.out.print("Please enter the third decimal you would like to add.");
      doubleInput3 = keyboard.nextDouble();
      System.out.println(doubleInput3);

      int sum = intInput1 + intInput2 + intInput3;
      double sum2 = doubleInput1 + doubleInput2 + doubleInput3;
      System.out.println("The sum of " + intInput1 + " + " + intInput2 + " + " + intInput3 + " = " + sum);
      System.out.println("The sum of " + doubleInput1 + " + " + doubleInput2 + " + " + doubleInput3 + " = " + sum2);



      scanner.close();

  }
}
