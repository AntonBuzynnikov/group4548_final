package humanFriends.services;

import java.util.List;

import humanFriends.models.Hamster;
import humanFriends.repositories.AnimalsRepository;

public class HamsterService implements AnimalService<Hamster>{
    private final AnimalsRepository<Hamster> humsterRepository;

    public HamsterService(AnimalsRepository<Hamster> humsterRepository) {
        this.humsterRepository = humsterRepository;
    }

    @Override
    public List<Hamster> getAll() {
        return humsterRepository.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        humsterRepository.create(new Hamster(id, name, birthday, breed, commandList));
    }
    
}
