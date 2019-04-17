package entity.elevator.state;

import entity.elevator.Elevator;

public class BrokenElevatorState extends ElevatorState {

    public BrokenElevatorState(Elevator elevator) {
        super(elevator);
    }
    @Override
    public void openDoorCommand() {
        //do nothing
    }

    @Override
    public void closeDoorCommand() {
        //do nothing
    }

    @Override
    public void moveCommand() {
        //do nothing
    }
}
