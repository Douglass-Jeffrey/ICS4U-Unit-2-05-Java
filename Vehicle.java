/* 
* This class holds information about a vehicle.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-12-y14
*/

// declaring airplane class
public class Vehicle {

  // fields
  String plateNumber;
  String colour;
  int doorNum;
  int speed;
  int maxSpeed;
  
  /**
   * defining vehicle constructor and sets values to fields.
   */
  public Vehicle() {
    this.speed = 0;
    this.maxSpeed = 200;
    this.doorNum = 4;
    this.colour = ("");
    this.plateNumber = ("");
  
  }

  // setter for setting colour 
  public void setColour(String colourChoice) {
    this.colour = colourChoice;
  }

  // Method for getting colour 
  public String getColour() {
    
    return colour;
  }

  // setter for setting plateNum 
  public void setPlate(String plateNum) {
    this.plateNumber = plateNum;
  }

  // getter for getting plateNum 
  public String getPlateNum() {
    
    return plateNumber;
  }
  
  // Method for getting colour 
  public int currentSpeed() {
    
    return speed;
  }
  
  /**
   * Method for accellerating.
   */

  public int accelerate(int accCommand) {
    if (accCommand == 1) {
      this.speed = (speed + 20);
    } else if (accCommand == 2) {
      this.speed = (speed + 40);
    }
    if (speed > maxSpeed) {
      this.speed = maxSpeed; 
    }
    return speed;
  }
  
  /**
   * Method for decellerating.
   */

  public int brake(int brakeCommand) {
    if (brakeCommand == 1) {
      this.speed = (speed - 20);
    } else if (brakeCommand == 2) {
      this.speed = (speed - 40);
    }
    if (speed < 0) {
      this.speed = 0;
    }

    return speed;
  }
}