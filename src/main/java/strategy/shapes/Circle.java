package strategy.shapes;

public class Circle implements Shape{

    @Override
    public void showShapeName() {
        System.out.println(this.getClass().getSimpleName());
    }
}
