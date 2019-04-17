import java.io.*;
import java.util.*;
public class Stopwords{
  public static void main(String[] args) {
    ArrayList<String> stopwords = new ArrayList<String>();
    try{
      Scanner s1 = new Scanner(new File("stopwords.txt"));
          while(s1.hasNext()){
            stopwords.add(s1.next());
          }
          s1.close();
      // System.out.println(stopwords);
}
  catch(IOException e){
    System.out.println("Error 1");
  }
      ArrayList<String> gpt2 = new ArrayList<String>();
      try{
      Scanner s = new Scanner(new File("GPT2.txt"));
      while (s.hasNext()){
          gpt2.add(s.next());
      }
      s.close();
      // System.out.println(gpt2);
    }
    catch(IOException e){
      System.out.println("Error 2");
    }

gpt2.removeAll(stopwords);
System.out.println(gpt2);

}
}
