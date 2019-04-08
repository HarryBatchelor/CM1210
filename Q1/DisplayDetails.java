import java.util.*;
import java.io.*;

public class DisplayDetails{
  public void ShowPlayers(){
    try{
    FileReader fr = new FileReader("details.txt");
    BufferedReader br = new BufferedReader(fr);

    String str;
    while((str = br.readLine()) != null)
    {
      System.out.println(str + "\n");
    }
    br.close();
  }
  catch(IOException e){
    System.out.println("File not found");
  }
  }
}
