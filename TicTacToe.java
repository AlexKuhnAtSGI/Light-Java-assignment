//COMP 1006A/1406A Assignment 1 Problem 5
//By Alexander Kuhn, ID# 101023154, July 11, 2016
//Purpose: This program allows the user to play a game of tic-tac-toe with another player through the console
//Inputs: The main method takes no inputs, but the users will be prompted to enter their moves throughout the program; once a game has concluded, they may also choose to play another
//Outputs: This will output the tic-tac-toe board as well as prompts instructing the user on what to do next
//      - The board is printed every turn, including the turn the game begins and the board is wiped blank
//      - Every turn, it will inform the users whose move it is and ask them to take their turn
//      - If an invalid move is made, it will ask the user who made it to choose a different point on the grid
//      - When the game ends, it will output the winner (or more likely, congratulate both players on a draw) then ask if they want to play again

import java.util.Arrays;
import java.util.Scanner;
//Both of these are necessary, the first for printing the grid and the second for taking user input

public class TicTacToe {
  
  public static String[][] player1Turn (String[][] currentGrid) {
    //Purpose: Allows Player 1 (the 'x' player) to make their move, checks if their move is legal and prompts them to try again if it isn't
    //Inputs: Takes the state of the current tic-tac-toe grid from main, accepts Player 1's choice of move
    //Outputs: None save for an error message if Player 1 makes an illegal move
    //Returns: Sends the updated grid to main so that gameplay may continue
    int validChoice = 0;
    Scanner userMove = new Scanner(System.in);
    System.out.println("Player 1, make your move!");
    
    while (validChoice == 0) {
      int userChoice = userMove.nextInt();
      if ((userChoice >= 1) && (userChoice <= 3)) {
        if (currentGrid[0][userChoice - 1] == "-") {
          currentGrid[0][userChoice - 1] = "x";
          validChoice = 1;
         }
        else {
          System.out.println("That space has already been occupied.");
        }
      }
      else if ((userChoice >= 4) && (userChoice <= 6)) {
        if (currentGrid[1][userChoice - 4] == "-") {
          currentGrid[1][userChoice - 4] = "x";
          validChoice = 1;
         }
        else {
          System.out.println("That space has already been occupied.");
        }
      }
      else if ((userChoice >= 7) && (userChoice <= 9)) {
        if (currentGrid[2][userChoice - 7] == "-") {
          currentGrid[2][userChoice - 7] = "x";
          validChoice = 1;
         }
        else {
          System.out.println("That space has already been occupied.");
        }
      } 
      else {
        System.out.println("That input is invalid. Please try again!");
      }
    }
    
    return currentGrid;
  }
  
  public static String[][] player2Turn (String[][] currentGrid) {
    //Purpose: Allows Player 2 (the 'o' player) to make their move, checks if their move is legal and prompts them to try again if it isn't: identical to Player 1's turn, except with 'o' rather than 'x'
    //Inputs: Takes the state of the current tic-tac-toe grid from main, accepts Player 2's choice of move
    //Outputs: None save for an error message if Player 2 makes an illegal move
    //Returns: Sends the updated grid to main so that gameplay may continue
    int validChoice = 0;
    Scanner userMove = new Scanner(System.in);
    System.out.println("Player 2, make your move!");
    
    while (validChoice == 0) {
      int userChoice = userMove.nextInt();
      if ((userChoice >= 1) && (userChoice <= 3)) {
        if (currentGrid[0][userChoice - 1] == "-") {
          currentGrid[0][userChoice - 1] = "o";
          validChoice = 1;
         }
        else {
          System.out.println("That space has already been occupied.");
        }
      }
      else if ((userChoice >= 4) && (userChoice <= 6)) {
        if (currentGrid[1][userChoice - 4] == "-") {
          currentGrid[1][userChoice - 4] = "o";
          validChoice = 1;
         }
        else {
          System.out.println("That space has already been occupied.");
        }
      }
      else if ((userChoice >= 7) && (userChoice <= 9)) {
        if (currentGrid[2][userChoice - 7] == "-") {
          currentGrid[2][userChoice - 7] = "o";
          validChoice = 1;
         }
        else {
          System.out.println("That space has already been occupied.");
        }
      } 
      else {
        System.out.println("That input is invalid. Please try again!");
      }
    }
    
    return currentGrid;
  }
  
