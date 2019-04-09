import java.util.*;
import java.io.*;

public class Instruments{
  Scanner scanner = new Scanner(System.in);
  boolean exit = false;

  public static void main(String[] args){
    Instruments menu = new Instruments();
    menu.runmenu();
    }
    public void runmenu(){
      while(exit == false){
        System.out.println("(1) Add a new brass instrument");
        System.out.println("(2) Add a new percussion instrument");
        System.out.println("(3) Add a new String instrument");
        System.out.println("(4) Add a new Woodwind instrument");
        System.out.println("(5) Show all instruments");
        System.out.println("(6) Exit");
        PickMenu();

      }
    }
    public void PickMenu(){
      int choice = 0;
      try{
        System.out.print("Enter your choice: ");
        choice = Integer.parseInt(scanner.nextLine());
      }
      catch(NumberFormatException e){
        System.out.print("\nPlease enter a number between 1-6");
      }
      switch(choice){
        case 1:
        System.out.println("\nAdd a new brass instrument");
        // Brass newBrass = new Brass();
        // newBrass.brassInput();
        break;

        case 2:
        System.out.println("\nAdd a new percussion instrument");
        Percussion newPercussion = new Percussion();
        newPercussion.percussionInput();
        break;

        case 3:
        System.out.println("\nAdd a new string instrument");

        break;

        case 4:
        System.out.println("\nAdd a new woodwind instrument");

        break;

        case 5:
        System.out.println("\n Show all instruments");

        break;

        case 6:
        System.out.println("\nExit");
        exit = true;
        break;

        default:
        System.out.println("\nEnter a number between 1-6\n");
        break;
      }
    }
  }
