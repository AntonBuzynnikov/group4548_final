package humanFriends.controllers;

import java.util.List;

import humanFriends.models.Camel;
import humanFriends.services.AnimalService;

public class CamelController implements AnimalController<Camel>{
    private final AnimalService<Camel> camelService;

    public CamelController(AnimalService<Camel> camelService) {
        this.camelService = camelService;
    }

    @Override
    public List<Camel> getAll() {
        return camelService.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        camelService.create(id, name, birthday, breed,commandList);
    }
    
}
