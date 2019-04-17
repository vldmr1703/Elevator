package entity.elevator.state;

import entity.elevator.Elevator;
import entity.elevator.MoveDirection;

public class MoveElevatorState extends ElevatorState {

    private MoveDirection direction;

    public MoveElevatorState(Elevator elevator, MoveDirection direction) {
        super(elevator);
        this.direction = direction;
    }

    @Override
    public void openDoorCommand() {
        //do nothing
    }

    @Override
    public void closeDoorCommand() {
        elevator.closeDoor();
    }

    @Override
    public void moveCommand() {
        isMoving = true;
        elevator.startMoving();
    }
}
