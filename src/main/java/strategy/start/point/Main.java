package strategy.start.point;

import strategy.shapes.Circle;
import strategy.shapes.Shape;
import strategy.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.showShapeName();

        shape = new Square();
        shape.showShapeName();
    }
}
