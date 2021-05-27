package observer.start.point;

import observer.publisher.Publisher;
import observer.subsriber.Subscriber;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.subscribe(new Subscriber());
        publisher.subscribe(new Subscriber());
        publisher.subscribe(new Subscriber());
        publisher.subscribe(new Subscriber());

        publisher.publishNewProduct();
    }
}
