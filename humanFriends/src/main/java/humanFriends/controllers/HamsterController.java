package humanFriends.controllers;

import java.util.List;

import humanFriends.models.Hamster;
import humanFriends.services.AnimalService;

public class HamsterController implements AnimalController<Hamster>{
    private final AnimalService<Hamster> hamsterService;

    public HamsterController(AnimalService<Hamster> hamsterService) {
        this.hamsterService = hamsterService;
    }

    @Override
    public List<Hamster> getAll() {
        return hamsterService.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        hamsterService.create(id, name, birthday, breed,commandList);
    }
    
}
