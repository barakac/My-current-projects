package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import static frc.robot.Robot.drivetrain;
import static frc.robot.Robot.oi;

public class DriveForTime extends Command {
    private double initialTime;
    private boolean endStatus = false;
    private double time;
    private double speed;
    public DriveForTime(double time, double speed) {
        requires(drivetrain);
        this.time = time*1000;
        this.speed = speed;
    }
    @Override
    protected void initialize() {
        System.out.println("Drive For Time Enabled");
        this.initialTime = System.currentTimeMillis();
    }
    @Override
    protected void execute() {
        drivetrain.tankDrive(this.speed, this.speed);
        if (System.currentTimeMillis()-initialTime > this.time) {
            endStatus = true;
        }

    }

    @Override
    protected void end() {
        drivetrain.stop();
        System.out.println("Drive With Joysticks Terminated");
    }
    @Override
    protected boolean isFinished() {
        return endStatus;
    }
}
