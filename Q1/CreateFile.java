import java.util.*;
import java.io.*;

public class CreateFile{
  public void File(){
    Scanner scanner = new Scanner(System.in);
    String newFileName;

    System.out.println("What is the name of the new file?");
    newFileName = scanner.nextLine();
try{
    FileWriter fw = new FileWriter(newFileName + ".txt");
    PrintWriter pw = new PrintWriter(fw);
    System.out.println(newFileName +" created");
  }
  catch(IOException e){
    System.out.println("Error creating new file");
  }
  }
}
