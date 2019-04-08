import java.util.Scanner;
import java.io.*;
public class RugbyPlayerMenu{
  boolean exit = false;
  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    RugbyPlayerMenu menu = new RugbyPlayerMenu();
    menu.runmenu();
  }
  public void runmenu(){
    while(exit == false){
    System.out.println("(1) Show all players");
    System.out.println("(2) Add a new player");
    System.out.println("(3) Create a new file");
    System.out.println("(4) Delete a player");
    System.out.println("(5) Search a stadium by address");
    System.out.println("(6) Search player by team");
    System.out.println("(7) Display specific rugby players on the screen");
    System.out.println("(8) Exit");
    PickMenu();
  }
}
public void PickMenu(){
  int choice = 0;
  try{
    System.out.println("Enter your choice: ");
    choice = Integer.parseInt(scanner.nextLine());
  }
  catch(NumberFormatException e){
    System.out.println("\nPlease enter a number between 1-8");
  }
    switch(choice){
      case 1:
      System.out.println("\nShow all rugby players");
      DisplayDetails displayPlayers = new DisplayDetails();
      displayPlayers.ShowPlayers();
      break;

      case 2:
      System.out.println("\nAdd a new player");
      AddPlayer newPlayer = new AddPlayer();
      newPlayer.playerAdd();
      break;

      case 3:
      System.out.println("\nCreate a new file");
      break;

      case 4:
      System.out.println("\nDelete a player");
      DeletePlayer deletePlayer = new DeletePlayer();
      deletePlayer.delete();
      break;

      case 5:
      System.out.println("\nSearch a stadium by address");
      DisplayDetails searchStadium = new DisplayDetails();
      searchStadium.searchStadium();
      break;

      case 6:
      System.out.println("\nSearch players");
      DisplayDetails searchPlayers = new DisplayDetails();
      searchPlayers.searchTeamName();
      break;

      case 7:
      System.out.println("\nDisplay specific rugby players");
      DisplayDetails specificPlayer = new DisplayDetails();
      specificPlayer.loadPlayer();
      break;

      case 8:
      System.out.print("\nExit");
      exit = true;
      break;

      default:
      System.out.println("\nEnter a number between 1-8\n");
      break;
    }
  }
  }
