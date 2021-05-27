package visitor.start.point;

import visitor.ConcreteVisitor;
import visitor.elements.Element;
import visitor.elements.ElementA;
import visitor.elements.ElementB;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConcreteVisitor concreteVisitor = new ConcreteVisitor();
        List<Element> elements = new ArrayList<>();
        elements.add(new ElementA());
        elements.add(new ElementB());

        for(Element element : elements){
            element.accept(concreteVisitor);
        }
    }
}
