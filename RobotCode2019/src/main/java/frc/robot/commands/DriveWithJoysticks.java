package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Drivetrain;

import java.sql.SQLOutput;

import static frc.robot.Robot.drivetrain;
import static frc.robot.Robot.oi;

public class DriveWithJoysticks extends Command {
    public DriveWithJoysticks(){
        requires(drivetrain);
    }
    @Override
    protected void initialize(){
        System.out.println("Drive With Joysticks Enabled");

    }
    @Override
    protected void execute(){
        drivetrain.tankDrive(oi.getLeftSpeed(), oi.getRightSpeed());
    }

    @Override
    protected void end() {
        drivetrain.stop();
        System.out.println("Drive With Joysticks Terminated");
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
