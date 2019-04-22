import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSortLou {

  public static void main(String[] args) throws FileNotFoundException {

    long start = System.nanoTime();
    System.out.println("Start : " + start);
    Scanner s1 = new Scanner(new File("GPT2.txt"));
    ArrayList<String> GPT2 = new ArrayList<String>();

    while (s1.hasNextLine())
      GPT2.add(s1.next().toLowerCase().replaceAll("[^A-Za-z0-9]", ""));
    s1.close();

    String[] Text = GPT2.toArray(new String[GPT2.size()]);

    for(int i = 1; i < Text.length; i++) {

      String key = Text[i];
      int j = i - 1;
      while(j >= 0) {
        if(key.compareTo(Text[j]) > 0) {
          break;
        }
        Text[j + 1] = Text[j];
        j--;
      }
      Text[j + 1] = key;

    }
    // return Arrays.toString(Text);
    // System.out.println(Arrays.toString(Text));
    long end = System.nanoTime();
    System.out.println("  End : " + end);

    long elapsedTime = end - start;

    System.out.println("This implementation of an insertion sort algorithm took approx: " + elapsedTime + " nanoseconds");
    //System.out.println(Arrays.toString(Text));
  }
}
