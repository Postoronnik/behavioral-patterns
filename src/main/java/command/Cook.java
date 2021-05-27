package command;

import command.order.Order;

public class Cook {
    public static void cook(Order order){
        System.out.println("Cooking order " + order.getName() + "...");
        System.out.println("Order " + order.getName() + " cooked");
    }
}
