import java.io.*;
import java.util.*;
public class Sorting{
  static int comparisons;
  static int moves;
  public static void main(String[] args) {
    try{
      List<String> txtFile = enterData("GPT2.txt");

    for (int i = 100; i <= 1000; i += 100){

    List<String> data = new ArrayList<String>(txtFile.subList(0, i));

    comparisons = 0;
    moves = 0;

    long startInsertion = System.currentTimeMillis();
    List<String> DoneInsertion = InsertionSort(data);
    long endInsertion = System.currentTimeMillis();
    long durationInsertion = (endInsertion - startInsertion);
    System.out.println("INSERTION SORT");
    System.out.println("Number of words in insertion sort: " + Integer.toString(data.size()));
    System.out.println("Number of Comparisons:" + Integer.toString(comparisons));
    System.out.println("Number of Moves:" + Integer.toString(moves));
    System.out.println("Time taken:" + Long.toString(durationInsertion) + "milliseconds");

    // comparisons = 0;
    // moves = 0;
    //
    // long startMerge = System.currentTimeMillis();
    // List<String> DoneMerge = mergeSort(data);
    // long endMerge = System.currentTimeMillis();
    // long durationMerge = (endMerge - startMerge);
    // System.out.println("MERGE SORT");
    // System.out.println("Number of words in Merge sort: " + Integer.toString(data.size()));
    // System.out.println("Number of Comparisons:" + Integer.toString(comparisons));
    // System.out.println("Number of Moves:" + Integer.toString(moves));
    // System.out.println("Time taken:" + Long.toString(durationMerge) + "milliseconds");
}
}
catch(FileNotFoundException e){
  System.out.println("File not found");
}
}

public static List<String> enterData() throws FileNotFoundException{
  List<String> text = new ArrayList<String>();
  try{
    Scanner s1 = new Scanner(new File("GPT2.txt"));
    while (s1.hasNext()){
      String word = s1.next().toLowerCase().replaceAll("[^A-Za-z0-9]", "");
      if(!text.contains(text) && word.length() > 3){
        text.add(word);
      }
      if (text.size() >= 1000){
        break;
      }
    }
    s1.close();
    return text;
  }
  catch(FileNotFoundException e){
    System.out.println("File not found");
  }
}


public static List<String> InsertionSort(List<String> Unsorted) {
      String[] Words = Unsorted.toArray(new String[Unsorted.size()]);
  for(int i = 1; i < Words.length; i++){
    String key = Words[i];
    int j = i - 1;
    while(j >= 0){
    if(key.compareTo(Words[j]) > 0 ){
      break;
    }
    Words[j + 1] = Words[j];
    j--;
  }
  Words[j+1] = key;
}

}
}
