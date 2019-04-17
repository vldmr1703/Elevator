package entity.ui;

import entity.elevator.Elevator;
import entity.elevator.MoveDirection;
import entity.mediator.Mediator;

public class ElevatorView extends View {

    public ElevatorView(Mediator mediator) {
        super(mediator);
    }

    public void move(Elevator elevator) {
        mediator.move(elevator, MoveDirection.DOWN);
    }

    public void showFloor(Elevator elevator, int floor) {

    }
}
