package mediator.start.point;

import mediator.components.ComponentA;
import mediator.components.ComponentB;
import mediator.mediator.ComponentConnector;
import mediator.mediator.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ComponentConnector();
        mediator.registerComponent(new ComponentA());
        mediator.registerComponent(new ComponentB());

        mediator.useComponentA();
        mediator.useComponentB();
    }
}
