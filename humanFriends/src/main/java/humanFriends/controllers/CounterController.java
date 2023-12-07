package humanFriends.controllers;

import humanFriends.services.CounterService;

public class CounterController {
    private final CounterService counter;

    public CounterController(CounterService counter) {
        this.counter = counter;
    }
    public void add(){
        counter.setCount(counter.getCount()+1);
    }
    public int getCount(){
        return counter.getCount();
    }
}
