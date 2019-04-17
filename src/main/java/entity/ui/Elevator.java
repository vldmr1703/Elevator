package entity.ui;

import java.awt.*;

public class Elevator {
    int ELEVATOR_WIDTH = 100;
    int ELEVATOR_HEIGHT = 100;
    int x = Elevators.WIN_WIDTH / 2;
    int y = Elevators.WIN_HEIGHT - ELEVATOR_HEIGHT;
    int yVelocity = 4;

    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, ELEVATOR_WIDTH, ELEVATOR_HEIGHT);
    }

    public void update() {
        y -= yVelocity;
        if (y < 0 || y > Elevators.WIN_HEIGHT) {
            yVelocity += yVelocity;
        }
    }
}
