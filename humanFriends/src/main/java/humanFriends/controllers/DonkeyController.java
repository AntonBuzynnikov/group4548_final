package humanFriends.controllers;

import java.util.List;

import humanFriends.models.Donkey;
import humanFriends.services.AnimalService;

public class DonkeyController implements AnimalController<Donkey>{
    private final AnimalService<Donkey> donkeyService;

    public DonkeyController(AnimalService<Donkey> donkeyService) {
        this.donkeyService = donkeyService;
    }

    @Override
    public List<Donkey> getAll() {
        return donkeyService.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        donkeyService.create(id, name, birthday, breed,commandList);
    }
    
}
