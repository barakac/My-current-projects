package frc.robot.commands;

import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;

import static frc.robot.Robot.drivetrain;

public class DriveForDistance extends Command {
    private double initialDistance;
    private boolean endStatus = false;
    private double distance;
    private double speed;
    private double distancePerPulse;
    private Encoder eRight = new Encoder(2, 3, false, CounterBase.EncodingType.k4X);
    public DriveForDistance(double distance, double speed) {
        requires(drivetrain);
        this.distance = distance;
        this.speed = speed;
        eRight.setDistancePerPulse(distancePerPulse);
    }
    @Override
    protected void initialize() {
        System.out.println("Drive For Time Enabled");
    }
    @Override
    protected void execute() {
        drivetrain.tankDrive(this.speed, this.speed);
        if (eRight.getDistance() > this.distance) {
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
