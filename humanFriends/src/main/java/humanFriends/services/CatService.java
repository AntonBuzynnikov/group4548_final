package humanFriends.services;

import java.util.List;

import humanFriends.models.Cat;
import humanFriends.repositories.AnimalsRepository;
import humanFriends.repositories.CatRepository;

public class CatService implements AnimalService<Cat>{
    private final AnimalsRepository<Cat> catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public List<Cat> getAll() {
        return catRepository.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        catRepository.create(new Cat(id, name, birthday, breed, commandList));
    }
}
