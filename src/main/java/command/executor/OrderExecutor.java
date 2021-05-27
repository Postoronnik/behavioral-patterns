package command.executor;

import command.Cook;
import command.order.Order;

public class OrderExecutor implements ExecutorService<Order>{

    @Override
    public void execute(Order order) {
        Cook.cook(order);
    }
}
