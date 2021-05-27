package command.start.point;

import command.executor.ExecutorService;
import command.executor.OrderExecutor;
import command.order.Order;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = new OrderExecutor();
        executor.execute(new Order("Meat"));
    }
}
