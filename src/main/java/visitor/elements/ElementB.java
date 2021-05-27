package visitor.elements;

import lombok.Getter;
import visitor.Visitor;

@Getter
public class ElementB implements Element{
    private String data = "Element B data";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
