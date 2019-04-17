package entity.elevator;

import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import entity.dispatcher.Dispatcher;
import entity.elevator.state.ElevatorState;
import entity.elevator.state.StopElevatorState;
import entity.mediator.Mediator;

public class Elevator {
    private int elevatorId;
    private int currentFloor;
    private double maxWeight;
    private ElevatorState elevatorState;
//    private Dispatcher dispatcher;
    private List<Person> people;
    private List<Integer> orders;
    private Mediator mediator;

    public Elevator(int elevatorId, Mediator mediator) {
        this.elevatorId = elevatorId;
        elevatorState = new StopElevatorState(this);
        this.mediator = mediator;
        orders = new ArrayList<>();
        currentFloor = 0;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<Integer> getOrders() {
        return orders;
    }

    public void openDoorCommand() {
        elevatorState.openDoorCommand();
    }

    public void closeDoorCommand() {
        elevatorState.closeDoorCommand();
    }

    public void moveCommand() {
        elevatorState.moveCommand();
    }

    public void startMoving(){
        int maxFloor = Collections.max(orders);
        for (int i = currentFloor; i < maxFloor; i++) {
            mediator.returnFloor(this, i);
            System.out.println(i);
            i++;
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    public void notifyPersons() {
    }

    public void closeDoor() {
        mediator.closeDoor(this);
    }

    public void openDoor() {
        mediator.openDoor(this);
    }
}
