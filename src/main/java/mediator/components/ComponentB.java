package mediator.components;

import mediator.mediator.Mediator;

public class ComponentB implements Component{
    private Mediator mediator;

    public void componentB_Action(){
        System.out.println("Component B actions");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "CompB";
    }
}
