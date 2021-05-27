package visitor.elements;

import lombok.Getter;
import visitor.Visitor;

@Getter
public class ElementA implements Element{
    private String data = "Element A data";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
