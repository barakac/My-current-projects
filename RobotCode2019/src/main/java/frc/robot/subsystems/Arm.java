package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.LimitSwitch;
import frc.robot.RobotMap;
import frc.robot.commands.Arm.ArmWithJoysticks;
public class Arm extends Subsystem {
    private TalonSRX armMotor = new TalonSRX(RobotMap.mArm);
    public LimitSwitch[] armLimitSwitches = new LimitSwitch[4];
    public Arm(){
        System.out.println("");
        for(int i = 0; i < armLimitSwitches.length; i++){
            armLimitSwitches[i] = new LimitSwitch(RobotMap.armLimitSwitches[i]);
        }
    }
    protected void initDefaultCommand() {
        setDefaultCommand(new ArmWithJoysticks() );
    }
    public void moveArm(double speed) {
        armMotor.set(ControlMode.PercentOutput, speed);
    }
    public void stop() {
        moveArm(0);
    }
}
