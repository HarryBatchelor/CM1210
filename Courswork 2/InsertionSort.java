import java.io.*;
import java.util.*;
public class InsertionSort{
  public static void main(String[] args) throws FileNotFoundException {
      Scanner s = new Scanner(new File("GPT2.txt"));
      ArrayList<String> Unsorted = new ArrayList<String>();
      while (s.hasNextLine())
          Unsorted.add(s.next().toLowerCase().replaceAll("[^A-Za-z0-9]", ""));
      s.close();

      String[] Text = Unsorted.toArray(new String[Unsorted.size()]);
  for(int i = 1; i < Text.length; i++){
    String key = Text[i];
    int j = i - 1;
    while(j >= 0){
    if(key.compareTo(Text[j]) > 0 ){
      break;
    }
    Text[j + 1] = Text[j];
    j--;
  }
  Text[j+1] = key;
}

System.out.println(Text);
}
}
