import java.util.*;
import java.io.*;
public class DeletePlayer{
  public ArrayList<String> allPlayersArray = new ArrayList<String>();
  public ArrayList<String> ArraytoWrite = new ArrayList<String>();
  private String fileChoice;
  Scanner scanner = new Scanner(System.in);
  public void delete(){
    int pickDelete;
    String player;
    int index = 1;
    try{
      FileReader fr = new FileReader("details.txt");
      BufferedReader br = new BufferedReader(fr);
      while ((player = br.readLine()) != null){
        allPlayersArray.add(player);
      }
      br.close();
    }
    catch(IOException e){
      System.out.println("Error writing to file");
    }
    for(String Rugby: allPlayersArray){
      System.out.println(Integer.toString(index) + ")" + Rugby);
      index = index + 1;
    }
    System.out.println("Select a player to remove");
    pickDelete = Integer.parseInt(scanner.nextLine());
    pickDelete = pickDelete -1;

    try{
      FileWriter fw = new FileWriter("details.txt", true);
      PrintWriter pw = new PrintWriter(fw);
      int size = allPlayersArray.size();
      for(int i=0; i < size; i++){
        if( i != pickDelete){
          ArraytoWrite.add(allPlayersArray.get(i));
        }
      }
      pw.close();
      System.out.println(size);
    }
    catch(IOException e){
      System.out.println("Error deleting player");
    }
    try{
      FileWriter fw = new FileWriter("details.txt");
      PrintWriter pw = new PrintWriter(fw);
      int size = ArraytoWrite.size();
      for(int i = 0; i< size; i++){
        pw.println(ArraytoWrite.get(i));
      }
      pw.close();
      System.out.println("Player deleted");
    }
    catch(IOException e){
      System.out.println("Error deleting player");
    }
  }
}
