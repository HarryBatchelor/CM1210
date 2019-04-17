import java.util.*;
import java.io.*;



public class AddPlayer{
  private String playerID;
  private String playerName;
  private String careerTries;
  private String teamName;
  private String teamID;
  private String stadiumName;
  private String stadiumStreet;
  private String stadiumTown;
  private String stadiumPostcode;

Scanner scanner = new Scanner(System.in);
public void playerAdd(){
  boolean valid = false;

  while(valid == false){
  System.out.println("Enter players name: ");
  playerName = scanner.nextLine();
  if(playerName.matches("[A-Za-z]+[\\s][A-Za-z]+")){
    valid = true;
  }
  else{
    System.out.println("Invalid input. Please enter a first and last name seperated by a space");
  }
}
  valid = false;
  while(valid == false){
  System.out.println("Enter players ID");
  playerID = scanner.nextLine();
  if(playerID.matches("RFU[\\d]{5}")){
    valid = true;
}
else{
  System.out.println("Invalid input. Please enter 'RFU' followed by 5 digits");
}
}
  valid = false;
  while(valid==false){
  System.out.println("Enter career tries scored");
  careerTries = scanner.nextLine();
  if(careerTries.matches("[\\d]+")){
    valid = true;
  }
  else{
    System.out.println("Invalid input. Please enter at least one digit");
  }
}
  valid = false;
  while(valid == false){
  System.out.println("Enter team name");
  teamName = scanner.nextLine();
  if(teamName.matches("[A-Za-z][A-Za-z ]+")){
    valid = true;
  }
  else{
    System.out.println("Invalid input. Please enter at least one character with no numbers or special characters");
  }
  }
  valid = false;
  while(valid == false){
  System.out.println("Enter team ID");
  teamID = scanner.nextLine();
  if(teamID.matches("[A-Z]{3}[\\d]{4}")){
    valid = true;
  }
  else{
    System.out.println("Invalid input. Please enter 3 Upper case letters then 4 digits");
  }
  }
  valid = false;
  while(valid == false){
  System.out.println("Enter stadium name");
  stadiumName = scanner.nextLine();
  if (stadiumName.matches("[A-Za-z][A-Za-z ]+")){
    valid = true;
  }
  else{
    System.out.println("Invalid input. Please enter at least one character with no numbers or special characters.");
  }
}
  valid = false;
  while(valid == false){
  System.out.println("Enter stadium street");
  stadiumStreet = scanner.nextLine();
  if (stadiumStreet.matches("[\\w][\\w ]+")){
    valid = true;
  }
  else{
    System.out.println("Invalid input. Please enter at least one character with no special characters.");
  }
}
  valid = false;
  while (valid == false){
  System.out.println("Enter stadium town");
  stadiumTown = scanner.nextLine();
  if (stadiumTown.matches("[A-Za-z ]+")){
    valid = true;
  }
  else{
    System.out.println("Invalid input. Please enter at least one letter with no numbers of special characters");
  }
}
  valid = false;
  while (valid == false){
  System.out.println("Enter stadium postcode");
  stadiumPostcode = scanner.nextLine();
  if (stadiumPostcode.matches("[A-Z][\\d][A-Z]{3}")){
    valid = true;
  }
  else{
    System.out.println("Invalid input. Please enter A letter, digit and 3 more letters");
  }
}
  String newPlayerInput = (playerName + ", " + playerID + ", " + careerTries + ", " + teamName + ", " + teamID + ", " + stadiumName + ", " + stadiumStreet + ", " + stadiumTown + ", " + stadiumPostcode);
  try{
    FileWriter fw = new FileWriter("details.txt", true);
    PrintWriter pw = new PrintWriter(fw);

    pw.println(newPlayerInput);
    pw.close();
  }
  catch(IOException e){
    System.out.println("Error writing to file");
  }
}
}
