import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      long startTime = System.nanoTime();
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      long endTime = System.nanoTime(); 
      long duration = endTime - startTime; 
        System.out.println("Bubble sort method ran in " + duration + " nanoseconds.");
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      long startTimeB = System.nanoTime();
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      long endTimeB = System.nanoTime(); 
        
        
        long durationB = endTimeB - startTimeB; 
        System.out.println("Insertion sort method ran in " + durationB + " nanoseconds.");
        Lab4.outputList(insertionSortedList);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {

    // Step 1 - Implement insertion sort algorithm here
    for (int i = 1; i < integerList.size(); i++) { 
        int key = integerList.get(i); 
        int j = i - 1;
        while (j >= 0 && integerList.get(j) > key) {
            integerList.set(j + 1, integerList.get(j)); 
            j = j - 1;
        }
        integerList.set(j + 1, key);
    
    }
    return integerList;
  }



  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    int n = integerList.size();
    boolean swapped;

    for (int b = 0 ; b < n-1 ; b++){
        swapped = false;
        for (int c = 0; c < n - b - 1; c++){
            if (integerList.get(c) > integerList.get(c + 1)) {
                int temp = integerList.get(c);
                integerList.set(c, integerList.get(c + 1));
                integerList.set(c + 1, temp);
                swapped = true;
            }

        }
                if (swapped == false)
                break;
    }
    return integerList;
}

    
  

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
    
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
  
}