  public static int victoryChecker1 (String[][] currentGrid) {
    //Purpose: Checks to see if Player 1 has made the winning move after their turn by brute force: there are 8 victory conditions for either player, and this method checks to see if Player 1 has achieved any of them
    //Inputs: Takes the state of the current tic-tac-toe grid from main
    //Outputs: None, though a victory will result in a message from main congratulating Player 1 and a prompt to start over or exit
    //Returns: Tells main whether or not the game has ended in a Player 1 victory
    int victoryCondition = 0;
    if ((currentGrid[0][0] == "x") && (currentGrid[0][1] == "x") && (currentGrid[0][2] == "x")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[1][0] == "x") && (currentGrid[1][1] == "x") && (currentGrid[1][2] == "x")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[2][0] == "x") && (currentGrid[2][1] == "x") && (currentGrid[2][2] == "x")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][0] == "x") && (currentGrid[1][0] == "x") && (currentGrid[2][0] == "x")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][1] == "x") && (currentGrid[1][1] == "x") && (currentGrid[2][1] == "x")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][2] == "x") && (currentGrid[1][2] == "x") && (currentGrid[2][2] == "x")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][0] == "x") && (currentGrid[1][1] == "x") && (currentGrid[2][2] == "x")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][2] == "x") && (currentGrid[1][1] == "x") && (currentGrid[2][0] == "x")) {
      victoryCondition = 1;
    }
    return victoryCondition;
  }
  
  public static int victoryChecker2 (String[][] currentGrid) {
    //Purpose: Checks to see if Player 2 has made the winning move after their turn by brute force: there are 8 victory conditions for either player, and this method checks to see if Player 2 has achieved any of them
    //Inputs: Takes the state of the current tic-tac-toe grid from main
    //Outputs: None, though a victory will result in a message from main congratulating Player 2 and a prompt to start over or exit
    //Returns: Tells main whether or not the game has ended in a Player 2 victory
    int victoryCondition = 0;
    if ((currentGrid[0][0] == "o") && (currentGrid[0][1] == "o") && (currentGrid[0][2] == "o")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[1][0] == "o") && (currentGrid[1][1] == "o") && (currentGrid[1][2] == "o")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[2][0] == "o") && (currentGrid[2][1] == "o") && (currentGrid[2][2] == "o")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][0] == "o") && (currentGrid[1][0] == "o") && (currentGrid[2][0] == "o")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][1] == "o") && (currentGrid[1][1] == "o") && (currentGrid[2][1] == "o")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][2] == "o") && (currentGrid[1][2] == "o") && (currentGrid[2][2] == "o")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][0] == "o") && (currentGrid[1][1] == "o") && (currentGrid[2][2] == "o")) {
      victoryCondition = 1;
    }
    else if ((currentGrid[0][2] == "o") && (currentGrid[1][1] == "o") && (currentGrid[2][0] == "o")) {
      victoryCondition = 1;
    }
    return victoryCondition;
  }
  
  public static int tieChecker (String[][] currentGrid) {
    //Purpose: Checks after each turn to see if the grid is full; only triggers if the grid is full AND neither player has achieved one of their victory conditions
    //Inputs: Takes the state of the current tic-tac-toe grid from main
    //Outputs: None, though a victory will result in a message from main explaining the draw, as well a prompt to start over or exit
    //Returns: Tells main whether or not the game is tied
    int tieGame = 1;
    
    for (int i = 0; i < 3; i += 1) {
      for (int x = 0; x < 3; x += 1) {
        if (currentGrid[i][x] == "-") {
          tieGame = 0;
        }
      }
    }
    return tieGame;
  }
  
  public static void main (String[] args) {
    String[][] ticTacToeGrid = new String[3][3];
    ticTacToeGrid[0] = new String[3];
    ticTacToeGrid[1] = new String[3];
    ticTacToeGrid[2] = new String[3];
    int isGameOver = 0;
    int isGameTied = 1;
    int resetGame = 1;
    Scanner userReplay = new Scanner(System.in);
    String replayDecision = "";
    
    while (resetGame == 1) {
      //This loop is the entire game: a decision to replay the game bumps the player back to the top of the loop
      replayDecision = "";
      //This resets at the beginning of each game: otherwise, the player choosing to replay would result in an infinite loop
      for (int i = 0; i < 3; i += 1) {
        for (int x = 0; x < 3; x += 1) {
          ticTacToeGrid[i][x] = "-";
        }
      }
      //This loop draws a blank board at the start of a new game
      
      for (int i = 0; i < 3; i += 1) {
        System.out.println(Arrays.toString(ticTacToeGrid[i]));
      }
    
      while (isGameOver == 0) { 
        ticTacToeGrid = player1Turn(ticTacToeGrid);
        for (int i = 0; i < 3; i += 1) {
          System.out.println(Arrays.toString(ticTacToeGrid[i]));
        }
        isGameOver = victoryChecker1(ticTacToeGrid);
        isGameTied = tieChecker(ticTacToeGrid);
        if (isGameOver == 1) {
          System.out.println("Player 1 wins! Congratulations, Player 1!");
        }
        else if (isGameTied == 1) {
          System.out.println("Tie game! What a close match!");
          isGameOver = 1;
        }
        else if (isGameOver == 0) {
          ticTacToeGrid = player2Turn(ticTacToeGrid);
          for (int i = 0; i < 3; i += 1) {
            System.out.println(Arrays.toString(ticTacToeGrid[i]));
          }
          isGameOver = victoryChecker2(ticTacToeGrid);
          isGameTied = tieChecker(ticTacToeGrid);
          if (isGameOver == 1) {
            System.out.println("Player 2 wins! Congratulations, Player 2!");
          }
          else if (isGameTied == 1) {
            System.out.println("Tie game! What a close match!");
            isGameOver = 1;
          }
        }
      }
      while (((replayDecision.toLowerCase()).intern() != "yes") && ((replayDecision.toLowerCase()).intern() != "no")) {
        //intern() is necessary for all equivalence statements involving strings because strings aren't primitives in java and each one gets a different place on the heap
        System.out.println("Would you like to play again? ");
        replayDecision = userReplay.nextLine();
        if ((replayDecision.toLowerCase()).intern() == "yes") {
          isGameOver = 0;
        }
        else if ((replayDecision.toLowerCase()).intern() == "no") {
          resetGame = 0;
        }
      }
    }
  }
}