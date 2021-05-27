package strategy.shapes;

public class Square implements Shape{

    @Override
    public void showShapeName() {
        System.out.println(this.getClass().getSimpleName());
    }
}
