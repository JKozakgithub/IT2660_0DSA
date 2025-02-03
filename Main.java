//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Julie Kozak
 */

 public class Main {
  public static void main(String[] args) 
  {
    int [] hwarray = {5, 9, 3, 12, 7, 3, 11, 5};
    System.out.println("hello, world!");
    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    System.out.println("The max value is" + Lab1.max(1,2));
    System.out.println("The min value is " + Lab1.min(7,5));

  }
  
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public static int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
  public static int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

}