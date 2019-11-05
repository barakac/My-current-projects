package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriveWithJoysticks;
public class Drivetrain extends Subsystem {
    private TalonSRX mLeftA = new TalonSRX(RobotMap.mLeftA);
    private TalonSRX mLeftB = new TalonSRX(RobotMap.mLeftB);
    private TalonSRX mRightA = new TalonSRX(RobotMap.mRightA);
    private TalonSRX mRightB = new TalonSRX(RobotMap.mRightB);
    public Drivetrain() {
        System.out.println("");
    }
    public void initDefaultCommand(){
        setDefaultCommand(new DriveWithJoysticks() );
    }
    public void moveLeftMotors(double speed) {
        mLeftA.set(ControlMode.PercentOutput, speed);
        mLeftB.set(ControlMode.PercentOutput, speed);
    }
    public void moveRightMotors(double speed) {
        mRightA.set(ControlMode.PercentOutput, -speed);
        mRightB.set(ControlMode.PercentOutput, -speed);
    }
    public void tankDrive(double left, double right) {
        moveLeftMotors(left);
        moveRightMotors(right);
    }
    public void stop() {
        tankDrive(0,0);
    }
}
