package mediator.mediator;

import mediator.components.Component;
import mediator.components.ComponentA;
import mediator.components.ComponentB;

public class ComponentConnector implements Mediator{

    private ComponentA componentA;
    private ComponentB componentB;

    @Override
    public void registerComponent(Component component) {
        switch (component.getName()){
            case "CompA" :
                componentA = (ComponentA) component;
                break;
            case "CompB" :
                componentB = (ComponentB) component;
                break;
        }
    }

    @Override
    public void useComponentA() {
        componentA.componentA_Action();
    }

    @Override
    public void useComponentB() {
        componentB.componentB_Action();
    }
}
