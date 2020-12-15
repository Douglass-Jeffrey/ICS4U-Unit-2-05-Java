/*
* This program receives and outputs information about a car when prompted
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-12-014
*/

// Import the Scanner class
import java.util.Scanner;

public class VehicleMain {

  /**
  * This program receives and outputs information about a car when prompted.
  */

  public static void main(String[] args) {

    // create scanner object
    Scanner userInput = new Scanner(System.in);

    // creates automobile 1
    Vehicle automobile1 = new Vehicle();
    // create automobile 2
    Vehicle automobile2 = new Vehicle();

    // ensures that user inputs only proper values
    try {

      // CAR 1
///////////////////////////////////////////////////////////////////////////////
      // variables for later
      int accCommand = 0;
      int brakeCommand = 0;

      // accepts input on Car colour
      System.out.println("Enter the colour you wish your car to be: ");
      String colourChoice = userInput.nextLine();
      automobile1.setColour(colourChoice);
      
      // accepts input on Plate numbers
      System.out.println("Enter the license plate number of your car: ");
      String plateNum = userInput.nextLine();
      automobile1.setPlate(plateNum);
      
      // initiates car loop
      while (true) {

        // tells user options
        System.out.println();
        System.out.println("Welcome to your Vehicle! If you wish to check the "
                           + "plate numbers, type plates, if you wish to check "
                           + "the colour, type colour, if you wish to accelerat"
                           + "e or decelerate, type either of those. If you wis"
                           + "h to check your current speed, type speed. Type s"
                           + "top if you wish to stop the program. What would"
                           + " you like to do? ");
        
        String userChoiceLow = userInput.nextLine();
        
        // converts choice to upper
        String userChoice = userChoiceLow.toUpperCase();
        
        // if user wants plates
        if (userChoice.equals("PLATES")) {
          System.out.println("Plate number: " + automobile1.getPlateNum());
          
          // if user wants colour
        } else if (userChoice.equals("COLOUR")) {
          System.out.println("Colour: " + automobile1.getColour());
          
          // if user wants speed
        } else if (userChoice.equals("SPEED")) {
          System.out.println("Current speed: " + automobile1.currentSpeed()
                             + "km/h");
          //if user wants to accelerate
        } else if (userChoice.equals("ACCELERATE")) {
          System.out.println("Would you like soft or hard acceleration? (soft/"
                             + "hard) :");
          String accChoiceLow = userInput.nextLine();
          
          // convert to upper
          String accChoice = accChoiceLow.toUpperCase();
          // if user chooses hard accel
          if (accChoice.equals("HARD")) {
            accCommand = 2;
            System.out.println("Current speed: " + automobile1.accelerate(
                               accCommand) + "km/h");
            // if user chooses soft accel
          } else if (accChoice.equals("SOFT")) {
            accCommand = 1;
            System.out.println("Current speed: " + automobile1.accelerate(
                               accCommand) + "km/h");
          // if user chooses something else
          } else {
            System.out.println("Invalid acceleration selected");
          }
          // if user wants to decelerate
        } else if (userChoice.equals("DECELERATE")) {
          System.out.println("Would you like soft or hard deceleration? (soft/"
                             + "hard) :");
          String brakeChoiceLow = userInput.nextLine();

          //convert to uppeer
          String brakeChoice = brakeChoiceLow.toUpperCase();
          
          // if user chooses hard decel
          if (brakeChoice.equals("HARD")) {
            brakeCommand = 2;
            System.out.println("Current speed: " 
                               + automobile1.brake(brakeCommand) + "km/h");
            
            // if user chooses soft decel
          } else if (brakeChoice.equals("SOFT")) {
            brakeCommand = 1;
            System.out.println("Current speed: " 
                               + automobile1.brake(brakeCommand) + "km/h");
          // if user chooses something else
          } else {
            System.out.println("Invalid deceleration selected");
          }
        //if user types stop, stop!
        } else if (userChoice.equals("STOP")) {
          System.out.println("Stopping...");
          break;
        //if user inputs invalid commands stop
        } else {
          System.out.println("Invalid Command");
        }
      }

      //CAR 2
////////////////////////////////////////////////////////////////////////////////

      // asks user if they want to do a second car
      System.out.println("Would you like to take out a second car? (yes/no)");
      String car2QuestionLow = userInput.nextLine();
      String car2Question = car2QuestionLow.toUpperCase();
      
      if (car2Question.equals("YES")) {
        
        // variables for later
        int accCommand2 = 0;
        int brakeCommand2 = 0;
  
        // accepts input on Car colour
        System.out.println("Enter the colour you wish your car to be: ");
        String colourChoice2 = userInput.nextLine();
        automobile2.setColour(colourChoice);
  
        // accepts input on Plate numbers
        System.out.println("Enter the license plate number of your car: ");
        String plateNum2 = userInput.nextLine();
        automobile2.setPlate(plateNum);
  
        // initiates car loop
        while (true) {
  
          // tells user options
          System.out.println();
          System.out.println("Welcome to Vehicle 2! If you wish to check the"
                             + " plate numbers, type plates, if you wish to "
                             + "check the colour, type colour, if you wish to "
                             + "accelerate or decelerate, type either of "
                             + "those. If you wish to check your current speed,"
                             + " type speed. Type stop if you wish to stop the "
                             + "program. What would you like to do? ");
          
          String userChoiceLow2 = userInput.nextLine();
          
          // converts choice to upper
          String userChoice2 = userChoiceLow2.toUpperCase();
          
          // if user wants plates
          if (userChoice2.equals("PLATES")) {
            System.out.println("Plate number: " + automobile2.getPlateNum());
            
            // if user wants colour
          } else if (userChoice2.equals("COLOUR")) {
            System.out.println("Colour: " + automobile2.getColour());
            
            // if user wants speed
          } else if (userChoice2.equals("SPEED")) {
            System.out.println("Current speed: " + automobile2.currentSpeed()
                               + "km/h");
            //if user wants to accelerate
          } else if (userChoice2.equals("ACCELERATE")) {
            System.out.println("Would you like soft or hard acceleration? (soft"
                               + "/hard) :");
            String accChoiceLow2 = userInput.nextLine();
            
            // convert to upper
            String accChoice2 = accChoiceLow2.toUpperCase();
            // if user chooses hard accel
            if (accChoice2.equals("HARD")) {
              accCommand2 = 2;
              System.out.println("Current speed: " + automobile2.accelerate(
                                 accCommand2) + "km/h");
              // if user chooses soft accel
            } else if (accChoice2.equals("SOFT")) {
              accCommand2 = 1;
              System.out.println("Current speed: " + automobile2.accelerate(
                                 accCommand2) + "km/h");
            // if user chooses something else
            } else {
              System.out.println("Invalid acceleration selected");
            }
            // if user wants to decelerate
          } else if (userChoice2.equals("DECELERATE")) {
            System.out.println("Would you like soft or hard deceleration? (soft"
                               + "/hard) :");
            String brakeChoiceLow2 = userInput.nextLine();
  
            //convert to uppeer
            String brakeChoice2 = brakeChoiceLow2.toUpperCase();
            
            // if user chooses hard decel
            if (brakeChoice2.equals("HARD")) {
              brakeCommand2 = 2;
              System.out.println("Current speed: " 
                                 + automobile2.brake(brakeCommand2) + "km/h");
              
              // if user chooses soft decel
            } else if (brakeChoice2.equals("SOFT")) {
              brakeCommand2 = 1;
              System.out.println("Current speed: " 
                                 + automobile2.brake(brakeCommand2) + "km/h");
            // if user chooses something else
            } else {
              System.out.println("Invalid deceleration selected");
            }
          //if user types stop, stop!
          } else if (userChoice2.equals("STOP")) {
            System.out.println("Stopping...");
            break;
          //if user inputs invalid commands stop
          } else {
            System.out.println("Invalid Command");
          }
        }
      } else {
        System.out.println("You did not want to do a second car");
      }

    // catch for general problems like bad user inputs
    } catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}
