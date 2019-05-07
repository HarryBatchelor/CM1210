import java.io.*;
import java.util.*;
public class Sorting{
  static int comparisons;
  static int moves;
  public static void main(String[] args) {
    try{
      List<String> dataFull = Data("GPT2.txt");

    for (int i = 100; i <= 500; i += 100){
      if (i> dataFull.size()){
        i = dataFull.size();
      }
    List<String> data = new ArrayList<String>(dataFull.subList(0, i));

    comparisons = 0;
    moves = 0;

    long startInsertion = System.nanoTime();
    List<String> DoneInsertion = InsertionSort(data);
    long endInsertion = System.nanoTime();
    long durationInsertion = (endInsertion - startInsertion);
    System.out.println("INSERTION SORT");
    System.out.println("Number of words in insertion sort: " + Integer.toString(data.size()));
    System.out.println("Number of Comparisons: " + Integer.toString(comparisons));
    System.out.println("Number of Moves: " + Integer.toString(moves));
    System.out.println("Time taken: " + Long.toString(durationInsertion) + " Nano seconds");

    comparisons = 0;
    moves = 0;

    long startMerge = System.nanoTime();
    List<String> DoneMerge = mergeSort(data);
    long endMerge = System.nanoTime();
    long durationMerge = (endMerge - startMerge);
    System.out.println("MERGE SORT");
    System.out.println("Number of words in Merge sort: " + Integer.toString(data.size()));
    System.out.println("Number of Comparisons:" + Integer.toString(comparisons));
    System.out.println("Number of Moves:" + Integer.toString(moves));
    System.out.println("Time taken:" + Long.toString(durationMerge) + " Nano seconds");
}
}
catch(FileNotFoundException e){
  System.out.println("File not found");
}
}

public static List<String> Data(String path) throws FileNotFoundException{
  List<String> text = new ArrayList<String>();
  try{
    File fileIn = new File(path);
    Scanner s1 = new Scanner(fileIn);
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
    throw e;
  }
}


public static List<String> InsertionSort(List<String> UnsortedInsertion) {
      String[] Words = UnsortedInsertion.toArray(new String[UnsortedInsertion.size()]);
  for(int i = 1; i < Words.length; i++){
    String key = Words[i];
    int j = i - 1;

    while(j >= 0){
      comparisons++;
    if(key.compareTo(Words[j]) > 0 ){

      break;

    }
    moves++;
    Words[j + 1] = Words[j];
    j--;
  }
  Words[j+1] = key;
}
return UnsortedInsertion;
}

public static List<String> mergeSort(List<String> UnsortedMerge){
  List<String> text = new ArrayList<String>(UnsortedMerge);
  if (text.size() <= 1) {
      comparisons++;
      return text;
  }

  List<String> Left = new ArrayList<String>();
  List<String> Right = new ArrayList<String>();
  int i = 0;
  for (String word : text) {
      comparisons++;
      if (i < text.size()/2) {
          Left.add(word);
          moves++;
      } else {
          Right.add(word);
          moves++;
      }
      i++;
  }

  Left = mergeSort(Left);
  Right = mergeSort(Right);
  return merge(Left, Right);
  }

public static List<String> merge(List<String> Left, List<String> Right) {
    List<String> merging = new ArrayList<String>();
    while (Left.size() > 0 && Right.size() > 0) {
        comparisons++;
        if (Left.get(0).compareTo(Right.get(0)) < 0) {
            merging.add(Left.get(0));
            Left.remove(0);
            moves++;
        } else {
            merging.add(Right.get(0));
            Right.remove(0);
            moves++;
        }
    }

    while (Left.size() != 0) {
        comparisons++;
        merging.add(Left.get(0));
        Left.remove(0);
        moves++;
    }

    while (Right.size() != 0) {
        comparisons++;
        merging.add(Right.get(0));
        Right.remove(0);
        moves++;
    }
    return merging;
}
}
