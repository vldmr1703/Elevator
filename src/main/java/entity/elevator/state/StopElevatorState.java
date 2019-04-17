package entity.elevator.state;


import entity.elevator.Elevator;

public class StopElevatorState extends ElevatorState {

    public StopElevatorState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void openDoorCommand() {
        elevator.openDoor();
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
