package humanFriends.services;

import java.util.ArrayList;
import java.util.List;

import humanFriends.models.Animal;
import humanFriends.models.Camel;
import humanFriends.models.Cat;
import humanFriends.models.Dog;
import humanFriends.models.Donkey;
import humanFriends.models.Hamster;
import humanFriends.models.Horse;

public class AllAnimalsService {
    private final AnimalService<Dog> dogService;
    private final AnimalService<Cat> catService;
    private final AnimalService<Hamster> hamsterService;
    private final AnimalService<Horse> horseService;
    private final AnimalService<Donkey> donkeyService;
    private final AnimalService<Camel> camelService;
    public AllAnimalsService(AnimalService<Dog> dogService, AnimalService<Cat> catService,AnimalService<Hamster> hamsterService,AnimalService<Horse> horseService,AnimalService<Donkey> donkeyService,AnimalService<Camel> camelService) {
        this.dogService = dogService;
        this.catService = catService;
        this.hamsterService = hamsterService;
        this.horseService = horseService;
        this.donkeyService = donkeyService;
        this.camelService = camelService;
        
    }

    public List<Animal> getAll(){
        List<Animal> animals = new ArrayList<>(dogService.getAll());
        List<Animal> cats = new ArrayList<>(catService.getAll());
        List<Animal> hamsters = new ArrayList<>(hamsterService.getAll());
        List<Animal> horses = new ArrayList<>(horseService.getAll());
        List<Animal> donkeys = new ArrayList<>(donkeyService.getAll());
        List<Animal> camels = new ArrayList<>(camelService.getAll());
        animals.addAll(cats);
        animals.addAll(hamsters);
        animals.addAll(horses);
        animals.addAll(donkeys);
        animals.addAll(camels);
        return animals;
    }
    public int getMaxId(){
        int maxID = -1;
        List<Animal> animals = getAll();
        for(Animal animal: animals){
            if(animal.getId() > maxID){
                maxID = animal.getId();
            }
        }
        if(maxID>=0){
            return maxID;
        } else{
            return 0;
        }
    }
    /*
    Вот этот весь метод кажется мне огромным костылём.
    Пробовал через instanceof - не получилось.
    Есть вариант подругому из списка типа Animal достать отдельные объекты
    с типами наследников?
    */
    public List<String> getCommands(int id){ 
        List<Animal> animals = getAll();
        List<String> commands = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getId()==id) {
                for (Dog dog : dogService.getAll()) {
                    if(dog.getId() == id){
                        commands = dog.getCommands();
                    }
                }
                for (Cat cat : catService.getAll()) {
                    if(cat.getId() == id){
                        commands = cat.getCommands();
                    }
                }
                for (Hamster hamster : hamsterService.getAll()) {
                    if(hamster.getId() == id){
                        commands = hamster.getCommands();
                    }
                }
                for (Horse horse : horseService.getAll()) {
                    if(horse.getId() == id){
                        commands = horse.getWorkPerformed();
                    }
                }
                for (Donkey donkey : donkeyService.getAll()) {
                    if(donkey.getId() == id){
                        commands = donkey.getWorkPerformed();
                    }
                }
                for (Camel camel : camelService.getAll()) {
                    if(camel.getId() == id){
                        commands = camel.getWorkPerformed();
                    }
                }
            }
        }
        return commands;
    }
    public void createNewCommand(int id, String command){
        List<String> commands = getCommands(id);
        commands.add(command);
    }
}
