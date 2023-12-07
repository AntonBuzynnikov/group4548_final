package humanFriends.view;

import java.util.List;

import humanFriends.controllers.AnimalController;
import humanFriends.models.Camel;

public class CamelView implements AnimalView{
    private final AnimalController<Camel> controller;

    public CamelView(AnimalController<Camel> controller) {
        this.controller = controller;
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        controller.create(id, name, birthday, breed,commandList);
    }
    
}
