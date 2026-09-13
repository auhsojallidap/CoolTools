import java.util.Scanner;
import java.util.Random;

public class CoolTools {



  static Scanner imp = new Scanner(System.in);


  public static void main (String[]args){
    boolean loop = false;
    String pin = "1234";  
    int attempt = 3;
    asciiArt();
    while (!loop){
      System.out.println("===SECURITY===");
      System.out.println("To exit program type Exit");
      System.out.print("PIN : ");
      
      String num1 = imp.next();

      if (num1.equals(pin)){
        System.out.println("==================");
        System.out.println("SUCCESSFULLY LOGIN");
        System.out.println("==================");
          loop = true;
          dashboard();
      } 
      else if (num1.equals("nigga")){
      System.out.println("");
      System.out.println("You a Nigga! Try Again :>");
      } 
      else if (num1.equals("Exit" || num1.equals("exit")){
        System.out.println("Exiting. . .");
        break;
      }
      else {
          attempt--;
          System.out.println("==================");
          System.out.println("ATTEMPT LEFT : "+attempt);
          System.out.println("==================");
          if (attempt <= 0){
            System.out.println("==== LOCKED =====");
            break;
          } else {
            System.out.println("INVALID PLEASE TRY AGAIN");
          }
      }
    }
  }




  
// DASHBOARD
  public static void dashboard(){
    boolean loop = false;
    while (!loop){

    dashboardChoice();
    System.out.print("CHOICE : ");

    //PREVENT ENTERING CHARACTERS THAT CAUSING CRASH
    while (!imp.hasNextInt()) {
    System.out.println("============================");
    System.out.println("INVALID! ENTER NUMBER ONLY.");
    System.out.println("============================");
    dashboardChoice();
    System.out.print("CHOICE : ");    
    imp.next();   
    }

    //input
    int choice = imp.nextInt();

    //PREVENT ENTERING 5 PATAAS 
    while (choice > 4){
    dashboardChoice();
    System.out.println("============================");
    System.out.println("INVALID! PICK 1 - 4 ONLY.");
    System.out.println("============================");      
    System.out.print("CHOICE : "); 
    while (!imp.hasNextInt()) {
    System.out.println("============================");
    System.out.println("INVALID! ENTER NUMBER ONLY.");
    System.out.println("============================");
    dashboardChoice();;
    System.out.print("CHOICE : ");    
    imp.next();   
    }    
    choice = imp.nextInt(); 
    } 
    


    if (choice == 1){
      calculator();
      loop = true;
    } else if(choice == 2){
      guessGame();
      loop = true;
    } else if (choice == 3){
    moneyChangeRate();
    }else if (choice == 4){
      System.out.println("==============");
      System.out.println("Exiting. . .");
      System.out.println("==============");
      break;
    }else {
      System.out.println("==============");
      System.out.println("INVALID");
      System.out.println("==============");
    }
  }
}
  



// CALCULATOR
  public static void calculator (){
    boolean loop = false;
    while (!loop){

    System.out.println("\n===CALCULATOR===");
  
    System.out.print("FIRST NUMBER : ");
    //PREVENT ENTERING CHARACTERS THAT CAUSING CRASH
    while (!imp.hasNextDouble()) {
    System.out.println("============================");
    System.out.println("INVALID! ENTER NUMBER ONLY.");
    System.out.println("============================");
    System.out.print("FIRST NUMBER : ");
    imp.next();   
   }   
    double num1 = imp.nextDouble();
 
    

    operationChoice();
    System.out.print("PICK OPERATION : ");

    //PREVENT ENTERING CHARACTERS THAT CAUSING CRASH
    while (!imp.hasNextInt()) {
    System.out.println("============================");
    System.out.println("INVALID! ENTER NUMBER ONLY.");
    System.out.println("============================");
    operationChoice();
    System.out.print("PICK OPERATION : ");    
    imp.next();   
    }

    //input
    int operation = imp.nextInt();

    //PREVENT ENTERING 5 PATAAS 
    while (operation > 4){
      operationChoice();
    System.out.println("============================");
    System.out.println("INVALID! PICK 1 - 4 ONLY.");
    System.out.println("============================");      
    System.out.print("PICK OPERATION : "); 
    while (!imp.hasNextInt()) {
    System.out.println("============================");
    System.out.println("INVALID! ENTER NUMBER ONLY.");
    System.out.println("============================");
    operationChoice();
    System.out.print("PICK OPERATION : ");    
    imp.next();   
    }    
    operation = imp.nextInt(); 
    }    

    //PREVENT ENTERING CHARACTERS THAT CAUSING CRASH
    System.out.print("SECOND NUMBER : ");
    while ( !imp.hasNextDouble()) {
    System.out.println("============================");
    System.out.println("INVALID! ENTER NUMBER ONLY.");
    System.out.println("============================");
    System.out.print("SECOND NUMBER : ");
    imp.next();   
   }   
    double num2 = imp.nextDouble();


    if (operation == 1){
      System.out.println("====================");
      System.out.println(num1 +" + "+ num2);
      System.out.println("====================");
      System.out.println("THE ANSWER IS : "+ (num1 + num2) );
      System.out.println("====================");
      dashboard();
      loop = true;
    } else if (operation == 2){
      System.out.println("====================");
      System.out.println(num1 +" - "+ num2);
      System.out.println("====================");
      System.out.println("THE ANSWER IS : " + (num1 - num2) );
      System.out.println("====================");
      dashboard();
      loop = true;
    } else if (operation == 3){
      System.out.println("====================");
      System.out.println(num1 +" x "+ num2);
      System.out.println("====================");
      System.out.println("THE ANSWER IS : "+ (num1 * num2) );
      System.out.println("====================");
      dashboard();
      loop = true;
    } else if (operation == 4){
      System.out.println("====================");
      System.out.println(num1 +" / "+ num2);
      System.out.println("====================");
      System.out.println("THE ANSWER IS : "+ (num1 / num2) );
      System.out.println("====================");
      dashboard();
      loop = true;
    } else {
      System.out.println("====================");
      System.out.println("INVALID TRY AGAIN.");
      System.out.println("====================");
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
    System.out.println("============================");
    while(!loop){

      
    System.out.print("GUESS : ");
    
    while (!imp.hasNextInt()) {
    System.out.println("============================");
    System.out.println("INVALID! ENTER NUMBER ONLY.");
    System.out.println("============================");
    dashboardChoice();
    System.out.print("GUESS : ");    
    imp.next();   
    } 

    //input
    int guess = imp.nextInt();


   
    
      if (guess > numberToGuess){
        System.out.println("=======");
        System.out.println("LOWER");
        System.out.println("=======");
      } else if(guess < numberToGuess){
        System.out.println("=======");
        System.out.println("HIGHER");
        System.out.println("=======");
      } else if (guess == numberToGuess){
        System.out.println("=================");
        System.out.println("CORRECT");
        System.out.println("THE NUMBER IS "+ numberToGuess);
        System.out.println("=================");
        loop = true;
        dashboard();
      } else {
        System.out.println("=========================");
        System.out.println("INVALID ENTER NUMBER ONLY");
        System.out.println("=========================");
      }
    }       
  }



public static void moneyChangeRate(){
  System.out.println("========");
  System.out.println("ON GOING");
  System.out.println("========");
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

  public static void operationChoice() {
    System.out.println("[1] == ADDTITION (+)");
    System.out.println("[2] == SUBSTRACTION (-)");
    System.out.println("[3] == MULTIPLICATION (*)");
    System.out.println("[4] == DIVISION (/)");   
  }
  public static void dashboardChoice() {
    System.out.println("===DASHBOARD===");
    System.out.println("Choose a tool to use");
    System.out.println("[1] == CALCULATOR");
    System.out.println("[2] == GUESS THE NUMBER");
    System.out.println("[3] == MONEY EXCHANGE RATE");
    System.out.println("[4] == EXIT");    
  }
    
  }
  