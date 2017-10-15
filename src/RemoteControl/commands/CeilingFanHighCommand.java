package RemoteControl.commands;

import RemoteControl.receivers.CeilingFan;

public class CeilingFanHighCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH: 	ceilingFan.high(); break;
            case CeilingFan.MEDIUM: ceilingFan.medium(); break;
            case CeilingFan.LOW: 	ceilingFan.low(); break;
            default: 				ceilingFan.off(); break;
        }
    }
}
