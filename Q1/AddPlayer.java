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
  System.out.println("Enter players name: ");
  playerName = scanner.nextLine();

  System.out.println("Enter players ID");
  playerID = scanner.nextLine();

  System.out.println("Enter career tries scored");
  careerTries = scanner.nextLine();

  System.out.println("Enter team name");
  teamName = scanner.nextLine();

  System.out.println("Enter team ID");
  teamID = scanner.nextLine();

  System.out.println("Enter stadium name");
  stadiumName = scanner.nextLine();

  System.out.println("Enter stadium street");
  stadiumStreet = scanner.nextLine();

  System.out.println("Enter stadium town");
  stadiumTown = scanner.nextLine();

  System.out.println("Enter stadium postcode");
  stadiumPostcode = scanner.nextLine();

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
