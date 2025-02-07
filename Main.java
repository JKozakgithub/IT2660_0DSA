//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Julie Kozak
 */

public class Main {
  public static void main(String[] args) 
  {
    int[] numbs = {5,9,3,12,7,3,11,5};
    int count = 0;
    System.out.println("The first element of the array 'numbs' is "+numbs[0]);
    System.out.println("The last element of the array 'numbs' is "+numbs[7]);
    System.out.println("hello, world!");
    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    System.out.println("the max value is " + Lab1.max(10,12));
    System.out.println("the min value is " + Lab1.min(9,8));
    System.out.println("the sum of the array is " + Lab1.sum(numbs));
    System.out.println("The average of the array is " + Lab1.average(numbs));
    System.out.println("The max value of the array is " + Lab1.arraymax(numbs));
    System.out.println("The min value of the array is " + Lab1.arraymin(numbs));
    while (count < numbs.length) 
      {
      System.out.println(numbs[count]);
      count++;
    }
    for(int i = numbs.length - 1; i >= 0; i--) {
      System.out.println(numbs[i]);
    }
  
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
  public static int sum(int[] nums) {
    int thesum = 0;
    for (int x : nums) {
      thesum += x;
   
    }
    return thesum;
  }
  public static int average(int[] nums) {
    int theavg = 0;
    for (int x : nums) {
      theavg += x;
    }
    return theavg / nums.length;
  }
  public static int arraymax(int[] nums) {
    int amax = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > amax) {
        amax = nums[i];
      }
    }
    return amax;
  }
  public static int arraymin(int[] nums) {
    int amin = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < amin) {
        amin = nums[i];
      }
    }
    return amin;
  
  }
}

