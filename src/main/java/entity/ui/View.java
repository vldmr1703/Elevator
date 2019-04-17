package entity.ui;

import entity.mediator.Mediator;

public abstract class View {
    Mediator mediator;

    public View(Mediator mediator) {
        this.mediator = mediator;
    }
}
