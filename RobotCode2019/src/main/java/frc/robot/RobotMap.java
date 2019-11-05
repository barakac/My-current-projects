/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //Stick Ports
    public static int leftStick = 0;
    public static int rightStick = 1;
    public static int liftStick = 2;
    public static int armStick = 3;

    //Motor Ports
    public static int mLeftA = 5;
    public static int mLeftB = 6;
    public static int mRightA = 1;
    public static int mRightB = 2;
    public static int mArm = 4;
    public static int mLiftWheels = 3;

    //Encoder Ports
    public static int eLeftA = 1;
    public static int eLeftB = 2;
    public static int eRightA = 7;
    public static int eRightB = 8;
    public static int eLiftA = 3;
    public static int eLiftB= 4;

    //Solonoids
    public static int pcmModule = 7;
    public static int sPTOA = 0;
    public static int sPTOB = 1;
    public static int sArmA = 2;
    public static int sArmB = 3;

    //Limit Switches
    public final static int[] LSFront = {3, 4, 5}; // Levels 0 (lowest) to 2 (highest)
    public final static int[] LSRear = {0, 1, 2}; // Levels 0 (lowest) to 2 (highest)
    public final static int[] armLimitSwitches = {9, 8, 7, 6}; // Levels 0 (lowest) to 3 (highest)

    //Misc.
    public static int armReleaseButton = 5;
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
