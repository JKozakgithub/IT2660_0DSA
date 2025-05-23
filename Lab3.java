public class Main {
  // Student: Julie Kozak
  //Lab 3
  // Class: IT 2660 Data Structures and Algorithms
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    String bestCase = "A";

    // * Initialize startTime here
    long startTime = System.nanoTime();
    int index = match(text, bestCase);
    // * Initialize endTime here
    long endTime = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTime = endTime - startTime;
    System.out.println("The elapsed time for the BEST case scenario is: " + elapsedTime + "nanoseconds");
    
    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");   

    String worstCase = "_";
    
    // * Initialize startTime here
    long startTimeW = System.nanoTime();
    index = match(text, worstCase);
    // * Initialize endTime here
    long endTimeW = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTimeW = endTimeW - startTimeW;
    System.out.println("The elapsed time for the WORST case scenario is " + elapsedTimeW + "nanoseconds");
    
    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");  
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}
