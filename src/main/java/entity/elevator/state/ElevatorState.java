package entity.elevator.state;


import entity.elevator.Elevator;

public abstract class ElevatorState {

    protected Elevator elevator;
    public boolean isMoving;

    public ElevatorState(Elevator elevator) {
        this.elevator = elevator;
        isMoving = false;
    }

    public abstract void openDoorCommand();
    public abstract void closeDoorCommand();
    public abstract void moveCommand();
}
