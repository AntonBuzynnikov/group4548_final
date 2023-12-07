package humanFriends.view;

import java.util.List;

import humanFriends.controllers.AnimalController;
import humanFriends.models.Hamster;

public class HamsterView implements AnimalView{
    private final AnimalController<Hamster> controller;
    public HamsterView(AnimalController<Hamster> controller) {
        this.controller = controller;
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        controller.create(id, name, birthday, breed,commandList);
    }
    
}
