import java.io.*;
import java.util.*;
public class InsertionSort{
  public static void main(String[] args) throws FileNotFoundException {
    long start = System.currentTimeMillis();
    System.out.println("Start: " + start);
      Scanner s1 = new Scanner(new File("GPT2.txt"));
      ArrayList<String> Unsorted = new ArrayList<String>();
      while (s1.hasNext())
          Unsorted.add(s1.next().toLowerCase().replaceAll("[^A-Za-z0-9]", ""));
      s1.close();

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

// System.out.println(Text);
long finish = System.currentTimeMillis();
System.out.println("Finish : " + finish);
long elapsedTime = finish - start;
System.out.println("This insertion sort algorithm took roughly: " + elapsedTime + " milliseconds to complete");
}
}
