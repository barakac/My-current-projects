package frc.robot.commands.Arm;
import edu.wpi.first.wpilibj.command.Command;
import static frc.robot.Robot.arm;
import static frc.robot.Robot.oi;
public class ArmWithJoysticks extends Command {
    public ArmWithJoysticks(){
        requires(arm);
    }
    @Override
    protected void initialize(){
        System.out.println("Lift Arm with Joysticks Enabled");
    }
    @Override
    protected void execute(){
        if (arm.armLimitSwitches[0].isSwitchSet()){
            arm.moveArm(oi.getArmPosSpeed());
        } else {
            arm.moveArm(oi.getArmSpeed());
        }
        System.out.println("Speed: " + oi.jArm.getY());
        System.out.println("Limit Switch 9 value: " + arm.armLimitSwitches[0]);
    }
    @Override
    protected void end() {
        arm.stop();
        System.out.println("Lift Arm with Joysticks Terminated");
    }
    @Override
    protected boolean isFinished() {
        return false;
    }
}
