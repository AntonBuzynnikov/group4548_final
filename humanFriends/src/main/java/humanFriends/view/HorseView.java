package humanFriends.view;

import java.util.List;

import humanFriends.controllers.AnimalController;
import humanFriends.models.Horse;

public class HorseView implements AnimalView{
    private final AnimalController<Horse> controller;

    public HorseView(AnimalController<Horse> controller) {
        this.controller = controller;
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        controller.create(id,name, birthday, breed,commandList);
    }
    
}
