package entity.ui;

import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import entity.elevator.Elevator;
import entity.mediator.MainMediator;
import entity.mediator.Mediator;

public class Elevators extends JFrame {

    public final static int WIN_WIDTH = 600;
    public final static int WIN_HEIGHT = 700;
    private Mediator mediator;
    private Panel panel;


    public Elevators(Mediator mediator, Panel panel) {
        this.mediator = mediator;
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel = panel;
        add(panel);
        setVisible(true);

        ElevatorView view = new ElevatorView(mediator);
        mediator.registerView(view);
        entity.elevator.Elevator elevator = new entity.elevator.Elevator(1, mediator);
        elevator.getOrders().add(1);
        elevator.getOrders().add(2);
        elevator.getOrders().add(3);
        elevator.getOrders().add(4);
        elevator.getOrders().add(5);
        elevator.getOrders().add(6);
//        entity.elevator.Elevator elevator2 = new Elevator(1, mediator);
//        elevator2.getOrders().add(1);
//        elevator2.getOrders().add(2);
//        elevator2.getOrders().add(3);
//        elevator2.getOrders().add(4);
//        elevator2.getOrders().add(5);
//        elevator2.getOrders().add(6);
//        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ExecutorService service = Executors.newCachedThreadPool();
//        for(int i = 0; i < 10; i++) {
        service.submit(() -> {
            ScheduledExecutorService service1 = Executors.newSingleThreadScheduledExecutor();
            service1.scheduleAtFixedRate(() -> view.move(elevator), 1, 2, TimeUnit.SECONDS);
//                view.move(elevator);
        });

//        service.submit(() -> {
////            view.move(elevator2);
//            ScheduledExecutorService service1 = Executors.newSingleThreadScheduledExecutor();
//            service1.scheduleAtFixedRate(() -> view.move(elevator2), 2, 2, TimeUnit.SECONDS);
//        });

    }

    public static void main(String[] args) {
        Mediator mediator = new MainMediator();
        Panel panel = new Panel();
        new Elevators(mediator, panel);
    }
}
