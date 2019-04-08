import java.util.*;
import java.io.*;

public class DisplayDetails{
  public ArrayList<String> allPlayersArray = new ArrayList<String>();
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
  public void searchTeamName(){
    Scanner scanner = new Scanner(System.in);
    String teamName;
    System.out.println("Enter a team name: ");
    teamName = scanner.nextLine();
try{
    FileReader fr = new FileReader("details.txt");
    BufferedReader br = new BufferedReader(fr);
    String players;

    while((players = br.readLine()) != null){
      allPlayersArray.add(players);
    }
    br.close();
  }
  catch(IOException e){
    System.out.println("Error searching file");
  }
  for(String player: allPlayersArray){
    String[] tempStringList = player.split(",");
      if(tempStringList[3].contains(teamName)){
        System.out.println(player);
      }
      else;
  }
  }
  public void searchStadium(){
    Scanner scanner = new Scanner(System.in);
    String searchAddress;
    System.out.println("Search for a stadium: ");
    searchAddress = scanner.nextLine();
try{
    FileReader fr = new FileReader("details.txt");
    BufferedReader br = new BufferedReader(fr);
    String address;

    while((address = br.readLine()) != null){
      allPlayersArray.add(address);
    }
    br.close();
  }
  catch(IOException e){
    System.out.println("Error searching file");
  }
  for(String address: allPlayersArray){
    String[] tempStringList = address.split(",");
      if(tempStringList[5].toLowerCase().contains(searchAddress.toLowerCase()) || tempStringList[6].toLowerCase().contains(searchAddress.toLowerCase()) || tempStringList[7].toLowerCase().contains(searchAddress.toLowerCase()) || tempStringList[8].toLowerCase().contains(searchAddress.toLowerCase()))
        System.out.println(tempStringList[5] + ", " + tempStringList[6] + ", " + tempStringList[7] + ", " + tempStringList[8]);

      else;
  }
  }
  public void loadPlayer(){
    Scanner scanner = new Scanner(System.in);
    int fromPlayer;
    int toPlayer;
    String player;
    int index = 1;
    try{
      FileReader fr = new FileReader("details.txt");
      BufferedReader br = new BufferedReader(fr);

      while((player = br.readLine()) != null){
        allPlayersArray.add(player);
      }
      br.close();
    }
    catch(IOException e){
      System.out.println("Error in file");
    }
    System.out.println("Input the range of players you would like to find....From:");
    fromPlayer = Integer.parseInt(scanner.nextLine());
    fromPlayer = fromPlayer -1;
    System.out.println("To:");
    toPlayer = Integer.parseInt(scanner.nextLine());
    toPlayer = toPlayer -1;

    for(int i = fromPlayer; i <= toPlayer; i ++){
      System.out.println(allPlayersArray.get(i));
      index = index + 1;
    }
  }
  }
