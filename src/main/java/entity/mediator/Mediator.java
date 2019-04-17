package entity.mediator;

import java.util.List;

import entity.elevator.Elevator;
import entity.elevator.Floor;
import entity.elevator.MoveDirection;
import entity.elevator.Person;
import entity.ui.ElevatorView;
import entity.ui.FloorView;
import entity.ui.PersonView;

public interface Mediator {
    void move(Elevator elevator, MoveDirection direction);
    void returnFloor(Elevator elevator, int floor);
    void openDoor(Elevator elevator);
    void closeDoor(Elevator elevator);
    public void registerView(PersonView personView);
    public void registerView(FloorView floorView);
    public void registerView(ElevatorView elevatorView);
    void startMovingElevatorView();
    void addPeopleToElevatorOnFloor(List<Person> people, Elevator elevator, Floor floor);
    void removePeopleFromElevatorOn(List<Person> people, Elevator elevator);
    void addFloorToQueue(Elevator elevator);
    void addPeopleToFloor(List<Person> people, Floor floor);
}
