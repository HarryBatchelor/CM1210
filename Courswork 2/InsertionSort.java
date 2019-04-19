import java.io.*;
import java.util.*;
public class InsertionSort{
  public static void main(String[] args) {
      ArrayList<String> Unsorted = new ArrayList<String>();
      try{
      Scanner s = new Scanner(new File("GPT2.txt"));
      while (s.hasNext()){
          Unsorted.add(s.next());
      }
      s.close();
    }
    catch(IOException e){
      System.out.println("Error");
    }
  // System.out.println(Unsorted);
}
public static void InsertionSort(int[] Unsorted){

  for(int j = 1; j < Unsorted.length; j++){
    int key = Unsorted[j];
    int i = j;
    while(i > 0 && Unsorted[i-1] > key){
      Unsorted[i] = Unsorted[i-1];
      i = i - 1;
    }
    Unsorted[i] = key;
  }

}
}
