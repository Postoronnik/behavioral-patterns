package mediator.mediator;

import mediator.components.Component;

public interface Mediator {
    void registerComponent(Component component);
    void useComponentA();
    void useComponentB();
}
