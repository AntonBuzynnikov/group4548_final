package humanFriends.services;

import java.util.List;

import humanFriends.models.Donkey;
import humanFriends.repositories.AnimalsRepository;

public class DonkeyService implements AnimalService<Donkey>{
    private final AnimalsRepository<Donkey> donkeyRepository;

    public DonkeyService(AnimalsRepository<Donkey> donkeyRepository) {
        this.donkeyRepository = donkeyRepository;
    }

    @Override
    public List<Donkey> getAll() {
        return donkeyRepository.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        donkeyRepository.create(new Donkey(id, name, birthday, breed, commandList, 0));
    }
    
    
}
