import java.util.Scanner;
import java.util.Random;

public class CoolTools {
  static Scanner imp = new Scanner(System.in);
  public static void main (String[]args){
    boolean loop = false;
    String pin = "1234";  

    asciiArt();
    while (!loop){
      System.out.println("");
      System.out.println("===SECURITyyyyY===");
       System.out.print("PIN : ");
      String num1 = imp.next();

      if (num1.equals(pin)){
        System.out.println("");
        System.out.println("SUCCESSFULLY LOGIN");
        System.out.println("");
          loop = true;
          dashboard();
      } 
      else if (num1.equals("nigga")){
      System.out.println("");
      System.out.println("You a Nigga! Try Again :>"); 
      } else {
          System.out.println("");
          System.out.println("INVALID PLEASE TRY AGAIN");
      }
    }
  }

// DASHBOARD
  public static void dashboard(){
    boolean loop = false;
    while (!loop){
    System.out.println("");
    System.out.println("===DASHBOARD===");
    System.out.println("Choose a tool to use");
    System.out.println("[1] == CALCULATOR");
    System.out.println("[2] == GUESS THE NUMBER");
    System.out.println("[3] == Exit");
    System.out.print("CHOICE : ");
    int choice = imp.nextInt();
    if (choice == 1){
      calculator();
      loop = true;
    } else if(choice == 2){
      guessGame();
      loop = true;
    } else if (choice == 3){
      System.out.println("Exiting. . .");
      break;
    }else {
      System.out.println("INVALID");
    }
  }
}
  
// CALCULATOR
  public static void calculator (){
    boolean loop = false;
    while (!loop){
    System.out.println("");
    System.out.println("===CALCULATOR===");
    System.out.print("FIRST NUMBER : ");
    double num1 = imp.nextDouble();
    System.out.println("");
    System.out.println("[1] == ADDTITION (+)");
    System.out.println("[2] == SUBSTRACTION (-)");
    System.out.println("[3] == MULTIPLICATION (*)");
    System.out.println("[4] == DIVISION (/)");
    System.out.print("PICK OPERATION : ");
    int operation = imp.nextInt();
    System.out.println("");
    System.out.print("SECOND NUMBER : ");
    double num2 = imp.nextDouble();
    if (operation == 1){
      System.out.println("");
      System.out.println("THE ANSWER IS : "+ (num1 + num2) );
      dashboard();
      loop = true;
    } else if (operation == 2){
      System.out.println("");
      System.out.println("THE ANSWER IS : " + (num1 - num2) );
      dashboard();
      loop = true;
    } else if (operation == 3){
      System.out.println("");
      System.out.println("THE ANSWER IS : "+ (num1 * num2) );
      dashboard();
      loop = true;
    } else if (operation == 4){
      System.out.println("");
      System.out.println("THE ANSWER IS : "+ (num1 / num2) );
      dashboard();
      loop = true;
    } else {
      System.out.println("");
      System.out.println("TRY AGAIN");
    }
  }

}

// GUESSING GAME 
  public static void guessGame(){
    Random rand = new Random();
    int numberToGuess = rand.nextInt(100) + 1;
    boolean loop = false ;
    System.out.println("===GUESS THE NUMBER GAME ===");
    System.out.println("GUESS THE NUMBER 1 TO 100");
    while(!loop){
    System.out.print("GUESS : ");
    int guess = imp.nextInt();
      if (guess > numberToGuess){
        System.out.println("LOWER");
      } else if(guess < numberToGuess){
        System.out.println("HIGHER");
      } else if (guess == numberToGuess){
        System.out.println("=====CORRECT=====");
        System.out.println("THE NUMBER IS "+ numberToGuess);
        loop = true;
        dashboard();
      }
    }       
  }

public static void a (){
  
}
  

// ASCII ART
  public static void asciiArt(){
    String asciiArt = """
             ____ ___   ___  _     _____ ___   ___  _     ____  
            / ___/ _ \\ / _ \\| |   |_   _/ _ \\ / _ \\| |   / ___| 
           | |  | | | | | | | |     | || | | | | | | |  |___ \\ 
           | |__| |_| | |_| | |___  | || |_| | |_| | |______) |
            \\____\\___/ \\___/|_____| |_| \\___/ \\___/|_____|____/ 
            """;

        System.out.println(asciiArt);
    }
  }
  