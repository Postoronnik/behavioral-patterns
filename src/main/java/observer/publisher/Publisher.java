package observer.publisher;


import observer.subsriber.Subscriber;

import java.util.HashSet;
import java.util.Set;

public class Publisher {

    private Set<Subscriber> subscribers = new HashSet<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void publishNewProduct(){
        notifySubscribers();
    }

    private void notifySubscribers(){
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }
}
