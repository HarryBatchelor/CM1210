import java.util.*;
import java.io.*;


public class Percussion{

  private String type;
  private String name;
  private int weight;
  private boolean inTune;

  Scanner scanner = new Scanner(System.in);

  public void percussionInput(){
  boolean valid = false;
  while(valid == false){
    System.out.println("Select catagory for percussion");
    type = scanner.nextLine();
    if(type.matches("drum triangle Drum Triangle")){
      valid = true;
    }
    else{
      System.out.println("Invalid input. Please select Trumpet or Tuba");
    }
  }
}
}
