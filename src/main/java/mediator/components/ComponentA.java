package mediator.components;

import mediator.mediator.Mediator;

public class ComponentA implements Component{
    private Mediator mediator;

    public void componentA_Action(){
        System.out.println("Component A actions");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "CompA";
    }
}
