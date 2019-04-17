package entity.mediator;

import java.util.List;

import entity.elevator.Elevator;
import entity.elevator.Floor;
import entity.elevator.MoveDirection;
import entity.elevator.Person;
import entity.elevator.state.MoveElevatorState;
import entity.ui.ElevatorView;
import entity.ui.Elevators;
import entity.ui.FloorView;
import entity.ui.PersonView;

public class MainMediator implements Mediator {

    private ElevatorView elevatorView;
    private FloorView floorView;
    private PersonView personView;
    private Elevators elevators;

    public void registerView(PersonView personView) {
        this.personView = personView;
    }

    public void registerView(FloorView floorView) {
        this.floorView = floorView;
    }

    public void registerView(ElevatorView elevatorView) {
        this.elevatorView = elevatorView;
    }

    @Override
    public void move(Elevator elevator, MoveDirection direction) {
        elevator.setElevatorState(new MoveElevatorState(elevator, direction));
        elevator.moveCommand();
    }

    @Override
    public void startMovingElevatorView() {
//        elevators.star
    }

    @Override
    public void returnFloor(Elevator elevator, int floor) {
//        elevators.
    }

    @Override
    public void openDoor(Elevator elevator) {
        elevator.openDoor();
    }

    @Override
    public void closeDoor(Elevator elevator) {
        elevator.closeDoor();
    }

    @Override
    public void addPeopleToElevatorOnFloor(List<Person> people, Elevator elevator, Floor floor) {
        people.forEach(person -> elevator.getPeople().add(person));
    }

    @Override
    public void removePeopleFromElevatorOn(List<Person> people, Elevator elevator) {
        people.forEach(person -> elevator.getPeople().remove(person));
    }

    @Override
    public void addFloorToQueue(Elevator elevator) {

    }

    @Override
    public void addPeopleToFloor(List<Person> people, Floor floor) {

    }
}
