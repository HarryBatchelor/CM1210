import java.util.*;
import java.io.*;

public class Encrypt{
  public static void main(String[] args) throws Exception{
    // if (args.length !=1){
    //   System.err.println("One argument expected!");
    //   System.exit(1);
    // }
    String fileName = "Secret.bin";
    try{
      FileOutputStream fileOs = new FileOutputStream(fileName);
      ObjectOutputStream os = new ObjectOutputStream(fileOs);
      os.writeInt(2048);
    }
    catch(FileNotFoundException e){
      e.printStackTsrace("file");
    }
    catch(IOException e){
      e.printStackTrace("error 1");
    }
    System.out.println("DOne Writing");
    try{
    FileInputStream fileIs = new FileInputStream(fileName);
    ObjectInputStream is = new ObjectInputStream(fileIs);
    int s = is.readInt();
    System.out.println("THis works");
    System.out.println(s);
    is.close();
  }
  catch(FileNotFoundException e){
    e.printStackTrace("file 2");
  }
  catch(IOException e){
    e.printStackTrace("error 2");
  }

  }
}
