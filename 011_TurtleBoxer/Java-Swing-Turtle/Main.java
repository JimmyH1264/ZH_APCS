import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    World World1 = new World();
    //Instantiate a turtle. Name it as you wish.
    Turtle wBenny = new Turtle(World1);
    wBenny.forward(60);
    //this let turtle move forward
    wBenny.turnRight();
    //this let turtle turn right
    wBenny.forward(60);
    wBenny.turnRight();
    wBenny.forward(60);
    Turtle qKen = new Turtle(World1);
    //make a turtle named qken
    qKen.turnRight();
    qKen.forward(60);
    qKen.turnRight();
    qKen.forward(60);
    qKen.turnRight();
    qKen.forward(60);
    Turtle iZen = new Turtle(World1);
    iZen.turnRight();
    iZen.turnRight();
    iZen.forward(60);
    iZen.turnRight();
    iZen.forward(60);
    iZen.turnRight();
    iZen.forward(60);
    Turtle oPin = new Turtle(World1);
    oPin.turnRight();
    oPin.turnRight();
    oPin.turnRight();
    oPin.forward(60);
    oPin.turnRight();
    oPin.forward(60);
    oPin.turnRight();
    oPin.forward(60);

    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___|

    */



    World1.setVisible(true);
    //Finally, set the world to be visible with a boolean...
  }
}
