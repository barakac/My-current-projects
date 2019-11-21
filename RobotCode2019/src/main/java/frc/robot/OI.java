/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
    //makes the joysticks less sensitive
    private final double joystickBuffer = .07;

    //declare joysticks
    private Joystick jLeft = new Joystick(0);
    private Joystick jRight = new Joystick(1);
    public Joystick jArm =  new Joystick (3);

    //gets the speed from joystick 0 to control left side wheels
    public double getLeftSpeed() {
        if ((Math.abs(jLeft.getY()) < joystickBuffer)) {
            return 0;
        } else {
           return jLeft.getY();
        }
    }

    //gets the speed from joystick 1 to control right side wheels
    public double getRightSpeed(){
        if ((Math.abs(jRight.getY()) < joystickBuffer)) {
            return 0;
        } else {
            return jRight.getY();
        }
    }

    //gets the speed from joystick 3 to control the lift
    public double getArmSpeed(){
        if ((Math.abs(jArm.getY()) < joystickBuffer)){
            return 0;
        } else{
            return jArm.getY();
        }
    }
    //same as getLiftSpeed() but will only send positive numbers
    public double getArmPosSpeed(){
        if ((Math.abs(jArm.getY())) < joystickBuffer){
            return 0;
        } else if (jArm.getY() > 0){
            return jArm.getY();
        } else {
            return 0;
        }
    }
    public double getArmNegSpeed(){
        if ((Math.abs(jArm.getY()) < joystickBuffer)){
            return 0;
        } else if (jArm.getY() < 0){
            return jArm.getY();
        } else {
            return 0;
        }
    }
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}

