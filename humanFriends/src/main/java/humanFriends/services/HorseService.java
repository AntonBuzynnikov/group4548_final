package humanFriends.services;

import java.util.List;

import humanFriends.models.Horse;
import humanFriends.repositories.AnimalsRepository;

public class HorseService implements AnimalService<Horse>{
    private final AnimalsRepository<Horse> horseRepository;
    public HorseService(AnimalsRepository<Horse> horseRepository) {
        this.horseRepository = horseRepository;
    }
    @Override
    public List<Horse> getAll() {
        return horseRepository.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        horseRepository.create(new Horse(id, name, birthday, breed, commandList, 0));
    }

    
    
}
