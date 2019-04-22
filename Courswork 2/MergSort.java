import java.io.*;
import java.util.*;
public class MergSort{
  public static void main(String[] args) throws FileNotFoundException {
    long start = System.currentTimeMillis();
    System.out.println("Start: " + start);
      Scanner s1 = new Scanner(new File("GPT2.txt"));
      ArrayList<String> Unsorted = new ArrayList<String>();
      while (s1.hasNext())
          Unsorted.add(s1.next().toLowerCase().replaceAll("[^A-Za-z0-9]", ""));
      s1.close();
