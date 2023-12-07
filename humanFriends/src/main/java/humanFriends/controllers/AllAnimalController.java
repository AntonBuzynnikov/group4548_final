package humanFriends.controllers;

import java.util.List;

import humanFriends.models.Animal;
import humanFriends.services.AllAnimalsService;

public class AllAnimalController {
    private final AllAnimalsService allAnimalsService;

    public AllAnimalController(AllAnimalsService allAnimalsService) {
        this.allAnimalsService = allAnimalsService;
    }
    public List<? extends Animal> getAllAnimals(){
        return allAnimalsService.getAll();
    }
    public int getMaxId(){
        return allAnimalsService.getMaxId();
    }
    public List<String> getCommands(int id){
        return allAnimalsService.getCommands(id);
    }
    public void createNewCommand(int id, String command){
        allAnimalsService.createNewCommand(id, command);
    }
}
