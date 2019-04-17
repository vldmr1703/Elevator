package entity.dispatcher;

import entity.Building;
import entity.moving.strategy.MovingStrategy;
import entity.ui.View;

public class Dispatcher {
    private View view;
    private Building building;
    private MovingStrategy movingStrategy;

    public Dispatcher(Building building, MovingStrategy movingStrategy) {
        this.building = building;
        this.movingStrategy = movingStrategy;
    }

    public void commandHandle(String command) {
        switch (command) {
            case "":
        }
    }
}
