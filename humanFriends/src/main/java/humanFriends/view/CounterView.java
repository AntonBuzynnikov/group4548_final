package humanFriends.view;

import humanFriends.controllers.CounterController;

public class CounterView {
    private final CounterController controller;

    public CounterView(CounterController controller) {
        this.controller = controller;
    }
    public void add(){
        controller.add();
    }
    public void printCount(){
        System.out.println(controller.getCount());
    }
}
