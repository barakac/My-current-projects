package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;

public class LimitSwitch {
    private DigitalInput limitSwitch;

    public LimitSwitch(int port){
        limitSwitch = new DigitalInput(port);
    }
    public boolean isSwitchSet(){
        return !limitSwitch.get();
    }
}
