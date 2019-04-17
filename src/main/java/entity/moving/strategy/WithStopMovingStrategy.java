package entity.moving.strategy;

import java.util.List;
import entity.elevator.Elevator;

public class WithStopMovingStrategy implements MovingStrategy {
    @Override
    public void move(List<Integer> orders, List<Elevator> elevators) {
        for (Elevator elevator : elevators) {
            if (elevator.getElevatorState().isMoving) {

            }
        }
    }
}
