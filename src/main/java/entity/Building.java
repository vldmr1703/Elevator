package entity;

import java.util.List;

import entity.elevator.Elevator;
import entity.elevator.Floor;

public class Building {
    private List<Elevator> elevators;
    private List<Floor> floors;

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}
