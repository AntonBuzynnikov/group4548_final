package humanFriends.controllers;

import java.util.List;

import humanFriends.models.Cat;
import humanFriends.services.AnimalService;

public class CatController implements AnimalController<Cat>{
    private final AnimalService<Cat> catService;

    public CatController(AnimalService<Cat> catService) {
        this.catService = catService;
    }

    @Override
    public List<Cat> getAll() {
        return catService.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        catService.create(id, name, birthday, breed,commandList);
    }
}
