package visitor;


import visitor.elements.ElementA;
import visitor.elements.ElementB;

public interface Visitor {
    void visit(ElementA elementA);
    void visit(ElementB elementB);
}
