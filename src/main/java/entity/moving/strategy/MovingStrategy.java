package entity.moving.strategy;

import java.util.List;

import entity.elevator.Elevator;

public interface MovingStrategy {
    void move(List<Integer> orders, List<Elevator> elevators);
}
